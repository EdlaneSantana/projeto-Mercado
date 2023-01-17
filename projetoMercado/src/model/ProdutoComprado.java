package model;

public class ProdutoComprado extends Produto {
    private String marca;

    public ProdutoComprado(int codigo, String descricao, int categoria, int quantidade, String marca) {
        super(codigo, descricao, categoria, quantidade);
        this.marca = marca;
    }

    public void visualizar() {
        System.out.println("Marca: " + this.marca);
    }
}