# Trabalhe conosco Docket Backend Java

## Sumário

- [Trabalhe conosco Docket Backend Java](#trabalhe-conosco-docket-backend-java)
  - [Proposta](#proposta)
  - [Importante](#importante)
  - [Briefing](#briefing)
  - [Requisitos](#requisitos)
      - [História do Usuário](#história-do-usuário)
      - [Requisitos Obrigatórios:](#requisitos-obrigatórios)
      - [Informações Adicionais](#informações-adicionais)
      - [Requisitos Opcionais (diferenciais)](#requisitos-opcionais-diferenciais)
      - [Requisitos de Tecnologias](#requisitos-de-tecnologias)
- [Como participar](#como-participar)



## Proposta
Neste teste para a área de desenvolvedor Backend, à partir do briefing e requisito apresentados, a Docket propõe a você construir um sistema de cartórios e o planejamento do seu projeto.

## Briefing
Uma empresa com a proposta de desburocratizar os serviços cartorários para pessoas físicas e pequenas empresas, e de reduzir o tempo de entrega dos documentos aos seus clientes. 

## O que fazemos
- Buscam os documentos em todo o Brasil
- Emitem 2ª vias de certidões de nascimento, casamento e óbito
- Entregam os documentos aos clientes em até 15 dias

## Requisitos

### História do Usuário
Como operador do sistema, quando entro em contato com um novo cartório, desejo cadastrá-lo na nossa base com suas informações básicas, pois assim posso consultá-lo e alterá-lo sempre que necessário.

### Requisitos Obrigatórios:
Utilizando **Thymeleaf** ou **JSP (com JSTL)** no front-end (preferencialmente **Thymeleaf**), o sistema deve:

 - Permitir o cadastro das informações básicas dos cartórios, que são: nome, endereço e as certidões que ele emite.
 - Listar os cartórios e suas informações. 
 - Permitir a exclusão e edição dos cartórios.

### Requisitos Opcionais (diferenciais)

#### Consumo de API Rest:
- Consumir via backend a lista de certidões de nossa API REST https://docketdesafiobackend.herokuapp.com/api/v1/certidoes e relacioná-las com os cartórios.

#### Disponibilizar um client API Rest (seguindo as boas práticas da Arquitetura Rest) que deve:
- Permitir o cadastro das informações básicas dos cartórios, que são: nome, endereço e as certidões que ele emite.
- Listar os cartórios e suas informações.
- Permitir a exclusão e edição dos cartórios.

### Informações Adicionais
 - Um cartório tem apenas um nome e endereço. 
 - Um cartório pode emitir uma ou mais certidões. 
 - Uma certidão possui apenas um nome.

### Requisitos de Tecnologias
Usar as Seguintes Tecnologias:
- Java 8 (ou superior)
- Spring Boot ou Spring MVC 
- Thymeleaf HTML ou JSP (com JSTL)
- Banco de dados H2DB ou Postgres

## Planejamento
Nos conte como irá se planejar para executar o projeto, como por exemplo: como transformou os requisitos em tarefas, se utilizou alguma ferramenta para se organizar, se desenhou algum diagrama e etc.

# Como participar
- Crie um repositório público no github e coloque o código fonte do projeto.
 - Envie uma mensagem de email para o endereço brenda.araujo@docket.com.br, com o seguinte conteúdo:
    - Link do repositório do github com o código fonte do projeto
    - Descrição do planejamento
    - Currículo em anexo ou link do perfil no linkedin.com

Se ficou com alguma dúvida, nos envie um email: brenda.araujo@docket.com.br


