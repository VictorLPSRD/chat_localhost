# Chat Application

Este é um projeto simples de aplicação de chat utilizando Spring Boot e Thymeleaf.

## Tecnologias Utilizadas

- Spring Boot: Framework para aplicações Java

- Thymeleaf: Motor de templates para renderização de páginas HTML

- Java 21: Linguagem de programação

- Maven: Gerenciador de dependências

## Estrutura do Projeto

 ```plaintext
    ├── src
│   ├── main
│   │   ├── java
│   │   │   ├── com.example.demo
│   │   │   │   ├── controles
│   │   │   │   │   └── ChatController.java
│   │   │   │   ├── model
│   │   │   │   │   └── Mensagem
│   │   │   │   └── service
│   │   │   │       └── ChatService.java
│   │   │   └── DemoApplication 
│   │   │     
│   │   └── resources 
|   |       ├── static
|   |       |
|   |       ├── templates
|   |       |    └── chat.html
|   |       └── application.properties
│   │       
└── README.md
````
## Configuração
   1 Clone o repositório:
 ```plaintext
      git clone https://github.com/seu-repositorio/chat-app.git
      cd chat-app
  ```
  2 Configurar propriedades: O arquivo application.properties contém as configurações padrão:
 ```plaintext
     spring.application.name=demo
     server.port=8080
     server.address=0.0.0.0
     spring.thymeleaf.cache=false
  ```
  3 Compilar e executar o projeto:
   ```plaintext
      mvn spring-boot:run    
  ```
  4 Acessar a aplicação:Abra um navegador e acesse:
   ```plaintext
    http://localhost:8080/chat
  ```
## Funcionalidades

 - Exibir mensagens do chat: O chat exibe uma lista de mensagens enviadas.
 - Enviar mensagens: Os usuários podem enviar mensagens utilizando um formulário.

## Contribuição

1 Se desejar contribuir, siga os seguintes passos:

2 Fork o repositório

3 Crie uma branch (feature-nova-funcionalidade)

4 Commit suas modificações (git commit -m 'Adiciona nova funcionalidade')

5 Faça um push para a branch (git push origin feature-nova-funcionalidade)

5 Abra um Pull Request
  
