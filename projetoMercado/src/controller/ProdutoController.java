package controller;

import model.Produto;
import java.util.ArrayList;

public class ProdutoController{
    private ArrayList<Produto> listaProdutos = new ArrayList<Produto>();

    public void cadastraProduto(Produto produto) {
        listaProdutos.add(produto);
        System.out.println("Mensagem de criação");
    }

    public void atualizaProduto(Produto produto) {

    }

    public void adicionaProdutoEstoque(int id, int quantidade) {

    }

    public void removeProdutoEstoque(int id, int quantidade) {
        var buscaProduto = buscarNaCollection(id);

        if (buscaProduto != null) {
            if(listaProdutos.get(listaProdutos.indexOf(listaProdutos)).removeProdutoEstoque(quantidade))
                System.out.println("Mensagem de sucesso");

        } else
            System.out.println("Mensagem de erro");
    }

    public void buscaPorId(int id) {
        var produto = buscarNaCollection(id);

        if (produto != null)
            produto.visualizar();
        else
            System.out.println("\nO produto de ID " + id + " não existe.");
    }

    public void listaTodos() {
        for (var produto : listaProdutos) {
            produto.visualizar();
        }
    }

    public void deletaProduto(int id) {
        var produto = buscarNaCollection(id);

        if (produto != null) {
            if(listaProdutos.remove(produto))
                System.out.println("Mensagem de delete");
        } else
            System.out.println("Mensagem de erro");
    }

    public Produto buscarNaCollection(int id) {
        for (var produto : listaProdutos) {
            if (produto.getId() == id) {
                return produto;
            }
        }
        return null;
    }
}
