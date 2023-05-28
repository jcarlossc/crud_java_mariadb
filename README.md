# PROJETO CRUD JAVA - MARIADB

## Objetivo do projeto

O objetivo do projeto é implementar um CRUD(Create,Read,Update e Delete) em linguagem de programação Java e MySql.

## Descrição do projeto

O Crud Java - MariaDB é um projeto muito simples voltado para iniciantes com a linguagem de programação Java. O projeto conta com apenas quatro classes: ConnectionFactory usada para conexão com o banco de dados; CustomerModel como classe model do projeto; a CustomerController com métodos para manipulação do banco de dados e a classe pricipal. O projeto não possui interface gráfica.

## Tecnologias utilizadas
* Linguagem de programação Java 8 
* Gerenciador de dependências Maven
* Stack Xampp (Apache e MariaDB)
* VS Code
* Sistema operacional Windows

## Observações

* Para fazer o projeto funcionar é necessário inicialir o servidor Apache e o MariaDB da stack Xampp.  
* Caso o programador esteja usando um gerenciador de dependências diferente do Maven, este é o endereço do DRIVER de conexão Sql (https://mvnrepository.com/artifact/mysql/mysql-connector-java/8.0.32).
* A dependência JDBC(para conexão com o banco de dados) fica no arquivo pom.xml
* Existe uma pasta no projeto chamada (db) que não faz parte da estrutura do projeto mas contém o esquema sql.
