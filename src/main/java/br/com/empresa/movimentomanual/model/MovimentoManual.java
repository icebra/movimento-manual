package br.com.empresa.movimentomanual.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "movimento_manual")
public class MovimentoManual {
	@EmbeddedId
	private MovimentoManualId id;

	@Column(name = "des_descricao", nullable = false, unique = true)
	private String desDescricao;

	@Column(name = "dat_movimento", nullable = false, unique = true)
	private LocalDateTime datMovimento;

	@Column(name = "cod_usuario", nullable = false)
	// @Length(min = 15, message = "*Cod usuario must have at least 15 characters")
	private String codUsuario;

	@Column(name = "val_valor")
	private BigDecimal valValor;
}
