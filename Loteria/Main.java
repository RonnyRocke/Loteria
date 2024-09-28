import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Título em ASCII
        System.out.println("=================================");
        System.out.println("   BEM-VINDO AO BANCO LOTERIA    ");
        System.out.println("=================================");
        System.out.println("      _____  _______  _______    ");
        System.out.println("     |  __ \\|__   __||__   __|   ");
        System.out.println("     | |  | |  | |      | |      ");
        System.out.println("     | |  | |  | |      | |      ");
        System.out.println("     | |__| |  | |      | |      ");
        System.out.println("     |_____/   |_|      |_|      ");
        System.out.println("=================================\n");

        try {
            // Criação de uma conta com nome e saldo inicial
            System.out.print("Digite o nome do titular da conta: ");
            String nome = sc.nextLine();

            System.out.print("Digite o saldo inicial da conta: ");
            double saldoInicial = sc.nextDouble();
            Loteria conta = new Loteria(nome, saldoInicial);

            // Menu de opções
            int opcao;
            do {
                System.out.println("\n--- MENU ---");
                System.out.println("1. Depositar");
                System.out.println("2. Sacar");
                System.out.println("3. Render Dinheiro");
                System.out.println("4. Listar Conta");
                System.out.println("5. Sair");
                System.out.print("Escolha uma opção: ");

                // Tratamento de erro para entradas inválidas
                try {
                    opcao = sc.nextInt();

                    switch (opcao) {
                        case 1:
                            System.out.print("Digite o valor para depositar: ");
                            double valorDeposito = sc.nextDouble();
                            conta.depositar(valorDeposito);
                            break;

                        case 2:
                            System.out.print("Digite o valor para sacar: ");
                            double valorSaque = sc.nextDouble();
                            conta.sacar(valorSaque);
                            break;

                        case 3:
                            System.out.print("Digite a taxa de rendimento (%): ");
                            double taxaRendimento = sc.nextDouble();
                            conta.renderDinheiro(taxaRendimento);
                            break;

                        case 4:
                            conta.listarConta();
                            break;

                        case 5:
                            System.out.println("Saindo do sistema. Obrigado!");
                            break;

                        default:
                            System.out.println("Opção inválida. Tente novamente.");
                    }

                } catch (InputMismatchException e) {
                    System.out.println("Erro: Entrada inválida. Por favor, insira um número.");
                    sc.nextLine(); // Limpa o buffer
                    opcao = 0; // Mantém o loop
                }

            } while (opcao != 5);

        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrada inválida para saldo inicial. Programa encerrado.");
        } finally {
            sc.close();
        }
    }
}
