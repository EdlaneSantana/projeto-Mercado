package controller;

import model.Produto;
import java.util.ArrayList;

public class ProdutoController{
    public ArrayList<Produto> listaProdutos = new ArrayList<Produto>();

    public void cadastraProduto(Produto produto) {
        listaProdutos.add(produto);
        produto.visualizar();
        System.out.println("Produto cadastrado com sucesso!\n");
//        System.out.println("Código: " + (produto.getId()));
    }

    public void atualizaProduto(Produto produto) {
        var buscarProduto = buscarNosProdutos(produto.getId());
        if (buscarProduto != null){
            listaProdutos.set(listaProdutos.indexOf(buscarProduto), produto);
            System.out.println("Produto alterado: " + produto.getId());
        } else
            System.out.println("Não foi encontrado!");
    }

    public void adicionaProdutoEstoque(int id, int quantidade) {
        var buscaProduto = buscarNosProdutos(id);

        if (buscaProduto != null) {
            if(buscaProduto.adicionaProdutoEstoque(quantidade)) {
                System.out.println("Alteração feita com sucesso");
            }

        } else
            System.out.println("Mensagem de erro");
    }

    public void removeProdutoEstoque(int id, int quantidade) {
        var buscaProduto = buscarNosProdutos(id);

        if (buscaProduto != null) {
            if(buscaProduto.removeProdutoEstoque(quantidade)) {
                System.out.println("Alteração feita com sucesso");
            }
        } else
            System.out.println("Mensagem de erro");
    }

    public void buscaPorId(int id) {
        var produto = buscarNosProdutos(id);

        if(produto == null) {
            System.out.println("Produto não identificado");
        } else
            produto.visualizar();
    }

    public void listaTodos() {
        for (var produto : listaProdutos) {
            produto.visualizar();
        }
    }

    public void deletaProduto(int id) {
        var produto = listaProdutos.get(id);

        if(produto != null){
            if(listaProdutos.remove(produto) == true) {
                System.out.println("Produto excluído com sucesso!");
            }
        } else
            System.out.println("Erro ao excluir produto - ID não encontrado");
    }

    public Produto buscarNosProdutos(int id) {
        for (var produto : listaProdutos) {
            if (produto.getId() == id) {
                return produto;
            }
        }
        return null;
    }
}
