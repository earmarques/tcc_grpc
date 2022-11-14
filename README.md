# Estudo Prático da Interoperabilidade de API's com GRPC


Este foi o nosso Trabalho de Conclusão do Curso _Análise e Desenvolvimento de Sistema_ apresentado à Fatec de São José de Rio Preto/SP em junho de 2022. Nós estávamos interessandos em compreender a tecnologia do gRPC, um novo estilo arquitetural, mais rápido e eficiente, com menores tráfego e latência, bidirecional e nativamente poliglota. 

Para "sentirmos" como se dá a comunicação de sistemas distribuídos no gRPC, nós fizemos quatro API's escritas em linguagens de programação diferentes conversarem entre si. Duas delas são mais recentes, Golang e Dart, e duas já a bastante tempo no mercado, JavaScript e Java. A aplicação em si é bem simples, mas o nosso foco está na comunicação, na interoperabilidade poliglota de API's oferecida pelo gRPC.

Para o estudo prático nós construímos um sistema distribuído de microsserviços fazendo a interoperabilidade de sistemas implementados em quatro linguagens de programação diferentes, utilizando para a comunicação e interoperabilidade dos sistemas o gRPC. 
Na Figura 1 vemos a essência da arquitetura implementada. A aplicação Java é um _head hunter_, um caça-talentos que precisa fornecer uma lista de 10 programadores a uma empresa que irá desenvolver um novo projeto. A aplicação cliente Java possui internamente uma lista de 51 contatos para selecionar os 10 necessários ao projeto. A seleção está automatizada para selecionar os 10 amostrados aleatoriamente da lista interna de 51. Nada usual na vida real, mas foi a fábula que criamos para contextualizar nossos testes. Para saber qual programador selecionar, o cliente Java consome uma API que oferece o serviço de sortear números inteiros dentro dos limites de um intervalo. Logo, a aplicação Java fornece um intervalo de 0 a 50 ao JavaScript e fica fazendo chamadas remotas ao servidor NodeJS até preencher a quantidade desejada. 

![Arquitetura implementada](images/arquitetura.jpeg)

_Figura 1: Arquitetura implementada_

Depois precisa persistir os alunos selecionados em um banco de dados. Uma API implementada em Dart fará a emulação de um banco de dados oferecendo um serviço de API contendo todos os métodos das operações elementares de um banco: criar, atualizar, buscar por id, listar todos e apagar. O serviço Dart salva os dados apenas em memória. 
Para emular a inserção em um banco, usualmente cria-se um número sequencial para o id. Para testarmos a comunicação entre APIs, a API Dart por sua vez é cliente de outra API escrita em Golang. A API Golang faz o papel de gerador de chave primária, fornecendo números sequências a cada chamada remota para que o Dart possa usá-lo como identificador único das entidades alunos que a aplicação Java lhe solicitou para salvar no banco.
Dessa forma, temos quatro sistemas implementados em linguagens distintas se comunicando, fornecendo e consumindo serviços de API com o gRPC.



