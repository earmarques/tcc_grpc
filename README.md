# Estudo Prático da Interoperabilidade de API's com gRPC

Nós construímos um sistema distribuído de microsserviços fazendo a interoperabilidade de APIs implementadas em quatro linguagens de programação diferentes (`Golang`, `Dart`, `Java` e `Javacript`), utilizando o gRPC para a comunicação entre os sistemas de APIs.

## Apresentação

Este foi o nosso Trabalho de Conclusão do Curso _Análise e Desenvolvimento de Sistema_ apresentado à Fatec de São José de Rio Preto/SP em junho de 2022. Nós estávamos interessandos em compreender a tecnologia do gRPC, um novo estilo arquitetural, mais rápido e eficiente, com menores _payload_, tráfego e latência, bidirecional e nativamente poliglota. 

Para "sentirmos" como se dá a comunicação de sistemas distribuídos no gRPC, nós fizemos quatro API's escritas em linguagens de programação diferentes conversarem entre si. Duas delas são mais recentes, `Golang` e `Dart`, e duas já a bastante tempo no mercado, `JavaScript` e `Java`. O que a aplicação faz em si é bem simples, no entanto, o nosso foco está na comunicação, na interoperabilidade poliglota de API's oferecida pelo gRPC.

Na Figura 1 vemos a essência da arquitetura implementada. A fábula é a seguinte: a aplicação Java é um _head hunter_, um caça-talentos que precisa fornecer uma lista de 10 programadores a uma empresa que irá desenvolver um novo projeto. A aplicação cliente Java possui internamente uma lista de 51 contatos para selecionar os 10 necessários ao projeto. A seleção está automatizada para selecionar os 10 amostrados aleatoriamente da lista interna de 51. Nada usual na vida real, mas foi a estória que criamos para contextualizar nossos testes. 

<img width=70% alt="Arquitetura implementada" title="Arquitetura implementada" src="images/arquiterura.jpeg"><br>
_Figura 1: Arquitetura implementada_

Para saber qual programador selecionar, o cliente Java consome uma API que oferece o serviço de sortear números inteiros dentro dos limites de um intervalo. Para tanto, a aplicação Java fornece um intervalo de 0 a 50 à API JavaScript e fica fazendo chamadas remotas ao servidor NodeJS até preencher a quantidade desejada. 

Depois, o Java precisa persistir os programadores selecionados em um banco de dados para que a empresa possa consultar o seu time de desenvolvedores. Uma API implementada em Dart fará a emulação de um banco de dados (_mock_). Dart oferece um serviço de API contendo todos os métodos das operações elementares de um banco de dados: criar, atualizar, buscar por id, listar todos e apagar. O serviço Dart salva os dados apenas em memória. 

Quando inserimos dados em um banco relacional, usualmente criamos um número sequencial para o id. Dart é o servidor de banco de dados do Java, entretanto, a fim de testarmos a comunicação entre APIs, fizemos a API Dart por sua vez ser cliente de outra API, escrita em Golang. A API Golang faz o papel de gerador de chave primária, fornecendo números sequências a cada chamada remota para que o Dart possa usá-los como identificador único da entidade Programador, cuja aplicação Java lhe solicitou para salvar no banco.<br>
Dessa forma, temos quatro sistemas implementados em linguagens distintas se comunicando, fornecendo e consumindo serviços de API com o gRPC.

## Execução



