package model;

public class Produto {
    private int id;
    private int tipo;
    private String descricao;
    private int quantidade;
    private int categoria;

    public Produto(int id, int tipo, String descricao, int categoria, int quantidade) {
        this.tipo = tipo;
        this.descricao = descricao;
        this.categoria = categoria;
        this.quantidade = quantidade;
        this.id = id;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public boolean adicionaProdutoEstoque(int quantidade) {
        if(quantidade > 0) {
            this.quantidade += quantidade;
            System.out.println("Adicionando " + quantidade + "unidades ao estoque");
            return true;
        }
        System.out.println("A quantidade precisa ser maior do que 0!");
        return false;
    }

    public boolean removeProdutoEstoque(int quantidade) {
        if(this.getQuantidade() < quantidade) {
            System.out.printf("Quantidade superior ao estoque!");
            return false;
        }

        this.quantidade -= quantidade;
        System.out.println("Removendo " + quantidade + "unidades do estoque");
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
        System.out.println("——-———————PRODUTO————————-");
        System.out.println("ID: "+this.id);
        System.out.println("DESCRIÇÃO: "+this.getDescricao());
        System.out.println("CATEGORIA: "+this.getCategoria());
        System.out.println("QUANTIDADE: "+this.getQuantidade());
        System.out.println("TIPO: "+this.getTipo());
    }
}
