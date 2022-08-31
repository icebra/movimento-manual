package br.com.empresa.movimentomanual.model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "produto_cosif")
public class ProdutoCosif {
	@EmbeddedId
	private ProdutoCosifId id;

	@ManyToOne
	@MapsId("codProduto")
	@JoinColumn(name = "cod_produto")
	private Produto produto;

	@ManyToOne
	@MapsId("movimentoManualId")
	@JoinColumn(name = "id")
	private MovimentoManual movimentoManual;

	@Column(name = "cod_classificacao", nullable = false)
	// @Length(min = 6, message = "*Name must have at least 6 characters")
	private String codClassificacao;

	@Column(name = "sta_status")
	// @Length(max = 1)
	private String staStatus;
}
