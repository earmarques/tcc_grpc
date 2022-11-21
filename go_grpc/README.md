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

#### Instalar o plugin asdf do Golang

Podemos encontrar o plugin de qualquer linguagem procurando no google por: _asdf plugin `nomeDaLinguagem`_. Entrar no github do plugin e seguir as instruções; para o [Golang](https://github.com/kennyp/asdf-golang), o comando é:

```
asdf plugin-add golang https://github.com/kennyp/asdf-golang.git
```

#### Instalar uma versão do Golang

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

Precisamos instalar dois plugins do Golang para compilar os arquivos _protobuff_.
```
go install google.golang.org/protobuf/cmd/protoc-gen-go
```

```
go install google.golang.org/grpc/cmd/protoc-gen-go-grpc
```




