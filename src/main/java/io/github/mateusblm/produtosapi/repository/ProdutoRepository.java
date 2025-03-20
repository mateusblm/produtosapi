package io.github.mateusblm.produtosapi.repository;


import io.github.mateusblm.produtosapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

// Classe que encapsula as operações de persistência na classe produto
public interface ProdutoRepository extends JpaRepository<Produto, String> {
}
