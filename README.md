# PROJETO CRUD JAVA - MARIADB

## Objetivo do projeto

O objetivo do projeto é implementar um CRUD(Create,Read,Update e Delete) em linguagem de programação Java e MySql.

## Descrição do projeto

O Crud Java - MariaDB é um projeto muito simples voltado para iniciantes com a linguagem de programação Java. O projeto conta com apenas três classes: ConnectionFactory usada para conexão com o banco de dados; CustomerModel como classe model do projeto; e a CustomerController com métodos para manipulação do banco de dados. O projeto não possui interface gráfica.

## Tecnologias utilizadas
* Linguagem de programação Java 8
* Gerenciador de dependências Maven
* Stack Xampp (Apache e MariaDB)
* VS Code
* Sistema operacional Windows

## Observações

* O projeto Crud Java-MariaDB é puramente didático, ou seja, é destinado para iniciantes na linguagem de programação Java entenderem como a conexão com o banco de dados e consultas Sql funcionam; por exemplo, a classe ConnectionFactory implementada para este projeto é muito diferente da mesma classe em um hambiente de produção.  
* Caso o programador esteja usando um gerenciador de dependências diferente do Maven, este é o endereço do DRIVER de conexão Sql (https://mvnrepository.com/artifact/mysql/mysql-connector-java/8.0.32).
* A dependência JDBC(para conexão com o banco de dados) fica no arquivo pom.xml
* Existe uma pasta no projeto chamada db que não faz parte da estrutura do projeto mas contém o esquema sql.
