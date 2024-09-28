Loteria - Sistema de Gerenciamento de Conta Bancária
Descrição

O Loteria é um sistema simples de gerenciamento de conta bancária em Java, desenvolvido com o objetivo de simular operações financeiras como depósito, saque e rendimento de dinheiro. A aplicação utiliza uma interface de linha de comando, proporcionando uma experiência interativa para o usuário. Este projeto foi criado com o intuito de explorar conceitos fundamentais de programação orientada a objetos (POO) e tratamento de exceções em Java.
Funcionalidades

    Depósito de Dinheiro: Adicione fundos à sua conta bancária.
    Saque de Dinheiro: Retire dinheiro da sua conta, com verificação de saldo disponível.
    Rendimento de Dinheiro: Simule o rendimento do saldo, aplicando uma taxa percentual.
    Listagem de Conta: Exiba os detalhes da conta, incluindo nome do titular e saldo atual.
    Menu Interativo: Interface simples e intuitiva para navegação entre as funcionalidades.
    Tratamento de Erros: Validação de entradas com try-catch para evitar que o programa quebre devido a entradas inválidas.

Tecnologias Utilizadas

    Java: Linguagem de programação principal.
    Scanner: Utilizado para capturar entradas do usuário.
    Tratamento de Exceções: Garantia de robustez ao programa, lidando com entradas incorretas do usuário.

Pré-requisitos

Antes de começar, você precisará ter o Java Development Kit (JDK) instalado em sua máquina.
Como Executar

    Clone o repositório:

    bash

git clone https://github.com/seu-usuario/loteria.git

Navegue até o diretório do projeto:

bash

cd loteria

Compile o código:

bash

javac Main.java Loteria.java

Execute o programa:

bash

    java Main

Exemplo de Execução

Ao executar o programa, o usuário será saudado por uma interface com arte em ASCII e um menu de opções:

markdown

=================================
   BEM-VINDO AO BANCO LOTERIA    
=================================
      _____  _______  _______    
     |  __ \|__   __||__   __|   
     | |  | |  | |      | |      
     | |  | |  | |      | |      
     | |__| |  | |      | |      
     |_____/   |_|      |_|      
=================================

Digite o nome do titular da conta: João
Digite o saldo inicial da conta: 1000.00

--- MENU ---
1. Depositar
2. Sacar
3. Render Dinheiro
4. Listar Conta
5. Sair
Escolha uma opção:

Estrutura do Projeto

bash

├── Main.java          # Classe principal contendo o menu e a lógica de controle.
├── Loteria.java       # Classe que representa a conta bancária e suas operações.
└── README.md          # Documentação do projeto.

Melhorias Futuras

    Adicionar suporte a contas do tipo Corrente.
    Implementar autenticação de usuário para login e segurança.
    Criar uma interface gráfica (GUI) com JavaFX ou Swing.
    Gerar relatórios de movimentação da conta.

Contribuições

Contribuições são bem-vindas! Se você tiver alguma sugestão ou encontrar algum problema, sinta-se à vontade para abrir uma issue ou enviar um pull request.
Licença

Este projeto está sob a licença MIT.
