/*package mercado;
import java.util.Scanner;
public class Venda {
static Scanner ler = new Scanner(System.in);

private static String[][] produto = {
        {"1", "Feijão", "4"},
        {"3", "Arroz", "6"},
        {"4", "Açucar", "7"},
        };
static int[] quantidadeProduto = {0, 0, 0};


public static void main(String[] args) {
        adicionarProduto();
        }

public void listarProduto() {

        for (int i = 0; i < produto.length; i++) {
        for (int j = 0; j < produto[i].length; j++) {
        System.out.print(produto[i][j] + " ");
        }
        System.out.println();
        }
        }

public static void adicionarProduto() {
    System.out.println("teste");
    String resposta = "s";

    while (resposta != "n") {
        System.out.println("Informe a opção: ");
        int opcao = ler.nextInt();
        String produtos = produto[opcao][1];
        System.out.println(produto[opcao][1]);

        System.out.println("Informe a quantidade: ");
        int quantidade = ler.nextInt();
        int descprodutos = Integer.parseInt((produto[quantidade][2]));

        System.out.println((quantidadeProduto[opcao]) + quantidade);

        System.out.println("Vai continuar comprando? (Digite s ou n)");
        resposta = ler.next();
    }
}*/