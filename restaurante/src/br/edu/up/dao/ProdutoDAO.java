package br.edu.up.dao;

import br.edu.up.model.Produto;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO implements DAO<Produto> {
    private List<Produto> produtos = new ArrayList<>();

    @Override
    public void adicionar(Produto produto) {
        produtos.add(produto);
    }

    @Override
    public Produto buscar(String nome) {
        for (Produto p : produtos) {
            if (p.getNome().equals(nome)) {
                return p;
            }
        }
        return null;
    }

    @Override
    public List<Produto> listar() {
        return new ArrayList<>(produtos);
    }

    @Override
    public void atualizar(Produto produto) {
        Produto existente = buscar(produto.getNome());
        if (existente != null) {
            existente.setNome(produto.getNome());
            existente.setPreco(produto.getPreco());
        }
    }

    @Override
    public void remover(String nome) {
        Produto produto = buscar(nome);
        if (produto != null) {
            produtos.remove(produto);
        }
    }
}