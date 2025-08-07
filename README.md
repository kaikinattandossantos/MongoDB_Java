# API de Produtos Danylinho

## Descrição

Este projeto é uma simples API REST para gerenciar um catálogo de produtos utilizando Spring Boot, Spring Data MongoDB e um frontend básico em HTML, JavaScript e Fetch API.  A API permite criar novos produtos e listar todos os produtos existentes. Os dados são persistidos em um banco de dados MongoDB.

## Tecnologias Utilizadas

* **Linguagem:** Java
* **Framework:** Spring Boot
* **Banco de Dados:** MongoDB
* **Frontend:** HTML, JavaScript, Fetch API
* **Teste:** JUnit 5

## Como Executar

1. **Pré-requisitos:**  Certifique-se de ter o Java JDK 17+ e o Maven instalados em seu sistema.  Você também precisará de um servidor MongoDB rodando.

2. **Clone o repositório:** Clone este repositório para sua máquina local usando `git clone <URL_DO_REPOSITORIO>`.

3. **Navegue até o diretório do projeto:**  Use o comando `cd <diretorio_do_projeto>`.

4. **Compile e execute:** Execute o comando `mvn spring-boot:run` no terminal.

5. **Acesse a interface:** Abra o arquivo `src/main/resources/static/index.html` em um navegador web para interagir com a API.  A aplicação deverá estar rodando em `http://localhost:8080`.  A API estará disponível em `http://localhost:8080/api/produtos`.

## Requisitos

* Java Development Kit (JDK) 17 ou superior.
* Maven.
* MongoDB instalado e rodando.
* Um navegador web.


## Estrutura do Projeto

* `src/main/java/com/example/danylinho/`: Contém o código Java principal.
    * `DanylinhoApplication.java`: Classe principal do Spring Boot.
    * `controller/ProdutoController.java`: Controlador REST para manipular os produtos.
    * `model/Produto.java`: Classe representando um produto.
    * `repository/ProdutoRepository.java`: Interface Spring Data para interação com o MongoDB.
    * `service/ProdutoService.java`: Serviço para a lógica de negócio dos produtos.
* `src/main/resources/static/index.html`: Interface do usuário HTML básica para testar a API.
* `src/test/java/com/example/danylinho/DanylinhoApplicationTests.java`: Teste básico de contexto do Spring Boot.


## Contribuições

Contribuições são bem-vindas!  Por favor, abra um *issue* ou *pull request* caso você tenha sugestões ou encontre algum problema.