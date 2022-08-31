package br.com.empresa.movimentomanual.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class ProdutoCosifId implements Serializable {
	private static final long serialVersionUID = 1151165190818092429L;

	@Column(name = "cod_produto")
	private String codProduto;

	@Column(name = "cod_cosif")
	private String codCosif;
}
