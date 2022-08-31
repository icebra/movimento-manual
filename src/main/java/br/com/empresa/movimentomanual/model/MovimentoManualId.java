package br.com.empresa.movimentomanual.model;

import java.io.Serializable;
import java.time.Month;
import java.time.Year;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class MovimentoManualId implements Serializable {
	private static final long serialVersionUID = -880099010098872910L;

	@Column(name = "dat_mes")
	private Month datMes;
	
	@Column(name = "dat_ano")
	private Year datAno;
	
	@Column(name = "num_lancamento")
	private Long numLancamento;
	
	@Column(name = "cod_produto")
	private String codProduto;

	@Column(name = "cod_cosif")
	private String codCosif;
}
