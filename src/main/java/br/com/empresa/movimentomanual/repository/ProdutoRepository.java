package br.com.empresa.movimentomanual.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.empresa.movimentomanual.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, String> {
    Optional<Produto> findById(String codProduto);
}