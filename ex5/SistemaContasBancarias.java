class Conta {
    // Classe principal, que será a classe pai.

    protected int numero;
    // Número da conta.

    protected String titular;
    // Nome do titular da conta.

    protected double saldo;
    // Saldo da conta.

    public Conta(int numero, String titular, double saldo) {
        // Construtor da classe Conta.

        this.numero = numero;
        // Guarda o número da conta.

        this.titular = titular;
        // Guarda o nome do titular.

        this.saldo = saldo;
        // Guarda o saldo inicial.
    }

    public void depositar(double valor) {
        // Método utilizado para realizar depósitos.

        saldo += valor;
        // Adiciona o valor do depósito ao saldo.
        //
        // É a mesma coisa que:
        // saldo = saldo + valor;
    }

    public void sacar(double valor) {
        // Método utilizado para realizar saques.

        saldo -= valor;
        // Retira o valor do saque do saldo.
        //
        // É a mesma coisa que:
        // saldo = saldo - valor;
    }

    public double calcularSaldo() {
        // Método responsável por calcular o saldo.

        return saldo;
        // Na classe Conta, simplesmente retorna o saldo atual.
    }

    public void exibirDados() {
        // Método que mostra os dados da conta.

        System.out.println("\nConta: " + numero);
        // Mostra o número da conta.

        System.out.println("Titular: " + titular);
        // Mostra o titular.

        System.out.printf("Saldo calculado: R$ %.2f%n",
                calcularSaldo());
        // Mostra o saldo calculado.
    }
}


class ContaCorrente extends Conta {
    // ContaCorrente HERDA de Conta.

    private double taxaManutencao;
    // Armazena o valor da taxa de manutenção.

    public ContaCorrente(int numero, String titular,
                         double saldo, double taxaManutencao) {
        // Construtor da ContaCorrente.

        super(numero, titular, saldo);
        // Chama o construtor da classe pai.

        this.taxaManutencao = taxaManutencao;
        // Guarda o valor da taxa.
    }

    @Override
    public double calcularSaldo() {
        // Sobrescreve o método da classe Conta.

        return saldo - taxaManutencao;
        // Na conta corrente, a taxa de manutenção é descontada
        // do saldo quando calculamos o saldo.
    }
}


class ContaPoupanca extends Conta {
    // ContaPoupanca também HERDA de Conta.

    private double percentualRendimento;
    // Guarda o percentual de rendimento da poupança.

    public ContaPoupanca(int numero, String titular,
                         double saldo, double percentualRendimento) {
        // Construtor da ContaPoupanca.

        super(numero, titular, saldo);
        // Chama o construtor da classe pai.

        this.percentualRendimento = percentualRendimento;
        // Guarda o percentual de rendimento.
    }

    @Override
    public double calcularSaldo() {
        // Sobrescreve o método da classe Conta.

        return saldo + (saldo * percentualRendimento / 100);
        // Calcula o rendimento e adiciona ao saldo.
        //
        // Exemplo:
        // Saldo = 2200
        // Rendimento = 1,5%
        //
        // 2200 * 1,5 / 100 = 33
        //
        // Saldo calculado = 2233
    }
}


public class SistemaContasBancarias {

    public static void main(String[] args) {
        // Método principal.

        ContaCorrente corrente =
                new ContaCorrente(101, "Pedro", 1500, 25);
        // Cria uma conta corrente.
        // Número: 101
        // Titular: Pedro
        // Saldo inicial: R$ 1.500
        // Taxa: R$ 25

        ContaPoupanca poupanca =
                new ContaPoupanca(102, "Ana", 2000, 1.5);
        // Cria uma conta poupança.
        // Número: 102
        // Titular: Ana
        // Saldo inicial: R$ 2.000
        // Rendimento: 1,5%

        corrente.depositar(500);
        // Deposita R$ 500 na conta corrente.

        corrente.sacar(200);
        // Retira R$ 200 da conta corrente.

        poupanca.depositar(300);
        // Deposita R$ 300 na poupança.

        poupanca.sacar(100);
        // Retira R$ 100 da poupança.

        corrente.exibirDados();
        // Exibe os dados da conta corrente.

        poupanca.exibirDados();
        // Exibe os dados da conta poupança.
    }
}
