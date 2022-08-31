package br.com.empresa.movimentomanual.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import br.com.empresa.movimentomanual.model.ProdutoCosif;

public interface ProdutoCosifService {
	Optional<ProdutoCosif> findById(Long id);

	Page<ProdutoCosif> findAllProductCosifsPageable(Pageable pageable);
}
