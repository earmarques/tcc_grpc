## gRPC no Java :coffee:

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

📌 Para uma fundamentação teórica e explicação do código, recomendamos a leitura da [Wiki do projeto](https://github.com/earmarques/tcc_grpc/wiki). 
Aqui vamos cuidar apenas de fazer o gRPC funcionar com o Java.

---

### 1. Eclipse

Em nossas pesquisas sobre gRPC no Java, todos os autores que encontramos usavam alguma ferramenta gráfica com um dos dois gerenciadores de dependências Java, Maven ou Gradle.
O mais recorrente e que nos pareceu mais simples, talvez pela nossa familiaridade com a ferramenta, foi o Eclipse IDE. Portanto, não vamos usar o NeoVim e o asdf, vamos utilizar o Eclipse com o Maven.

#### 1.1. Instalar o Eclipse

Instalar o Eclipse não tem segredo. Pode utilizar o gerenciador de aplicativos da sua distribuição linux ou [baixar do site](https://www.eclipse.org/downloads/) o instalador caso use Windows. Nós optamos por baixar o arquivo `eclipse-inst-jre-linux64.tar.gz`. É preciso descompactar este arquivo. Haverá dentro do diretório `eclipse-installer/` o arquivo **`eclipse-inst`** que deve ser executado. Se tiver problemas de permissão, clique com botão da direita, selecione propriedades e dê permissão de execução, ou então no terminal, digite: `chmod +x eclipse-inst`. Nós instalamos a versão para Web 4.26.0. 

#### 1.2. Configurar o Eclipse


