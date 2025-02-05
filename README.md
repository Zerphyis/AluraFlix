<h1>Aluraflix - Plataforma de Streaming de Vídeos
Aluraflix é uma plataforma de streaming de vídeos desenvolvida utilizando o framework Spring Boot. O sistema oferece funcionalidades para registrar usuários, autenticação segura, e gerenciar vídeos organizados em categorias.</h1>

<h2>Funcionalidades</h2>
<b>Autenticação Segura:</b>

<p>Login com JWT (JSON Web Token) para garantir que apenas usuários autenticados possam acessar as funcionalidades.</p>
<p>Registro de novos usuários com senha criptografada utilizando o BCrypt.</p>
<b>Gestão de Vídeos:</b>

<p>Adicionar, atualizar, listar e excluir vídeos.</p>
<b>Classificação de vídeos em diferentes categorias, como Filmes, Séries, Documentários, etc.</b>
<p>Controle de Acesso:</p>

<p>Usuários autenticados têm acesso completo às funcionalidades, enquanto usuários não autenticados só podem acessar as rotas de login e registro.</p>

<h2>Tecnologias Utilizadas</h2>
<br>
Spring Boot: Framework principal para o desenvolvimento do backend.
<br>
Spring Security: Para gerenciamento de autenticação e autorização.
<br>
JWT (JSON Web Token): Para criação de tokens de autenticação seguros.
<br>
BCrypt: Para criptografar senhas de usuários.
<br>
JPA/Hibernate: Para interação com o banco de dados PostgreSQL.
<br>
PostgreSQL: Banco de dados utilizado para persistência dos dados.
<br>

<h2>Como Rodar o Projeto</h2>
<b>Pré-requisitos</b>
Java 17 ou superior
Maven
PostgreSQL (ou outro banco de dados relacional configurado)
<br>
<h2>Endpoints da API</h2>
<h6>Autenticação</h6>
POST /auth/login<br>
![Image](https://github.com/user-attachments/assets/714d1aff-cada-41a9-976c-d87b0f4d2757)
<br>
POST /auth/register<br>
![Image](https://github.com/user-attachments/assets/5f31b965-8a99-4430-90dd-64afed188e50)
<br>
<h6>Vídeos</h6>
POST /videos/adicionar
<br>
![Image](https://github.com/user-attachments/assets/9a0247f5-b0dc-496a-81bf-b721e6f2232e)
<br>
GET /videos/buscar
<br>
![Image](https://github.com/user-attachments/assets/b92c54bf-d4d4-466c-b66d-ecde9bfb170f)
<br>
GET /videos/buscar/{id}
<br>
![Image](https://github.com/user-attachments/assets/e53f51ab-2072-49d7-9d60-b687bda07645)
<br>
PUT /videos/atualizar/{id}
<br>
![Image](https://github.com/user-attachments/assets/a290f6d2-79f8-4fcd-abc2-c8572174475b)
<br>
DELETE /videos/deletar/{id}
<br>
![Image](https://github.com/user-attachments/assets/32fc8c60-7bd5-4add-9619-864027002ff9)
<br>
GET /videos/buscar/categoria/{categoriaId}
<br>
![Image](https://github.com/user-attachments/assets/cef9e6c8-8c69-4379-9b59-746622fd2dd4)
<br>
<h6>Categoria</h6>
POST /categorias/adicionar
GET /categorias/buscar
GET /categorias/buscar/{id}
PUT /categorias/atualizar/{id}
DELETE /categorias/deletar/{id}
