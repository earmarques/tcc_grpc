## gRPC no NodeJS :green_apple:

Temos as seguintes etapas para fazer:


**[1. asdf](./README.md#1-asdf)**<br>
[1.1. Instalar o plugin asdf do NodeJS](#11-instalar-o-plugin-asdf-do-nodejs)<br>
[1.2. Instalar uma versão do NodeJS](#12-instalar-uma-vers%C3%A3o-do-nodejs)<br>

**[2. NodeJS](./README.md#2-nodejs)**<br>
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

#### 1.1. Instalar o plugin asdf do NodeJS

```
asdf plugin add nodejs https://github.com/asdf-vm/asdf-nodejs.git
```

#### 1.2. Instalar uma versão do NodeJS

Nós estamos usando a versão 18.7.0 do NodeJS. Para evitar problemas, recomendamos usar a mesma versão. 

```
asdf install nodejs 18.7.0
```
📌 _O que está destacado a seguir é opcional_.
> Se quiser instalar a versão mais recente o comando é:
> ```
> asdf install nodejs latest
> ```
> Poderá ter qualquer versão disponível entre as listadas:
> ```
> asdf list all nodejs
> ```
> Poderá configurar a última versão globalmente, como versão default:
> ```
> asdf global nodejs latest
> ```

Mas aqui nós vamos utilizar localmente(tcc_grpc/js_grpc/) neste repositório a versão específica.
```
asdf local nodejs 18.7.0
```
---

### 2. NodeJS

O NodeJS traz a reboque em seu binário o gerenciador de pacotes npm. Primeiro precisamos inicializá-lo.

#### 2.1 Inicializar o projeto

```
npm init -y
```

#### 2.2. Instalar dependências

Nós vamos precisar de duas bibliotecas, vamos pedir para o npm buscá-las para nós.

- **@grpc/grpc-js**
```
npm i @grpc/grpc-js
```
- **@grpc/proto-loader**
```https://github.com/earmarques/tcc_grpc/tree/main/dart_grpc#grpc-no-dart-bird
npm i @grpc/proto-loader
```

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
  int32 max = 2;https://github.com/earmarques/tcc_grpc/tree/main/dart_grpc#grpc-no-dart-bird
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

![Aplicação clienhttps://github.com/earmarques/tcc_grpc/tree/main/dart_grpc#grpc-no-dart-birdte e servidor se comunicando através do framework gRPC](images/js_grpc_test.png "Aplicação cliente e servidor se comunicando através do framework gRPC")<br>
_Figura 2: Aplicação cliente e servidor se comunicando através do framework gRPC_

<br><br>

[:arrow_up: Topo](#grpc-no-nodejs-green_apple)

<br><br>
