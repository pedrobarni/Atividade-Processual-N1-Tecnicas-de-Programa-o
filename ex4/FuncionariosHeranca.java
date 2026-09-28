class Funcionario {
    // Classe principal, também chamada de classe pai.

    protected String nome;
    // Nome do funcionário.

    protected double salarioBase;
    // Salário base do funcionário.

    public Funcionario(String nome, double salarioBase) {
        // Construtor da classe Funcionario.

        this.nome = nome;
        // Guarda o nome recebido.

        this.salarioBase = salarioBase;
        // Guarda o salário base recebido.
    }

    public double calcularSalario() {
        // Método responsável por calcular o salário.

        return salarioBase;
        // Na classe Funcionario, retorna apenas o salário base.
    }
}


class Gerente extends Funcionario {
    // Gerente HERDA de Funcionario através do "extends".

    public Gerente(String nome, double salarioBase) {
        // Construtor do Gerente.

        super(nome, salarioBase);
        // "super" chama o construtor da classe pai, Funcionario.
    }

    @Override
    public double calcularSalario() {
        // Sobrescreve o método calcularSalario() da classe pai.

        return salarioBase + (salarioBase * 0.20);
        // O gerente recebe um bônus de 20% sobre o salário base.
    }
}


class Vendedor extends Funcionario {
    // Vendedor também HERDA de Funcionario.

    private double totalVendas;
    // Guarda o valor total das vendas realizadas pelo vendedor.

    public Vendedor(String nome, double salarioBase,
                    double totalVendas) {
        // Construtor do vendedor.

        super(nome, salarioBase);
        // Chama o construtor da classe Funcionario.

        this.totalVendas = totalVendas;
        // Guarda o total de vendas.
    }

    @Override
    public double calcularSalario() {
        // Sobrescreve o método calcularSalario().

        return salarioBase + (totalVendas * 0.10);
        // O vendedor recebe 10% de comissão sobre suas vendas,
        // além do salário base.
    }
}


public class FuncionariosHeranca {

    public static void main(String[] args) {
        // Método principal.

        Funcionario funcionario =
                new Funcionario("Carlos", 2000);
        // Cria um funcionário comum.

        Gerente gerente =
                new Gerente("Ana", 5000);
        // Cria um gerente com salário base de R$ 5.000.

        Vendedor vendedor =
                new Vendedor("Pedro", 2000, 10000);
        // Cria um vendedor com salário de R$ 2.000
        // e R$ 10.000 em vendas.

        System.out.printf("Funcionário: %s | Salário: R$ %.2f%n",
                funcionario.nome, funcionario.calcularSalario());
        // Mostra os dados do funcionário comum.

        System.out.printf("Gerente: %s | Salário: R$ %.2f%n",
                gerente.nome, gerente.calcularSalario());
        // Mostra os dados do gerente.

        System.out.printf("Vendedor: %s | Salário: R$ %.2f%n",
                vendedor.nome, vendedor.calcularSalario());
        // Mostra os dados do vendedor.
    }
}
