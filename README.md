# API de Produtos
Bem-vindo ao repositório da **API de Produtos!** Este projeto foi desenvolvido utilizando Spring Boot e um banco de dados H2 em memória. A API permite a criação, leitura, atualização e exclusão (CRUD) de registros de produtos.

## Funcionalidades
- **Criação de Produtos**: Adicione novos produtos ao sistema.
- **Leitura de Produtos**: Visualize detalhes dos produtos existentes.
- **Atualização de Produtos**: Edite informações de produtos existentes.
- **Exclusão de Produtos**: Remova produtos do sistema.
  
## Tecnologias Utilizadas
Java
Spring Boot
H2 DB
Postman

### Endpoints Principais
- GET /produtos: Retorna a lista de todos os produtos.
- POST /produtos: Adiciona um novo produto.
- GET /produtos?nome=: Retorna os detalhes de um produto específico.
- PUT /produtos/:id: Atualiza as informações de um produto específico.
- DELETE /produtos/:id: Remove um produto específico.


### Configuração do Ambiente
Certifique-se de ter o Java 11 ou superior instalado.

Clone o repositório:
git clone https://github.com/mateusblm/produtosapi.git

Navegue até o diretório do projeto:
cd produtosapi

Compile o projeto:
./mvnw clean install

Inicie o aplicativo Spring Boot:
./mvnw spring-boot:run

### O banco de dados H2 em memória será inicializado automaticamente quando o aplicativo for iniciado.

Contribuição
Contribuições são bem-vindas! Sinta-se à vontade para abrir issues e pull requests. Para contribuir:

Faça um fork do projeto.
Crie uma branch para sua feature (git checkout -b feature/nova-feature).
Commit suas alterações (git commit -m 'Adiciona nova feature').
Faça o push para a branch (git push origin feature/nova-feature).
Abra um Pull Request.
Contato
Para mais informações, entre em contato:

Nome: Mateus Burlamaqui Moreira
Email: mateusblm@outlook.com
Linkedin: www.linkedin.com/in/mateus-burlamaqui-moreira/ 
