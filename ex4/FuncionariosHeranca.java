
class Funcionario {
    protected String nome;
    protected double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public double calcularSalario() {
        return salarioBase;
    }
}

class Gerente extends Funcionario {

    public Gerente(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return salarioBase + (salarioBase * 0.20);
    }
}

class Vendedor extends Funcionario {
    private double totalVendas;

    public Vendedor(String nome, double salarioBase,
                    double totalVendas) {
        super(nome, salarioBase);
        this.totalVendas = totalVendas;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + (totalVendas * 0.10);
    }
}

public class FuncionariosHeranca {
    public static void main(String[] args) {
        Funcionario funcionario =
                new Funcionario("Carlos", 2000);

        Gerente gerente =
                new Gerente("Ana", 5000);

        Vendedor vendedor =
                new Vendedor("Pedro", 2000, 10000);

        System.out.printf("Funcionário: %s | Salário: R$ %.2f%n",
                funcionario.nome, funcionario.calcularSalario());

        System.out.printf("Gerente: %s | Salário: R$ %.2f%n",
                gerente.nome, gerente.calcularSalario());

        System.out.printf("Vendedor: %s | Salário: R$ %.2f%n",
                vendedor.nome, vendedor.calcularSalario());
    }
}