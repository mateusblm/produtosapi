package io.github.mateusblm.produtosapi.repository;


import io.github.mateusblm.produtosapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.security.SecureRandom;
import java.util.List;

// Classe que encapsula as operações de persistência na classe produto
public interface ProdutoRepository extends JpaRepository<Produto, String> {

    List<Produto> findByNome(String nome);
    List<Produto> findByPreco(Double preco);

}
