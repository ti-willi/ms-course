# Projeto Microsserviços

>## Sobre o projeto
O projeto consiste em uma aplicação Java/Spring Boot utilizando a arquitetura de microsserviços, Oauth e tokens JWT para autenticação e 
autorização de usuários, além de a criação e testes em containers Docker.

Os microsserviços são registrados em um Discovery Server(Eureka), e as requisições são feitas em um API Gateway(Zuul), 
responsável por rotear e autorizar os microsserviços, utilizando o Ribbon para gerenciar balanceamento de carga e Hystrix para 
tolerância a falhas. 
O servidor de configuração foi feito de forma centralizada com os dados em um repositório Git.

>### Arquitetura microsserviços

  ![source](https://github.com/ti-willi/assets/blob/main/mscourse/ms.png)

>### Containers Docker

![source](https://github.com/ti-willi/assets/blob/main/mscourse/containers-docker.jpg)

## Tecnologias utilizadas
- Java 11
- Maven
- Spring Boot / Data / Security / Cloud
- JPA / Hibernate
- Banco H2
- PostgreSQL
- JWT
- OAuth
- Eureka Server
- Zuul 
- Hystrix
- Ribbon
- Docker