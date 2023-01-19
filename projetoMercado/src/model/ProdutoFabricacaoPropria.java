package model;

public class ProdutoFabricacaoPropria extends Produto {
    private int diasVencimento;

    public ProdutoFabricacaoPropria(int id, int tipo, String descricao, int categoria, int quantidade, int diasVencimento) {
        super(id, tipo, descricao, categoria, quantidade);
        this.diasVencimento = diasVencimento;
    }

    public int getDiasVencimento() {
        return diasVencimento;
    }

    public void setDiasVencimento(int diasVencimento) {
        this.diasVencimento = diasVencimento;
    }

    public void visualizar() {
        super.visualizar();
        System.out.println("VENCIMENTO PADRÃO: " + this.diasVencimento + " dias");
    }
}