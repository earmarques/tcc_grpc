
### asdf
Estando dentro da pasta tcc_grpc/js_grpc/, execute os comandos.

#### Instalar o plugin asdf do Node

```
asdf plugin add nodejs https://github.com/asdf-vm/asdf-nodejs.git
```

#### Instalar uma versão do NodeJS

Nós estamos usando a versão 18.7.0 do NodeJS. Para evitar problemas, recomendamos usar a mesma versão. 

```
asdf install nodejs 18.7.0
```

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
asdf global nodejs 18.7.0
```




