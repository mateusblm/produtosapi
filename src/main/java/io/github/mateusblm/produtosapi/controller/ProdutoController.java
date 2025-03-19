package io.github.mateusblm.produtosapi.controller;

import io.github.mateusblm.produtosapi.model.Produto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("produtos")
public class ProdutoController {

    @PostMapping
    public void salvar(@RequestBody Produto produto) {
        System.out.println("Produto recebido: " + produto);
    }
}
