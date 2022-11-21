## 🦫: gRPC no Golang

Temos três coisas a fazer:

1. Instalar o plugin asdf do Goland e com ele instalar o Golang;
2. Usar a CLI npm do NodeJS para instalar as dependência;
3. Criar os arquivos 

Para uma fundamentação teórica e explicação do código, recomendamos a leitura da [Wiki do projeto](https://github.com/earmarques/tcc_grpc/wiki). Aqui vamos cuidar apenas dos comandos para fazer o gRPC funcionar Golang.

Estando dentro do dirtório tcc_grpc/ execute os comandos para criar o diretório do go e entrar nele.

```
mkdir go_grpc; cd go_grpc;
```



### 1.asdf

#### Instalar o plugin asdf do NodeJS

Podemos encontrar o plugin de qualquer linguagem procurando no google por _asdf plugin `nomeDaLinguagem`_. Entrar no github do plugin e seguir as instruções; para o Go, o comando é:

```
asdf plugin-add golang https://github.com/kennyp/asdf-golang.git
```
