package model;

public abstract class Produto {
    static int id = 1;
    private String descricao;
    private int quantidade;
    private int categoria;

    public Produto(int codigo, String descricao, int categoria, int quantidade) {
        this.id = codigo;
        this.descricao = descricao;
        this.categoria = categoria;
        this.quantidade = quantidade;
        id++;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public void adicionaProdutoEstoque(int quantidade) {
        this.quantidade += quantidade;
    }

    public boolean removeProdutoEstoque(int quantidade) {
        if(this.getQuantidade() < quantidade) {
            System.out.printf("Quantidade superior ao estoque!");
            return false;
        }

        this.quantidade -= quantidade;
        return true;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void visualizar() {
        System.out.println("Visualizar produto.");
    }
}
