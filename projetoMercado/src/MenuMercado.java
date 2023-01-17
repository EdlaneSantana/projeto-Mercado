import java.util.Scanner;
import controller.ProdutoController;
import model.ProdutoComprado;
import model.ProdutoFabricacaoPropria;
import org.w3c.dom.CDATASection;

import javax.swing.*;

public class MenuMercado {
    static Scanner ler = new Scanner(System.in);
    static ProdutoController produtos = new ProdutoController();

    public static void main(String[] args) {
        int opcao;
        //criar produtos de teste;

        while(true) {
            System.out.println("-------------ESTOQUE-------------" +
                               "1 - Cadastro de produtos" +
                               "2 - Atualizar cadastro de produtos" +
                               "3 - Alterar estoque de produtos" +
                               "4 - Buscar produto por ID" +
                               "5 - Listar todos os produtos" +
                               "6 - Deletar produto" +
                               "7 - Sair");
            opcao = ler.nextInt();
            //fazer o controle de entrada de dados

            if (opcao == 7) {
                System.out.println("Mensagem de saída do programa");
                ler.close();
                System.exit(0);
            }

            switch (opcao) {
                case 1 -> cadastroProdutos();
                case 2 -> atualizaCadastro();
                case 3 -> alteraEstoque();
                case 4 -> buscaPorId();
                case 5 -> produtos.listaTodos();
                case 6 -> deletaProduto();
                default -> System.out.println("\nOpção Inválida!\n");
            }

        }

    }

    public static void cadastroProdutos() {
        int tipo;
        do {
            System.out.println("Digite o Tipo do Produto: ");
            tipo = ler.nextInt();
        } while (tipo < 1 && tipo > 2);
        int codigo = 0, categoria = 1, quantidade = 1;
        String descricao = "a";
        //Fazer os pedidos das informações

        switch (tipo) {
            case 1 -> {
                int tipoVencimento = 1;
                System.out.println("O vencimento desse produto se dá em quantos dias: ");
                produtos.cadastraProduto(
                        new ProdutoFabricacaoPropria(codigo, descricao, categoria, quantidade, tipoVencimento));
            }
            case 2 -> {
                String marca = "";
                System.out.println("Digite a marca: ");
                produtos.cadastraProduto(
                        new ProdutoComprado(codigo, descricao, categoria, quantidade, marca));
            }
        }
    }

    public static void atualizaCadastro() {

    }

    public static void alteraEstoque() {
        int id;
        System.out.println("1 - Adicionar produtos ao estoque" +
                           "2 - Remover produtos do estoque");
        int opcao = ler.nextInt();

        System.out.println("Digite o código do produto");
        do {
            id = ler.nextInt();
            if(produtos.buscarNaCollection(id) == null) {
                System.out.println("Código de produto inválido! Digite novamente.");
            }
        } while(produtos.buscarNaCollection(id) != null);

        System.out.println("Quantidade: ");
        int quantidade = ler.nextInt();

        switch (opcao) {
            case 1 -> produtos.adicionaProdutoEstoque(id, quantidade);
            case 2 -> produtos.removeProdutoEstoque(id, quantidade);
            default -> System.out.println("Opção inválida!");
        }
    }

    public static void buscaPorId() {
        System.out.println("Digite o ID do produto:");
        int id = ler.nextInt();

        produtos.buscaPorId(id);
    }

    public static void deletaProduto() {
        System.out.println("Digite o ID do produto:");
        int id = ler.nextInt();

        produtos.deletaProduto(id);
    }
}
