public class Produto {
    int id;
    String descricao;
    int quantidade;
    int categoria;

    public Produto(int codigo, String descricao, int categoria) {
        this.id = codigo;
        this.descricao = descricao;
        this.categoria = categoria;
    }

    public int visualizarQuantidade() {
        return this.quantidade;
    }

    public void adicionaEstoque(int quantidade) {
        this.quantidade += quantidade;
    }

    public void removeEstoque(int quantidade) {
        if(quantidade < this.quantidade) {
            this.quantidade -= quantidade;
        }
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

    }
}
