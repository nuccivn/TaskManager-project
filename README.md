🚀 Task Manager API
Sistema robusto de gerenciamento de tarefas desenvolvido para demonstrar competências em Desenvolvimento Back-end, DevOps (Docker) e Garantia de Qualidade (QA).

📋 Sobre o Projeto
Esta API permite o ciclo completo de gestão de tarefas (CRUD). O diferencial técnico deste projeto é a sua arquitetura baseada em containers, garantindo que o sistema funcione de forma idêntica em qualquer ambiente de desenvolvimento.

🛠️ Tecnologias e Ferramentas
Back-end: Java 17 com Spring Boot.

Persistência: PostgreSQL.

Infraestrutura: Docker e Docker Compose para orquestração de serviços.

Qualidade/QA: Postman para testes de integração automatizados.

Versionamento: Git e GitHub.

🏗️ Como Executar a Aplicação
Pré-requisitos
Docker e Docker Compose instalados.

Passo a passo
Clone o repositório:

Bash

git clone https://github.com/nuccivn/TaskManager-project.git
Navegue até a pasta do projeto e suba os containers:

Bash

docker-compose up -d
A API estará pronta para receber requisições em: http://localhost:8080/tasks.

🧪 Estratégia de QA (Testes de Integração)
O projeto foi validado utilizando uma suíte de testes rigorosa no Postman, garantindo que a comunicação entre a API e o Banco de Dados esteja perfeita.

Endpoints Testados:
POST /tasks: Criação de tarefas com validação de status 201 Created.

GET /tasks: Listagem de todas as tarefas com validação de status 200 OK.

Como rodar os testes:
Localize o arquivo TaskManager_QA.postman_collection.json na pasta /Testes.

Importe-o no Postman.

Configure a variável de ambiente url para http://localhost:8080.

Execute o Collection Runner para visualizar os resultados verdes (PASS).

📊 Evidências de Sucesso:
<img width="1668" height="900" alt="image" src="https://github.com/user-attachments/assets/f06367e2-7fe8-444d-a6fc-c0d3e39011d4" />
<img width="1308" height="952" alt="image" src="https://github.com/user-attachments/assets/d51e7e7a-f2c5-489f-bc68-ba28f57291b5" />
<img width="1311" height="952" alt="image" src="https://github.com/user-attachments/assets/bb2bd70a-1920-423f-9873-925679757ad3" />

✒️ Autor
Vinícius Nucci Galvão - Desenvolvedor e QA - [https://www.linkedin.com/in/vinícius-nucci-galvão/]
