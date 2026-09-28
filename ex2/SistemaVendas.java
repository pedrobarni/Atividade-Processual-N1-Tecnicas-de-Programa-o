import java.util.Scanner;
// Importa o Scanner para receber os valores das vendas.

public class SistemaVendas {

    public static void main(String[] args) {
        // Método principal onde o programa começa.

        Scanner scanner = new Scanner(System.in);
        // Cria o Scanner para receber dados do usuário.

        System.out.print("Quantidade de vendas: ");
        // Pergunta quantas vendas serão cadastradas.

        int quantidade = scanner.nextInt();
        // Guarda a quantidade de vendas informada.

        double total = 0;
        // Variável que vai armazenar a soma de todas as vendas.

        double maiorVenda = 0;
        // Guarda o maior valor de venda encontrado.

        double menorVenda = 0;
        // Guarda o menor valor de venda encontrado.

        int vendasAcima500 = 0;
        // Conta quantas vendas foram maiores que R$ 500.

        for (int i = 1; i <= quantidade; i++) {
            // Repete o processo até registrar todas as vendas.

            System.out.print("Valor da venda " + i + ": R$ ");
            // Pede o valor da venda atual.

            double venda = scanner.nextDouble();
            // Lê o valor digitado.

            total += venda;
            // Adiciona a venda ao total.
            //
            // É a mesma coisa que:
            // total = total + venda;

            if (i == 1) {
                // Verifica se essa é a primeira venda.

                maiorVenda = venda;
                menorVenda = venda;
                // Como é a primeira venda, ela será inicialmente
                // considerada a maior e a menor.
            } else {

                if (venda > maiorVenda) {
                    // Verifica se a venda atual é maior que a maior
                    // venda registrada anteriormente.

                    maiorVenda = venda;
                    // Se for maior, atualiza o valor.
                }

                if (venda < menorVenda) {
                    // Verifica se a venda atual é menor que a menor
                    // venda registrada anteriormente.

                    menorVenda = venda;
                    // Se for menor, atualiza o valor.
                }
            }

            if (venda > 500) {
                // Verifica se a venda foi maior que R$ 500.

                vendasAcima500++;
                // Aumenta o contador em 1.
            }
        }

        double media = total / quantidade;
        // Calcula a média dividindo o total pela quantidade de vendas.

        double percentual;
        // Variável que armazenará o percentual da comissão.

        if (total <= 1000) {
            // Se o total vendido for até R$ 1.000.

            percentual = 0.03;
            // A comissão será de 3%.
        } else if (total <= 5000) {
            // Se o total for maior que R$ 1.000 e até R$ 5.000.

            percentual = 0.05;
            // A comissão será de 5%.
        } else {
            // Se o total for maior que R$ 5.000.

            percentual = 0.08;
            // A comissão será de 8%.
        }

        double comissao = total * percentual;
        // Calcula o valor da comissão.

        System.out.println("\n===== RESULTADO DAS VENDAS =====");

        System.out.printf("Total vendido: R$ %.2f%n", total);
        // Mostra o total vendido com duas casas decimais.

        System.out.printf("Maior venda: R$ %.2f%n", maiorVenda);
        // Mostra a maior venda.

        System.out.printf("Menor venda: R$ %.2f%n", menorVenda);
        // Mostra a menor venda.

        System.out.printf("Média das vendas: R$ %.2f%n", media);
        // Mostra a média.

        System.out.println("Vendas acima de R$ 500: "
                + vendasAcima500);
        // Mostra quantas vendas passaram de R$ 500.

        System.out.printf("Comissão: R$ %.2f%n", comissao);
        // Mostra o valor da comissão.

        scanner.close();
        // Fecha o Scanner.
    }
}
