package model;

public class ProdutoComprado extends Produto {
    private String marca;

    public ProdutoComprado(int id, int tipo, String descricao, int categoria, int quantidade, String marca) {
        super(id, tipo, descricao, categoria, quantidade);
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void visualizar() {
        super.visualizar();
        System.out.println("MARCA: " + this.getMarca());
    }
}