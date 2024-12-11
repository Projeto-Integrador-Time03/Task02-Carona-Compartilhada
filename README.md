# Disk Carona 🚗💨

**Disk Carona** é uma plataforma de carona compartilhada que conecta pessoas com destinos semelhantes, promovendo economia, sustentabilidade e praticidade.

---

## 📝 Descrição Geral
O projeto tem como objetivo facilitar o compartilhamento de caronas entre usuários, permitindo a pesquisa de pessoas com o mesmo destino. Além disso, oferece funcionalidades completas de gerenciamento de viagens, categorias e usuários.

---

## 📂 Estrutura do Sistema

### Entidades e Atributos

#### Usuário
- **Id** (Long): Identificador único do usuário.
- **Nome** (String): Nome do usuário.
- **Email** (String): Endereço de email do usuário.
- **Senha** (String): Senha para autenticação.
- **Foto** (String): Link para a foto do usuário.

#### Categoria
- **Id** (Long): Identificador único da categoria.
- **Descrição** (String): Detalhes da categoria.

#### Viagem
- **Id** (Long): Identificador único da viagem.
- **Origem** (String): Ponto de partida da viagem.
- **Destino** (String): Destino da viagem.
- **Valor** (Float): Custo da viagem.
- **Quilometragem** (Float): Distância percorrida.
- **id_categoria** (Long): Relacionamento com a categoria.
- **id_usuario** (Long): Relacionamento com o usuário.

---

## 🚀 Funcionalidades
- **CRUD de Usuários**: Criar, visualizar, atualizar e excluir usuários.
- **CRUD de Categorias**: Gerenciamento de categorias de viagem.
- **CRUD de Viagens**: Adicionar, visualizar, atualizar e excluir viagens.
- **Pesquisa de Caronas**: Encontrar caronas disponíveis com base no destino.

---

## 🛠️ Tecnologias Utilizadas
- **Java 17**: Linguagem de programação principal.
- **Spring Boot**: Framework para desenvolvimento do back-end.
- **Banco de Dados SQL**: Gerenciamento e persistência de dados.

---

## 🔧 Instalação e Configuração

1. **Clone este repositório**:
  ```
   git clone https://github.com/seu-repositorio/disk-carona.git
  ```
2. Configure o banco de dados no arquivo `application.properties` em `src/main/resources`:
  ```
  spring.datasource.url=jdbc:mysql://localhost:3306/disk_carona
  spring.datasource.username=seu_usuario
  spring.datasource.password=sua_senha
  ```
3. Execute o projeto:
  ```
  ./mvnw spring-boot:run
  ```

## 🛠️ Melhorias Futuras

- Implementação de autenticação e autorização.
- Integração com APIs de mapas para cálculo automático de quilometragem e rotas.
- Criação de uma interface de usuário para melhorar a experiência dos clientes

### Desenvolvido por:

- [Estafany Santos](https://www.linkedin.com/in/estefany-santos/)
- [Lucas Matheus](https://www.linkedin.com/in/lucas-matheus-lima/)
- [Kevin Schuab](https://www.linkedin.com/in/kevin-schuab/)
- [Priscila Soares](https://www.linkedin.com/in/priscila-soares-161644111/)
- [Rayane Moara](https://www.linkedin.com/in/rayane-moara/)
- [Sarah Tavares](https://www.linkedin.com/in/sarahtavaresl)
