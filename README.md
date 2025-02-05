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
<br>
Java 17 ou superior
<br>
Maven
<br>
PostgreSQL (ou outro banco de dados relacional configurado)
<br>
<h2>Endpoints da API</h2>
<h3><b>Autenticação</b></h3>
<b>POST /auth/login<br></b>

![Image](https://github.com/user-attachments/assets/714d1aff-cada-41a9-976c-d87b0f4d2757)

<br>
<b>POST /auth/register</b>
<br>

![Image](https://github.com/user-attachments/assets/5f31b965-8a99-4430-90dd-64afed188e50)

<br>
<h3><b>Vídeos</b></h3>
<b>POST /videos/adicionar</b>
<br>

![Image](https://github.com/user-attachments/assets/9a0247f5-b0dc-496a-81bf-b721e6f2232e)

<br>
<b>GET /videos/buscar</b>
<br>

![Image](https://github.com/user-attachments/assets/b92c54bf-d4d4-466c-b66d-ecde9bfb170f)

<br>
<b>GET /videos/buscar/{id}</b>
<br>

![Image](https://github.com/user-attachments/assets/e53f51ab-2072-49d7-9d60-b687bda07645)

<br>
<b>PUT /videos/atualizar/{id}</b>
<br>

![Image](https://github.com/user-attachments/assets/a290f6d2-79f8-4fcd-abc2-c8572174475b)

<br>
<b>DELETE /videos/deletar/{id}</b>
<br>

![Image](https://github.com/user-attachments/assets/32fc8c60-7bd5-4add-9619-864027002ff9)

<br>
<b>GET /videos/buscar/categoria/{categoriaId}</b>
<br>

![Image](https://github.com/user-attachments/assets/cef9e6c8-8c69-4379-9b59-746622fd2dd4)

<br>
<h3><b>Categoria</b></h3>
<b>POST /categorias/adicionar</b>
<br>

![Image](https://github.com/user-attachments/assets/2ecbd16e-9f15-4e15-9b53-73877908dfe0)

<br>
<b>GET /categorias/buscar</b>
<br>

![Image](https://github.com/user-attachments/assets/ee58e203-6f9e-4d5f-95c5-8686c1eaf69d)

<br>
<b>GET /categorias/buscar/{id}</b>
<br>

![Image](https://github.com/user-attachments/assets/2b2db881-f12b-444d-9e12-265994b80c5b)

<br>
<b>PUT /categorias/atualizar/{id}</b>
<br>

![Image](https://github.com/user-attachments/assets/9027a734-9b9d-46ca-aae2-fe52bee53f19)

<br>
<b>DELETE /categorias/deletar/{id}</b>

<br>

![Image](https://github.com/user-attachments/assets/480076f3-2656-42c4-980d-7a409f2218a2)
<br>
