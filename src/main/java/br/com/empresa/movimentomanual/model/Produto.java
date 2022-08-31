package br.com.empresa.movimentomanual.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "produto")
public class Produto {
	@Id
	@Column(name = "cod_produto", nullable = false)
	// @Length(min = 4, message = "*Name must have at least 4 characters")
	private String codProduto;

	@Column(name = "des_produto", nullable = false, unique = true)
	private String desProduto;

	@Column(name = "sta_status")
	// @Length(max = 1)
	private String staStatus;
}
