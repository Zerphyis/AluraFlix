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
POST /auth/login
POST /auth/register
<h6>Vídeos</h6>
POST /videos/adicionar
GET /videos/buscar
GET /videos/buscar/{id}
PUT /videos/atualizar/{id}
DELETE /videos/deletar/{id}
GET /videos/buscar/categoria/{categoriaId}
<h6>Categoria</h6>
POST /categorias/adicionar
GET /categorias/buscar
GET /categorias/buscar/{id}
PUT /categorias/atualizar/{id}
DELETE /categorias/deletar/{id}
