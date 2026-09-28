import java.util.Scanner;
// Importa o Scanner para podermos receber informações
// digitadas pelo usuário.

public class CaixaEletronico {

    public static void main(String[] args) {
        // Método principal. É onde o programa começa a ser executado.

        Scanner scanner = new Scanner(System.in);
        // Cria o Scanner para ler os dados digitados no teclado.

        int[] notas = {200, 100, 50, 20, 10, 5, 2};
        // Cria um vetor com as notas disponíveis no caixa.
        // Elas estão organizadas da maior para a menor.

        System.out.print("Digite o valor do saque: R$ ");
        // Solicita ao usuário o valor que deseja sacar.

        int valor = scanner.nextInt();
        // Lê o valor digitado e guarda na variável "valor".

        System.out.println("\nNotas necessárias:");
        // Mostra o título antes de apresentar as notas.

        for (int nota : notas) {
            // Percorre cada nota existente no vetor.
            // Primeiro: 200
            // Depois: 100, 50, 20, 10, 5 e 2.

            int quantidade = valor / nota;
            // Divide o valor restante pelo valor da nota.
            // Isso mostra quantas notas daquele valor cabem no saque.
            

            if (quantidade > 0) {
                // Verifica se pelo menos uma nota daquele valor
                // será necessária.

                System.out.println(quantidade + " x R$ " + nota);
                // Mostra na tela a quantidade e o valor da nota.

                valor = valor % nota;
                // O operador % calcula o RESTO da divisão.
                
            }
        }

        if (valor > 0) {
            // Verifica se ainda ficou algum valor que não pode
            // ser formado pelas notas disponíveis.

            System.out.println("Não foi possível devolver R$ "
                    + valor + " usando as notas disponíveis.");
            // Mostra o valor que não pôde ser devolvido.
        }

        scanner.close();
        // Fecha o Scanner porque ele não será mais utilizado.
    }
}
