package ProjetoMercado;

import java.util.Scanner;

public class MenuMercado {
    public static void main(String[] args) {
        TesteMenu menu;

        int opcao,opcao1, opcao2, opcao3, adicionado;
        Scanner ler = new Scanner(System.in);

        while (true) {
            System.out.println("|----------------------------------|");
            System.out.println("|            Sistema               |");
            System.out.println("|----------------------------------|");
            System.out.println("|                                  |");
            System.out.println("|  1 - Iniciar                     |");
            System.out.println("|  2 - Sair                        |");
            System.out.println("|                                  |");
            System.out.println("|__________________________________|");
            System.out.println("\n");
            System.out.println("Entre com a opção desejada:                          ");
            System.out.println("                                                     ");
            opcao = ler.nextInt();

            switch (opcao) {
                case 1:
                    if (opcao == 1) {
                        System.out.println("\n|----------------------------------|");
                        System.out.println("|         Sistema Produto             |");
                        System.out.println("|----------------------------------|");
                        System.out.println("|                                  |");
                        System.out.println("|  1 - Insira produto           |");
                        System.out.println("|  2 - Sair                        |");
                        System.out.println("|                                  |");
                        System.out.println("|__________________________________|");

                        System.out.println("Entre com a opção desejada:                          ");
                        System.out.println("                                                     ");
                        opcao1 =ler.nextInt();
                                if (opcao1 ==1);{

                                    System.out.println("Insira o codigo do produto: ");
                                    adicionado = ler.nextInt();
                                }
                                    if (opcao1 == 2);{
                                        System.out.println("Programa Finalizado");
                                        ler.close();
                                        System.exit(0);

                                    }
                    }
                    break;


            }
        }
    }

}
