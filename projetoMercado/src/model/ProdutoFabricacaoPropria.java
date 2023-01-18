package model;

public class ProdutoFabricacaoPropria extends Produto {
    private int diasVencimento;

    public ProdutoFabricacaoPropria(int id, String descricao, int categoria, int quantidade, int diasVencimento) {
        super(id, descricao, categoria, quantidade);
        this.diasVencimento = diasVencimento;
    }

    public int getDiasVencimento() {
        return diasVencimento;
    }

    public void setDiasVencimento(int diasVencimento) {
        this.diasVencimento = diasVencimento;
    }

    public void visualizar() {
        System.out.println("Descrição: " + this.getDescricao());
        System.out.println("Categoria: "+this.getCategoria() + " - Produto Fabricado");
        System.out.println("Quantidade: "+this.getQuantidade());
        System.out.println("Vencimento padrão: " + this.diasVencimento + " dias\n");
    }


}