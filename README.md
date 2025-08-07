# API de Produtos Danylinho

## Descrição

Esta API REST simplificada gerencia um catálogo de produtos.  Utiliza Spring Boot com Spring Data MongoDB para persistência de dados e oferece uma interface básica em HTML, JavaScript e Fetch API para interação.  A API permite criar novos produtos e listar todos os produtos existentes.

## Tecnologias Utilizadas

* **Linguagem:** Java
* **Framework:** Spring Boot, Spring Data MongoDB
* **Banco de Dados:** MongoDB
* **Frontend:** HTML, JavaScript, Fetch API
* **Testes:** JUnit 5


## Como Executar

1. **Pré-requisitos:**  Tenha o Java JDK 17+ e o Maven instalados. Um servidor MongoDB deve estar rodando.

2. **Clone o repositório:**  `git clone <URL_DO_REPOSITORIO>`

3. **Navegue até o diretório:** `cd <diretorio_do_projeto>`

4. **Compile e execute:** `mvn spring-boot:run`

5. **Acesse a aplicação:** Abra `src/main/resources/static/index.html` em seu navegador. A API estará disponível em `http://localhost:8080/api/produtos`. A interface gráfica irá se comunicar com a API neste endereço.


## Requisitos

* Java Development Kit (JDK) 17 ou superior
* Apache Maven
* MongoDB rodando
* Navegador Web


## Estrutura do Projeto

A estrutura do projeto é organizada da seguinte forma:

* `src/main/java/com/example/danylinho/`: Código Java principal.
    * `DanylinhoApplication.java`: Classe principal do Spring Boot.
    * `controller/ProdutoController.java`: Controlador REST para manipulação de produtos.
    * `model/Produto.java`: Modelo de dados para um produto.
    * `repository/ProdutoRepository.java`: Interface Spring Data para acesso ao MongoDB.
    * `service/ProdutoService.java`: Serviço contendo a lógica de negócio.
* `src/main/resources/static/index.html`: Interface HTML básica para testar a API.
* `src/test/java/com/example/danylinho/DanylinhoApplicationTests.java`: Teste básico de contexto Spring Boot.


## Contribuições

Contribuições são bem-vindas! Por favor, abra issues ou pull requests para quaisquer sugestões ou problemas encontrados.