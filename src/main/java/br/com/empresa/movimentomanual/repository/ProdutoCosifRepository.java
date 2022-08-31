package br.com.empresa.movimentomanual.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.empresa.movimentomanual.model.ProdutoCosif;
import br.com.empresa.movimentomanual.model.ProdutoCosifId;

public interface ProdutoCosifRepository extends JpaRepository<ProdutoCosif, ProdutoCosifId> {
	Optional<ProdutoCosif> findById(ProdutoCosifId id);
}