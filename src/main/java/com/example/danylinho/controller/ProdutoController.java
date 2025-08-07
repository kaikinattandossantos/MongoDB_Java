package com.example.danylinho.controller;

import org.springframework.web.bind.annotation.*;
import com.example.danylinho.model.Produto;
import com.example.danylinho.service.ProdutoService;
import java.util.List;


@RestController

@RequestMapping("/api/produtos")
public class ProdutoController {

    private final ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @PostMapping
    public Produto criarProduto(@RequestBody Produto produto) {
        return produtoService.criarProduto(produto);
    }


    @GetMapping
    public List<Produto> listarTodosProdutos() {
        return produtoService.listarTodosProdutos();
    }
}