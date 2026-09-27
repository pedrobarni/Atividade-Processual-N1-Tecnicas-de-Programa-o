import java.util.Scanner; //importação do scanner pra verificar os valores

public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //efetivação do scanner dentro do sistema

        int[] notas = {200, 100, 50, 20, 10, 5, 2}; //notas que serão utilizadas para chegar ao valor

        System.out.print("Digite o valor do saque: R$ "); //sistema pede valor do saque
        int valor = scanner.nextInt();

        System.out.println("\nNotas necessárias:"); //resultado

        for (int nota : notas) {
            int quantidade = valor / nota; //quantidade é igual a valor dividido pela nota

            if (quantidade > 0) {
                System.out.println(quantidade + " x R$ " + nota);
                valor = valor % nota;
            }
        }

        if (valor > 0) {
            System.out.println("Não foi possível devolver R$ "
                    + valor + " usando as notas disponíveis.");
        }

        scanner.close();
    }
}