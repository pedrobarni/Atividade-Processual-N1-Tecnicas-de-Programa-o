import java.util.Scanner;

public class SistemaVendas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantidade de vendas: ");
        int quantidade = scanner.nextInt();

        double total = 0;
        double maiorVenda = 0;
        double menorVenda = 0;
        int vendasAcima500 = 0;

        for (int i = 1; i <= quantidade; i++) {
            System.out.print("Valor da venda " + i + ": R$ ");
            double venda = scanner.nextDouble();

            total += venda;

            if (i == 1) {
                maiorVenda = venda;
                menorVenda = venda;
            } else {
                if (venda > maiorVenda) {
                    maiorVenda = venda;
                }

                if (venda < menorVenda) {
                    menorVenda = venda;
                }
            }

            if (venda > 500) {
                vendasAcima500++;
            }
        }

        double media = total / quantidade;
        double percentual;

        if (total <= 1000) {
            percentual = 0.03;
        } else if (total <= 5000) {
            percentual = 0.05;
        } else {
            percentual = 0.08;
        }

        double comissao = total * percentual;

        System.out.println("\n===== RESULTADO DAS VENDAS =====");
        System.out.printf("Total vendido: R$ %.2f%n", total);
        System.out.printf("Maior venda: R$ %.2f%n", maiorVenda);
        System.out.printf("Menor venda: R$ %.2f%n", menorVenda);
        System.out.printf("Média das vendas: R$ %.2f%n", media);
        System.out.println("Vendas acima de R$ 500: "
                + vendasAcima500);
        System.out.printf("Comissão: R$ %.2f%n", comissao);

        scanner.close();
    }
}