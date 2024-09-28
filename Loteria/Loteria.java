public class Loteria {
    private double saldo;
    private String nome;

    // Construtor padrão
    public Loteria() {
    }

    // Construtor com parâmetros
    public Loteria(String nome, double saldoInicial) {
        this.nome = nome;
        this.saldo = saldoInicial;
    }

    // Método para sacar dinheiro
    public void sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente para o saque.");
        } else {
            saldo -= valor;
            System.out.printf("Saque de R$%.2f realizado com sucesso!%n", valor);
        }
    }

    // Método para depositar dinheiro
    public void depositar(double valor) {
        saldo += valor;
        System.out.printf("Depósito de R$%.2f realizado com sucesso!%n", valor);
    }

    // Método para render o saldo (simulação de rendimento)
    public void renderDinheiro(double taxa) {
        double rendimento = saldo * taxa / 100;
        saldo += rendimento;
        System.out.printf("Rendimento de R$%.2f adicionado à conta.%n", rendimento);
    }

    // Método para exibir os detalhes da conta
    public void listarConta() {
        System.out.printf("%nNOME DA CONTA: %s%n", nome);
        System.out.printf("SALDO: R$%.2f%n", saldo);
        System.out.println("TIPO DA CONTA: POUPANÇA");
    }

    // Getter para saldo
    public double getSaldo() {
        return saldo;
    }
}
