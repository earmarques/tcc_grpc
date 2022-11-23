## gRPC no Golang 🦫

No Golang a configuração é mais burocrática que no JavaScript.

Temos três coisas a fazer:

1. Instalar o plugin asdf do Goland e com ele instalar o Golang;
2. Configurar o ambiente do projeto;
3. Criar os arquivos 

Para uma fundamentação teórica e explicação do código, recomendamos a leitura da [Wiki do projeto](https://github.com/earmarques/tcc_grpc/wiki). Aqui vamos cuidar apenas dos comandos para fazer o gRPC funcionar Golang.

Estando dentro do dirtório tcc_grpc/ execute os comandos para criar o diretório do go e entrar nele.

```
mkdir go_grpc; cd go_grpc;
```



### 1.asdf

Podemos encontrar o plugin de qualquer linguagem procurando no google por: _asdf plugin `nomeDaLinguagem`_. Entrar no github do plugin e seguir as instruções. Fizemos isso para o `golang`e o compilador protoc

#### Protocol Buffer Compile 
Para compilar um arquivo `protocol buffer`, nós precisamos instalar o compilador e depois os plugins específicos da linguagem golang. O _protocol buffer compiler_ usaremos o asdf para instalá-lo.

##### Instalar o plugin 
```
asdf plugin-add protoc https://github.com/paxosglobal/asdf-protoc.git
```
##### Instalar a versão 

```
asdf install protoc 3.20.3
```

#### Golang
##### Instalar o plugin
```
asdf plugin-add golang https://github.com/kennyp/asdf-golang.git
```

##### Instalar uma versão do Golang

Podemos ver todas as versões disponíveis com:
```
asdf list all golang
```

Intalamos a versão 1.19:
```
asdf install golang 1.19
```

### 2. Golang


#### Plugins Go

Um dos grandes benefícios do gRPC é o fato dele gerar códigos que abstraem e cuidam de toda a comunicação pela rede. Para tanto, cada linguagem tem plugins específicos. No caso do Golang, precisamos instalar dois plugins para gerar códigos para nós a partir dos arquivos _.proto_.
```
go install google.golang.org/protobuf/cmd/protoc-gen-go@v1.28.1
```
```
go install google.golang.org/grpc/cmd/protoc-gen-go-grpc@v1.2
```

#### Atualizar PATH

Precisamos atualizar o PATH para incluir os pacotes baixados do golang, para que o `protoc` possa encontrar os plugins que acabamos de instalar.
```
export PATH="$PATH:$(go env GOPATH)/bin"
```
Este comando modifica temporariamente o PATH, apenas para o shell que estiver usando. Se quiser evitar ter de executar o camando anterior toda vez que for compilar arquivos _.proto_ em Go, então acrescente a linha de comando ao final do arquivo ~/.bashrc.

[!GOPATH no ~/.bashrc](images/gopath.png)



#### Reshim

A documentação do [plugin](https://github.com/kennyp/asdf-golang#when-using-go-get-or-go-install) recomenda fazer um reshim toda vez que fizermos um `go get` ou `go install`, então, por prudência:
```
asdf reshim golang
```

#### Inicializar o projeto

O comando `go mod init` cria um arquivo `go.mod` e rastreia as dependências do projeto. Nós chamaremos nosso módulo como o subrepositório do tcc `go mod init github.com/earmarques/tcc_grpc/go_grpc`, mas recomendamos ao leitor usar o seu próprio git, ou um nome qualquer, como:

```
go mod init meu_modulo_grpc
```


### 3. Criar os arquivos

Vamos organizar os arquivos em pastas separadas, uma para arquivos proto, outra para o servidor e outra para o cliente.

#### _Protobuff_
Criamos a pasta proto e nela o arquivo `gerador_id.proto`:

```
mkdir protos; 
touch protos/gerador_id.proto;
```

Editamos o arquivo para ter o conteúdo:

```proto
// gerador_id.proto

syntax = "proto3";

import "google/protobuf/empty.proto";

option go_package = "github.com/earmarques/tcc_grpc/go_grpc";
package geradorid;

service GeradorID {
    rpc GerarId(google.protobuf.Empty) returns (IdReply) {}
}

message IdReply {
    int32 goId = 1;
}
```

##### Compilar o arquivo proto

```

```



