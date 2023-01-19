import java.util.InputMismatchException;
import java.util.Scanner;

import controller.ProdutoController;
import model.CoresMercado;
import model.Produto;
import model.ProdutoComprado;
import model.ProdutoFabricacaoPropria;

public class MenuMercado {


    static Scanner ler = new Scanner(System.in);
    static ProdutoController produtos = new ProdutoController();

    public static void main(String[] args) {
        int opcao =0;
        System.out.println(CoresMercado.TEXT_GREEN );
        ProdutoComprado nome = new ProdutoComprado(1, 1, "Arroz", 1, 100, "CAMPEIRO");
        ProdutoComprado nome1 = new ProdutoComprado(2, 1, "Feijão", 1, 40, "CARIOCA");
        ProdutoComprado nome2 = new ProdutoComprado(3, 1, "Óleo", 2, 30, "LIZA");
        ProdutoComprado nome3 = new ProdutoComprado(6, 1, "Azeite", 2, 200, "GALLO");

        produtos.cadastraProduto(nome);
        produtos.cadastraProduto(nome1);
        produtos.cadastraProduto(nome2);
        produtos.cadastraProduto(nome3);

        String TEXT_YELLOW_BRIGHT = "\033[0;93m";
        System.out.println(TEXT_YELLOW_BRIGHT);

        while (true) {
            System.out.println(CoresMercado.TEXT_GREEN
                              +"------------------------------");
            System.out.println("-------------MENU-------------" +
                    "\n1 - Cadastro de produtos" +
                    "\n2 - Atualizar cadastro de produtos" +
                    "\n3 - Alterar quantidade de estoque do produtos" +
                    "\n4 - Buscar produto por ID" +
                    "\n5 - Listar todos os produtos" +
                    "\n6 - Deletar produto" +
                    "\n7 - Sair");
            System.out.println("Digite a opção desejada: ");
            try {
                opcao = ler.nextInt();
            } catch (InputMismatchException e) {
                System.out.println(CoresMercado.TEXT_RED_BOLD +"\nDi1gite valores inteiros!");
                ler.nextLine();
                opcao = 0;
            }

            if (opcao == 7) {
                System.out.println(CoresMercado.TEXT_BLACK_BOLD +"Mensagem de saída do programa");
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
                default -> System.out.println(CoresMercado.TEXT_RED_BOLD +"\nOpção Inválida!\n" + CoresMercado.TEXT_RESET);
            }

        }

    }

    public static void cadastroProdutos() {
        int tipo;
        do {
            System.out.println(CoresMercado.TEXT_GREEN);
            System.out.println("Digite o Tipo do Produto: \n 1 - Produto Fabricação Prória \n 2 - Produto Comprado");
            tipo = ler.nextInt();
        } while (tipo < 1 || tipo > 2);

        System.out.println("Informe a descrição: ");
        String descricao = ler.next();
        System.out.println(CoresMercado.TEXT_GREEN);
        System.out.println("Informe a categoria: \n 1 - Alimentos \n 2 - Objetos");
        int categoria = ler.nextInt();

        System.out.println("Informe a quantidade: ");
        int quantidade = ler.nextInt();

        switch (tipo) {
            case 1 -> {
                System.out.println("Informe o vencimento padrão: ");
                int vencimentoPadrao = ler.nextInt();
                produtos.cadastraProduto(
                        new ProdutoFabricacaoPropria(produtos.geraId(), tipo, descricao, categoria, quantidade, vencimentoPadrao));
            }

            case 2 -> {
                System.out.println("Digite a marca: ");
                String marca = ler.next();
                produtos.cadastraProduto(
                        new ProdutoComprado(produtos.geraId(), tipo, descricao, categoria, quantidade, marca));
            }
        }
    }

    public static void atualizaCadastro() {
        System.out.println("Digite o ID do produto: ");
        int id;

        do {
            id = ler.nextInt();
            if (produtos.buscarNosProdutos(id) == null) {
                System.out.println("Código de produto inválido! Digite novamente.");
            }
        } while (produtos.buscarNosProdutos(id) == null);

        Produto alteraProduto = produtos.buscarNosProdutos(id);

        System.out.println("SELECINE O QUE DESEJA ALTERAR:" +
                "\n1 - Tipo" +
                "\n2 - Descrição" +
                "\n3 - Categoria");

        if (alteraProduto.getTipo() == 1) {
            System.out.println("4 - Vencimento Padrão");
        }
        if (alteraProduto.getTipo() == 2) {
            System.out.println("4 - Marca");
        }

        int opcao = ler.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Digite o novo Tipo: ");
                int tipo = ler.nextInt();
                alteraProduto.setTipo(tipo);
                break;
            case 2:
                System.out.println("Digite o novo Descrição: ");
                String descricao = ler.nextLine();
                alteraProduto.setDescricao(descricao);
                break;
            case 3:
                System.out.println("Digite o novo Categoria: ");
                int categoria = ler.nextInt();
                alteraProduto.setCategoria(categoria);
                break;
            case 4:
                if (produtos.buscarNosProdutos(id).getTipo() == 1) {
                    System.out.println("Digite o novo Vencimento Padrão.");
                    int vencimentoPadrao = ler.nextInt();
                    produtos.atualizaProduto(new ProdutoFabricacaoPropria(alteraProduto.getId(), alteraProduto.getTipo(), alteraProduto.getDescricao(), alteraProduto.getCategoria(), alteraProduto.getQuantidade(), vencimentoPadrao));
                }
                if (produtos.buscarNosProdutos(id).getTipo() == 2) {
                    System.out.println("Digite a nova Marca.");
                    String marca = ler.nextLine();
                    produtos.atualizaProduto(new ProdutoComprado(alteraProduto.getId(), alteraProduto.getTipo(), alteraProduto.getDescricao(), alteraProduto.getCategoria(), alteraProduto.getQuantidade(), marca));
                }
        }
    }

    public static void alteraEstoque() {
        int id, opcao;
        System.out.println("1 - Adicionar produtos ao estoque" +
                "2 - Remover produtos do estoque");
        opcao = ler.nextInt();

        System.out.println("Digite o código do produto");
        do {
            id = ler.nextInt();
            if (produtos.buscarNosProdutos(id) == null) {
                System.out.println("Código de produto inválido! Digite novamente.");
            }
        } while (produtos.buscarNosProdutos(id) == null);

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
        int numero = ler.nextInt();

        if (numero > produtos.listaProdutos.size()) {
            System.out.println("Produto não existente");
            System.exit(0);
        }
        produtos.buscaPorId(numero);
    }

    public static void deletaProduto() {
        System.out.println("Digite o ID do produto:");
        int id = ler.nextInt();

        produtos.deletaProduto(id);
    }
}
