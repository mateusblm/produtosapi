package io.github.mateusblm.produtosapi.controller;

import io.github.mateusblm.produtosapi.model.Produto;
import io.github.mateusblm.produtosapi.repository.ProdutoRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

//Classe da API
@RestController
@RequestMapping("produtos")
public class ProdutoController {

    private ProdutoRepository produtoRepository;

    public ProdutoController(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @PostMapping
    public Produto salvar(@RequestBody Produto produto) {
        System.out.println("Produto recebido: " + produto);
        var id = UUID.randomUUID().toString();
        produto.setId(id);
        produtoRepository.save(produto);

        return produto;
    }
}
