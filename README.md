# Projeto folha de pagamento

[![Build Status](https://travis-ci.org/joemccann/dillinger.svg?branch=master)](https://travis-ci.org/joemccann/dillinger)

Sistema composto por vários microsserviços que se comunicam de forma transparente, escalável e com balanceamento de carga. Tudo isso pela nuvem, com autenticação e autorização, utilizando OAuth e tokens JWT. Nesse sistema é feito o cadastro do trabalhador e através do microserviço da folha de pagamento, é informado qual trabalhador vai ser pago, a quantidade de dias trabalhados por ele e assim é calculando o salario final.

## Tecnologia

Esse projeto utiliza as seguintes tecnologias:

- [Spring boot]
- [Spring Cloud] - Eureka, Gateway Zuul, Hystrix, Feign, 
- [OAuth]
- [JWT]
- [H2 ou MySQL]
- [Lombok]
- [JPA, Spring web]

## Instalação

É necessário ter instalado o Lombok no seu sistema. (https://projectlombok.org/download)

Nos arquivos .properties a conexão com o BD H2 está comentada, basta descomentar ou utilizar o arquivo bootstrap, que está pegando de um repositorio do GIT, mas ai vc devera criar esse arquivo no seu git e apontar para ele no microserviço de 'hr-config-server', ai nesse arquivo do git vc irá inserir a conexão com o BD e apontar para os microserviços que deseja ter uma conexão com o BD.
