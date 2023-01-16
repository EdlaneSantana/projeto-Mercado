import java.util.Scanner;

public class MenuMercado {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        alteraEstoque();
        cadastraProduto();
        atualizaProduto();
        deletaProduto();
        listarProdutos();
        procurarPorId();
        visualizarQuantidade();
    }
}
