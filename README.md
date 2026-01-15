📝 Task Manager API
Este projeto é uma API robusta para gerenciamento de tarefas, desenvolvida com Spring Boot e PostgreSQL, totalmente containerizada com Docker e validada com suítes de testes de QA no Postman.

🚀 Tecnologias Utilizadas
Java 17 & Spring Boot: Core da aplicação e gerenciamento de dependências.

PostgreSQL: Banco de dados relacional para persistência.

Docker & Docker Compose: Orquestração de containers para ambiente de desenvolvimento isolado.

Postman: Automação de testes de integração e Garantia de Qualidade (QA).

📦 Como Rodar o Projeto
Certifique-se de ter o Docker instalado.

No terminal, na raiz do projeto, execute:

Bash

docker-compose up -d
A API estará disponível em http://localhost:8080/tasks.

🧪 Garantia de Qualidade (QA)
O projeto inclui uma coleção de testes automatizados para garantir que todos os endpoints funcionem corretamente.

Testes Realizados:
POST: Validação de criação de tarefas com retorno 201 Created.

GET: Verificação da listagem de tarefas com retorno 200 OK.

Scripts de Teste: Validação automática de esquema JSON e tempo de resposta.

Como rodar os testes:
Importe o arquivo TaskManager_QA.postman_collection.json (disponível na pasta /Testes) para o seu Postman.

Selecione o ambiente com a variável url configurada para http://localhost:8080.

Utilize o Collection Runner para executar todos os testes simultaneamente.


<img width="1668" height="900" alt="image" src="https://github.com/user-attachments/assets/f06367e2-7fe8-444d-a6fc-c0d3e39011d4" />
<img width="1308" height="952" alt="image" src="https://github.com/user-attachments/assets/d51e7e7a-f2c5-489f-bc68-ba28f57291b5" />
<img width="1311" height="952" alt="image" src="https://github.com/user-attachments/assets/bb2bd70a-1920-423f-9873-925679757ad3" />

