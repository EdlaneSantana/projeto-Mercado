package model;

public class ProdutoFabricacaoPropria extends Produto {
    private int dataFabricacao;

    public ProdutoFabricacaoPropria(int codigo, String descricao, int categoria, int quantidade, int dataFabricacao) {
        super(codigo, descricao, categoria, quantidade);
        this.dataFabricacao = dataFabricacao;
    }
}
