class Conta {
    protected int numero;
    protected String titular;
    protected double saldo;

    public Conta(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        saldo -= valor;
    }

    public double calcularSaldo() {
        return saldo;
    }

    public void exibirDados() {
        System.out.println("\nConta: " + numero);
        System.out.println("Titular: " + titular);
        System.out.printf("Saldo calculado: R$ %.2f%n",
                calcularSaldo());
    }
}

class ContaCorrente extends Conta {
    private double taxaManutencao;

    public ContaCorrente(int numero, String titular,
                         double saldo, double taxaManutencao) {
        super(numero, titular, saldo);
        this.taxaManutencao = taxaManutencao;
    }

    @Override
    public double calcularSaldo() {
        return saldo - taxaManutencao;
    }
}

class ContaPoupanca extends Conta {
    private double percentualRendimento;

    public ContaPoupanca(int numero, String titular,
                         double saldo, double percentualRendimento) {
        super(numero, titular, saldo);
        this.percentualRendimento = percentualRendimento;
    }

    @Override
    public double calcularSaldo() {
        return saldo + (saldo * percentualRendimento / 100);
    }
}

public class SistemaContasBancarias {
    public static void main(String[] args) {
        ContaCorrente corrente =
                new ContaCorrente(101, "Pedro", 1500, 25);

        ContaPoupanca poupanca =
                new ContaPoupanca(102, "Ana", 2000, 1.5);

        corrente.depositar(500);
        corrente.sacar(200);

        poupanca.depositar(300);
        poupanca.sacar(100);

        corrente.exibirDados();
        poupanca.exibirDados();
    }
}