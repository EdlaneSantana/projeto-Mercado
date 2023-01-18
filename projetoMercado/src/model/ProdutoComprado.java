package model;

public class ProdutoComprado extends Produto {
    private String marca;

    public ProdutoComprado(int id, String descricao, int categoria, int quantidade, String marca) {
        super(id, descricao, categoria, quantidade);
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void visualizar() {
        System.out.println("Descrição: " + this.getDescricao());
        System.out.println("Quantidade: " + this.getQuantidade());
        System.out.println("Categoria: "+this.getCategoria() + " - Produto Comprado\n");
    }
}