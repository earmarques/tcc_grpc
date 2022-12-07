## gRPC no Dart :bird:

Temos as seguintes etapas para fazer:


**[1. asdf](./README.md#)**<br>
[1.1. Instalar o plugin asdf do Dart]()<br>
[1.2. Instalar uma versão do Dart]()<br>

**[2. Dart](./README.md)**<br>
[2.1 Inicializar o projeto](#21-inicializar-o-projeto)<br>
[2.2. Instalar dependências](#22-instalar-depend%C3%AAncias)<br>

**[3. Criar os arquivos](./README.md#3-criando-os-arquivos-serverjs-clientjs-e-o-contrato-sorteioproto)**<br>
[3.1. sorteio.proto](#31-sorteioproto)<br>
[3.2 server.js](#32-serverjs)<br>
[3.3 client.js](#33-clientjs)<br>

**[4. Executar teste](./README.md#4-executar-teste)**

---

📌 Para uma fundamentação teórica e explicação do código, recomendamos a leitura da [Wiki do projeto](https://github.com/earmarques/tcc_grpc/wiki). Aqui vamos cuidar apenas dos comandos para fazer o gRPC funcionar com JavaScript.

---

### 1. asdf

#### 1.1. Instalar o plugin asdf do Dart

```mkdir -p protos;
touch protos/aluno.proto
asdf plugin-add dart https://github.com/patoconnor43/asdf-dart.git
```

#### 1.2. Instalar uma versão do NodeJS

```
asdf install dart 2.17.6
```

#### 1.3. Tornar a versão global

Faremos da 2.17.6 a versão global para todos os projetos na máquina
```
asdf global dart 2.17.6
```

Checar instalação 
```
dart --version
```
`> Dart SDK version: 2.17.6 (stable) (Tue Jul 12 12:54:37 2022 +0200) on "linux_x64"`

---

### 2. Dart

#### 2.1 Plugin _Protocol Buffer Compiler_

Instalar o plugin do compilador dos arquivos `.proto`. 

```
dart pub global activate protoc_plugin
```

#### 2.2 Atualizar o PATH

Precisamos atualizar o PATH para que o protoc possa encontrar o plugin que acabamos de instalar.

```
export PATH="$PATH":"$HOME/.pub-cache/bin"
```
Estrutura projeto console Dart
Este comando modifica temporariamente o PATH, apenas para o shell que estivermos usando. Se quisermos evitar ter de executarmos o comando anterior toda vez que formos compilar arquivos .proto para o Dart, devemos acrescentar essa linha de comando ao final do arquivo ~/.bashrc.

![Path para o plugin do compilador _protobuff_](images/dart_plugin_path.png "Path para o plugin do compilador _protobuff_")<br>
_Figura 1: Path para o plugin do compilador _protobuff_ no ~/.bashrc_

Nosso shell é bash, executar `source ~/.bashrc` carrregará as novas configurações. Se usa outro shell, feche e abra o terminal novamente.

#### 2.3 Criar uma aplicação de console

Dentro do diretório `tcc_grpc`, execute: 
```
dart create --template=console-simple dart_grpc
```

O comando cria uma aplicação de console no diretório dart_grpc com a estrutura da figura 2.

![Estrutura projeto console Dart](images/console_dart.png "Estrutura projeto console Dart")<br>
_Figura 2: Estrutura projeto console Dart_

#### 2.2. Adicionar dependências

Vamos adicionar duas dependências ao arquivo pubspec.yaml: [`grpc: ^3.1.0`](https://pub.dev/packages/grpc) e [`protobuf: ^2.1.0`](https://pub.dev/packages/protobuf).

- Editar `pubspec.yaml`

![Dependências no pubspec.yaml](images/dart_pubspec.yaml.png "Dependências no pubspec.yaml")<br>
_Figura 3\: Dependências no pubspec.yaml_

- Instalar dependências

```
dart pub get
```

### 3. Contratos *.proto

Os arquivos .proto de definições de serviços ficarão no diretório `protos`.

#### 3.1. Arquivos _Protobuff_ 

O Dart consumirá a API Golang, logo, o Dart precisa do mesmo contrato, da mesma interface especificada pelo arquivo [LINK TODO -> gerador_id.proto]() presente no repositório da API Go. A outra definição de serviço
108
​
109
---protoc -I=protos/ --dart_out=grpc:protos/ protos/ aluno.proto gerador_id.proto \
110
google/protobuf/empty.proto
111
 é `aluno.proto` onde vamos declarar todas as operações elementares do banco de dados.

```
mkdir -p protos;
cp ../go_grpc/protos/gerador_id.proto protos/ ;
touch protos/aluno.proto
```
O arquivo `aluno.proto` deve estar como na listagem 1.

```proto
// aluno.proto
syntax = "proto3";

import "google/protobuf/empty.proto";

service CrudAlunoService {
    rpc CreateAluno(Aluno) returns (Aluno);
    rpc GetAllAlunos(google.protobuf.Empty) returns (Alunos);
    rpc GetAluno(AlunoId) returns (Aluno);
    rpc DeleteAluno(AlunoId) returns (google.protobuf.Empty) {};
    rpc EditAluno(Aluno) returns (Aluno) {};
}

message AlunoId {
    int32 id = 1;
}

message Aluno {
    int32 id = 1;
    string nome = 2;    
}

message Alunos {
    repeated Aluno alunos = 1;
}
```
_Listagem 1: aluno.proto_


#### 3.2. Compilar os arquivos `.proto` 

Temos três _protobuff_ para compilar, `aluno.proto`, `gerador_id.proto` e o `empty.proto`, que está importado nos dois primeiros, nos quais o usamos como tipo de `message` para procedimentos que não recebem argumentos, como em `CrudAlunoService#GetAllAlunos` e `GeradorID#GerarId`, ou nos procedimentos que retornam vazio (`void`), como em `CrudAlunoService#DeleteAluno`.

Na pasta `dart_grpc`, compile os arquivos com o comando:

```
protoc -I=protos/ --dart_out=grpc:protos/ \
protos/aluno.proto \
protos/gerador_id.proto \
google/protobuf/empty.proto
```
Teremos os vários códigos `.dart` gerados da figura 4.

![Código Dart gerado a partir das especificações de serviços .proto](images/dart_proto_code.png "Código Dart gerado a partir das especificações de serviços .proto")<br>
_Figura 4: Código Dart gerado a partir das especificações de serviços .proto_

---

### 4. Códigos cliente e servidor

Vamos fazer uma abordagem cautelosa cartesiana - análise e síntese, conquistando passo a passo cada recurso de que precisamos para depois formarmos o todo de que precisamos. Primeiro vamos fazer um cliente-servidor apenas 
em Dart do nosso `CrudAlunoService` (`client.dart` e `server.dart`). Depois vamos fazer um cliente Dart consumir o `service` Golang `GeradorID` (client_id.dart). Por fim, vamos fazer um cliente-servidor Dart cujo servidor de serviço é por sua vez cliente de outro serviço em Golang. Esses códigos estarão abrigados na pasta `dart_grpc/bin`.    




<br><br>

[:arrow_up: Topo](#grpc-no-nodejs-green_apple)

<br><br>
