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

```
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

Vamos adcionar duas dependências ao arquivo pubspec.yaml: [`grpc: ^3.1.0`](https://pub.dev/packages/grpc) e [`protobuf: ^2.1.0`](https://pub.dev/packages/protobuf).

![Dependências no pubspec.yaml](images/dart_pubspec.yaml.png "Dependências no pubspec.yaml")<br>
_Figura 3\: Dependências no pubspec.yaml_

---

### 3. Criando os arquivos `server.js`, `client.js` e o contrato `sorteio.proto`

Vamos criar os três arquivos que iremos precisar.

```
touch sorteio.proto server.js client.js
```
Vamos editar os arquivos para que fiquem como nas listagens 1, 2 e 3.

#### 3.1. sorteio.proto
 
```proto
//sorteio.proto
syntax = "proto3";

option java_package = "com.java_grpc";

service SorteioService {
  rpc SortearNumero (IntervaloRequest) returns (SorteadoResponse) {}
}

message IntervaloRequest {
  int32 min = 1;
  int32 max = 2;
}ME.md

message SorteadoResponse {
  int32 numero = 1;
}

```
_Listagem 1: sorteio.proto_

#### 3.2. server.js

```js
// server.js
const grpc = require("@grpc/grpc-js");
const protoLoader = require("@grpc/proto-loader");
const PROTO_PATH = "./sorteio.proto";ME.md

con####st protoObject = protoLoader.loadSync(PROTO_PATH);
const sorteioDefinition = grpc.loadPackageDefinition(protoObject);
const SorteioService = sorteioDefinition.SorteioService;
https://github.com/earmarques/tcc_grpc/tree/main/js_grpc
const server = new grpc.Server();
server.addService(SorteioService.service, {sortearNumero});


function sortearNumero({ request:{min, max} }, callback) {
  let sorteado = bingo(min, max);
  sorteadoResponse = {numero: sorteado};
  console.log('🍏 API JavaScript - Número Sortedado:' + sorteado);
  return callback(null, sorteadoResponse);
}

function bingo(min, max) {
  return Math.floor( Math.random() * (max - min + 1) ) + min;
};

const endereco = 'localhost';
const porta = '50053';
const pontoAcesso = endereco + ':' + porta;

server.bindAsync(
  pontoAcesso,
  grpc.ServerCredentials.createInsecure(),
  (error, port) => {
    console.log("\n🍏 Servidor rodando no ponto de acesso " + pontoAcesso);
    server.start();
  }
);
```
_Listagem 2: server.js_


#### 3.3. client.js
```js
// client.js
const grpc = require("@grpc/grpc-js");
const protoLoader = require("@grpc/proto-loader");
const PROTO_PATH = "./sorteio.proto";
const packageDefinition = protoLoader.loadSync(PROTO_PATH);
const sorteioStub = grpc.loadPackageDefinition(packageDefinition);
const SorteioService = sorteioStub.SorteioService;
const endereco = 'localhost';
const porta = '50053';
const pontoAcesso = endereco + ':' + porta;

const client = new SorteioService(
  pontoAcesso,
  grpc.credentials.createInsecure()ME.md
);

let intervaloRequest = {min: 0, max:50}
Aplicação cliente consumindo microserviço e servidor respondendo às requisições com gRPC
client.sortearNumero(intervaloRequest, (error, responseSorteado) => {  
  if (!error) {
    //console.log("Sucesso!!!");
    let msg = responseSorteado.numero;
    console.log('🍏 número sorteado:' + msg.toString() + '\n');
  }else {
    console.log(error);
  }
});
```
_Listagem 3: client.js_

---

### 4. Executar teste

Vamos subir o servidor com o comando:
```
node server.js
```
Veremos o servidor escutando requisições na porta 50053.

![Servidor NodeJS gRPC ouvindo na porta 50053](images/node_serving.png "Servidor NodeJS gRPC ouvindo na porta 50053")<br>
_Figura 1: Servidor NodeJS gRPC ouvindo na porta 50053_

Deixaremos o servidor escutando em um terminal e abriremos outro, no mesmo diretório, para executar o client.js que irá consumir a API.

```
node client.js
```

A cada execução do comando acima, a aplicação cliente JS envia uma requisição para o servidor usando o _framework_ gRPC. O servidor gera um número entre 0 e 50 e o envia para a aplicação cliente, que recebe o valor e imprime na tela.  

![Aplicação cliente e servidor se comunicando através do framework gRPC](images/js_grpc_test.png "Aplicação cliente e servidor se comunicando através do framework gRPC")<br>
_Figura 2: Aplicação cliente e servidor se comunicando através do framework gRPC_

<br><br>

[:arrow_up: Topo](#grpc-no-nodejs-green_apple)

<br><br>
