package model;

public class ProdutoFabricacaoPropria extends Produto {
    private int diasVencimento;

    public ProdutoFabricacaoPropria(int codigo, String descricao, int categoria, int quantidade, int diasVencimento) {
        super(codigo, descricao, categoria, quantidade);
        this.diasVencimento = diasVencimento;
    }

    public void visualizar() {
        System.out.println("Vencimento padrão: " + this.diasVencimento + "dias");
    }
}
