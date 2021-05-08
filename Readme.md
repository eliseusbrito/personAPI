<h2>Sistema de gerenciamento de pessoas em API REST com Spring Boot</h2>

Pequeno sistema desenvolvido com base em curso da Digital Inovation - Bootcamp Java Developer -  para o gerenciamento de pessoas de uma empresa através de uma API REST, criada com o Spring Boot.


Neste sistema foram desenvolvidos os seguintes tópicos:

* Setup inicial de projeto com o Spring Boot Initializr em https://start.spring.io;
* Desenvolvimento de operações de gerenciamento de usuários (Cadastro, leitura, atualização e remoção de pessoas de um sistema) com o padrão arquitetural REST;
* Criação de modelo de dados para o mapeamento de entidades em bancos de dados;
* Desenvolvimento de testes unitários para validação das funcionalidades;
* Utilização do https://mapstruct.org/ para converter objetos DTO's;
* Implantação do sistema na nuvem através do Heroku.

Para consultar o app implantado no Heroku deve-se usar os seguintes end-points:

* Buscar todos as pessoas cadastradas

```shell script
https://personapibootjava.herokuapp.com/api/v1/people
```

* Buscar pessoa por Id
```shell script
https://personapibootjava.herokuapp.com/api/v1/people/{id}
``` 

* Cadastrar nova Pessoa
```shell script
https://personapibootjava.herokuapp.com/api/v1/people
Deve-se utilizar o Método POST com um Body:
{
    "firstName":"Eliseu",
    "lastName":"Brito",
    "cpf":"179.252.220-77",
    "phones":[
        {
            "type":"MOBILE",
            "number":"(51)999999998"
        }
    ]        
}
```


* Excluir uma pessoa

```shell script
Metodo DELETE
https://personapibootjava.herokuapp.com/api/v1/people/{id}
```


* Alterar os dados de uma pessoa cadastrada

```shell script
Método PUT
https://personapibootjava.herokuapp.com/api/v1/people/{id}
Body:
{
    "id":12,
    "firstName":"Eliseu Updated",
    "lastName":"Brito",
    "cpf":"179.252.220-77",
    "phones":[
        {
            "id":1,
            "type":"MOBILE",
            "number":"(51)999999999"
        }
    ]        
}
```

Para clonar o projeto para a máquina local utiliando o git:

```shell script
git clone https://github.com/eliseusbrito/personAPI.git
```

Para rodar local os endpoints dos exemplos acima basta substituir o https://personapibootjava.herokuapp.com  por http://localhost:8080 conforme exemplo abaixo:

```shell script
http://localhost:8080/api/v1/people
```

São necessários os seguintes pré-requisitos para a execução do projeto:

* Java 11 ou versões superiores.
* Maven 3.6.3 ou versões superiores.
* Preferencialmente Intellj IDEA Community Edition.