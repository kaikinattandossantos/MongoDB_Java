package com.example.danylinho.service;

import org.springframework.stereotype.Service;
import com.example.danylinho.model.Produto;
import com.example.danylinho.repository.ProdutoRepository;
import java.util.List; 

@Service
public class ProdutoService {

    private final ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public Produto criarProduto(Produto produto) {
        return produtoRepository.save(produto);
    }


    public List<Produto> listarTodosProdutos() {
        return produtoRepository.findAll();
    }
}