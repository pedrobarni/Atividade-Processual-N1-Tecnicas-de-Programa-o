class Funcionario {
    // Cria a classe Funcionario.

    String nome;
    // Armazena o nome do funcionário.

    String cargo;
    // Armazena o cargo do funcionário.

    double salario;
    // Armazena o salário mensal.

    public Funcionario(String nome, String cargo, double salario) {
        // Construtor da classe.
        // Ele é utilizado para criar um funcionário já com seus dados.

        this.nome = nome;
        // O "this.nome" representa o atributo da classe.
        // Ele recebe o nome informado no construtor.

        this.cargo = cargo;
        // Guarda o cargo informado.

        this.salario = salario;
        // Guarda o salário informado.
    }

    public void aumentarSalario(double percentual) {
        // Método responsável por aumentar o salário.
        // Recebe o percentual de aumento como parâmetro.

        salario = salario + (salario * percentual / 100);
        // Calcula o valor do aumento e adiciona ao salário atual.
        //
        // Exemplo:
        // Salário = 3000
        // Aumento = 10%
        // 3000 * 10 / 100 = 300
        // Novo salário = 3300
    }

    public double calcularSalarioAnual() {
        // Método que calcula o salário anual.

        return salario * 12;
        // Multiplica o salário mensal por 12 meses.
    }

    public void exibirDados() {
        // Método responsável por mostrar os dados do funcionário.

        System.out.println("\nNome: " + nome);
        // Mostra o nome.

        System.out.println("Cargo: " + cargo);
        // Mostra o cargo.

        System.out.printf("Salário mensal: R$ %.2f%n", salario);
        // Mostra o salário mensal com duas casas decimais.

        System.out.printf("Salário anual: R$ %.2f%n",
                calcularSalarioAnual());
        // Chama o método calcularSalarioAnual()
        // para mostrar o salário anual.
    }
}


public class SistemaFuncionarios {

    public static void main(String[] args) {
        // Método principal.

        Funcionario f1 =
                new Funcionario("Pedro", "Analista", 3000);
        // Cria o primeiro funcionário.

        Funcionario f2 =
                new Funcionario("Ana", "Gerente", 5000);
        // Cria o segundo funcionário.

        Funcionario f3 =
                new Funcionario("Carlos", "Vendedor", 2500);
        // Cria o terceiro funcionário.

        Funcionario f4 =
                new Funcionario("Mariana", "Assistente", 2200);
        // Cria o quarto funcionário.

        Funcionario f5 =
                new Funcionario("João", "Supervisor", 4000);
        // Cria o quinto funcionário.

        f1.aumentarSalario(10);
        // Aumenta o salário de Pedro em 10%.

        f2.aumentarSalario(15);
        // Aumenta o salário de Ana em 15%.

        f3.aumentarSalario(8);
        // Aumenta o salário de Carlos em 8%.

        f4.aumentarSalario(12);
        // Aumenta o salário de Mariana em 12%.

        f5.aumentarSalario(5);
        // Aumenta o salário de João em 5%.

        f1.exibirDados();
        f2.exibirDados();
        f3.exibirDados();
        f4.exibirDados();
        f5.exibirDados();
        // Exibe os dados dos cinco funcionários.
    }
}
