package br.com.empresa.movimentomanual.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import br.com.empresa.movimentomanual.model.MovimentoManual;

public interface MovimentoManualService {
	Optional<MovimentoManual> findById(Long id);

	Page<MovimentoManual> findAllMovimentoManualsPageable(Pageable pageable);
}
