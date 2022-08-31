package br.com.empresa.movimentomanual.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import br.com.empresa.movimentomanual.model.Produto;

public interface ProdutoService {
	Optional<Produto> findById(Long id);

	Page<Produto> findAllProductsPageable(Pageable pageable);
}
