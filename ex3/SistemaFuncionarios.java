class Funcionario {
    String nome;
    String cargo;
    double salario;

    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public void aumentarSalario(double percentual) {
        salario = salario + (salario * percentual / 100);
    }

    public double calcularSalarioAnual() {
        return salario * 12;
    }

    public void exibirDados() {
        System.out.println("\nNome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.printf("Salário mensal: R$ %.2f%n", salario);
        System.out.printf("Salário anual: R$ %.2f%n",
                calcularSalarioAnual());
    }
}

public class SistemaFuncionarios {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Pedro", "Analista", 3000);
        Funcionario f2 = new Funcionario("Ana", "Gerente", 5000);
        Funcionario f3 = new Funcionario("Carlos", "Vendedor", 2500);
        Funcionario f4 = new Funcionario("Mariana", "Assistente", 2200);
        Funcionario f5 = new Funcionario("João", "Supervisor", 4000);

        f1.aumentarSalario(10);
        f2.aumentarSalario(15);
        f3.aumentarSalario(8);
        f4.aumentarSalario(12);
        f5.aumentarSalario(5);

        f1.exibirDados();
        f2.exibirDados();
        f3.exibirDados();
        f4.exibirDados();
        f5.exibirDados();
    }
}