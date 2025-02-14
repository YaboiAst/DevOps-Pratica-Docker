# DevOps - Prática Docker
## Integrantes
- Vitor Gabriel Orsin - 801575


## Sobre o projeto
### Site de Agendamento de Consultas
A aplicação Spring simula um sistema de agendamento de consultas, contendo os seguintes papéis:
- **Admin**: Responsável por cadastrar e admnistrar novos médicos e pacientes no sistema;
- **Medico**: Cadastro do profissional que pode aceitar consultas pelo sistema;
- **Paciente**: Cadastro do cliente, que pode visualizar suas próximas consultas e agendar ali mesmo;
  
A **consulta** pode ser marcada por um paciente, que pode escolher o médico que vai atendê-lo e o horário;

### Banco de dados - SQL
Imagem do banco de dados SQL para admnistrar a permanência de dados;

## Como usar
1. Clone o repositório
2. Compile o sistema site-consultas
```
mvn package
```
3. Na pasta raiz do repositório, execute o docker compose
```
docker compose up
```

### Manipulando o banco de dados no contâiner
```
sudo docker exec -it dsw1-db-1 "bash"
bash5.1# mysql -p // Senha: root
mysql> USE SiteConsulta;
```
