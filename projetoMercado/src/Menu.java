package mercado;

import java.util.Scanner;

public class Menu {

    int escolha;
    Scanner ler = new Scanner(System.in);

    public void menu() {
        System.out.println("|----------------------------------|");
        System.out.println("|            Sistema               |");
        System.out.println("|----------------------------------|");
        System.out.println("|                                  |");
        System.out.println("|  1 - Sistema Produto             |");
        System.out.println("|  2 - Sistema Venda               |");
        System.out.println("|  3 - Sair                        |");
        System.out.println("|                                  |");
        System.out.println("|__________________________________|");
    }

    public static void venda() {

        System.out.println("|----------------------------------|");
        System.out.println("|            Venda                 |");
        System.out.println("|----------------------------------|");
        System.out.println("|                                  |");
        System.out.println("|  1 - Sistema Produto             |");
        System.out.println("|  2 - Sistema Venda               |");
        System.out.println("|  3 - Sair                        |");
        System.out.println("|                                  |");
        System.out.println("|__________________________________|");

    }

    public static void produto() {
        System.out.println("|----------------------------------|");
        System.out.println("|            Produto               |");
        System.out.println("|----------------------------------|");
        System.out.println("|                                  |");
        System.out.println("|  1 - Cadastrar Produto           |");
        System.out.println("|  2 - Atualizar Produtos          |");
        System.out.println("|  3 - Listar Produto              |");
        System.out.println("|  4 - Remover Produtos            |");
        System.out.println("|                                  |");
        System.out.println("|__________________________________|");

    }


public void main(String[] args) {
        int opcao;
        do {
            menu();
            opcao = ler.nextInt();

            switch (opcao) {
                case 1:
                    produto();
                    break;

                case 2:
                    venda();
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao == 3);

    }
}



