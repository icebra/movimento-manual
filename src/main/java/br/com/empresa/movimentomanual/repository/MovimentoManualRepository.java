package br.com.empresa.movimentomanual.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.empresa.movimentomanual.model.MovimentoManual;
import br.com.empresa.movimentomanual.model.MovimentoManualId;

public interface MovimentoManualRepository extends JpaRepository<MovimentoManual, MovimentoManualId> {
    Optional<MovimentoManual> findById(MovimentoManualId id);
}