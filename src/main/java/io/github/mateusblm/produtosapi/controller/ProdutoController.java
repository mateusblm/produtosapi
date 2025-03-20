package io.github.mateusblm.produtosapi.controller;

import io.github.mateusblm.produtosapi.model.Produto;
import io.github.mateusblm.produtosapi.repository.ProdutoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

//Classe da API
@RestController
@RequestMapping("produtos")
public class ProdutoController {

    private ProdutoRepository produtoRepository;

    public ProdutoController(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @PostMapping  //Operação para salvar produto
    public Produto salvar(@RequestBody Produto produto) {
        System.out.println("Produto recebido: " + produto);

        var id = UUID.randomUUID().toString();
        produto.setId(id);

        produtoRepository.save(produto);
        return produto;
    }

    @GetMapping("/{id}")
    public Produto obterPorId(@PathVariable("id") String id) {
        Optional<Produto> byId = produtoRepository.findById(id);
        return byId.orElse(null);

    }

    @DeleteMapping("{id}")
    public void deletar(@PathVariable("id") String id) {
        produtoRepository.deleteById(id);
    }

    @PutMapping("{id}")
    public void atualizar(@PathVariable("id") String id,
                          @RequestBody Produto produto) {
        produto.setId(id);
        produtoRepository.save(produto);

    }

    @GetMapping
    public List<Produto> buscar(@RequestParam("nome") String nome){ //, @RequestParam("preco") Double preco)
        // return produtoRepository.findByPreco(preco);
        return produtoRepository.findByNome(nome);
    }
}
