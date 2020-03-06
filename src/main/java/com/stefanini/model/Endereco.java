package com.stefanini.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "tb_endereco")
public class Endereco implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CO_SEQ_ENDERECO")
	private Long id;

	@Column(name = "DS_CEP")
	private String cep;

	@Column(name = "CO_UF")
	private String uf;

	@Column(name = "DS_CIDADE")
	private String localidade;

	@Column(name = "DS_BAIRRO")
	private String bairro;

	@Column(name = "DS_COMPLEMENTO")
	private String complemento;

	@Column(name = "DS_LOGRADOURO")
	private String logradouro;

	@ManyToOne
	@JoinColumn(name = "co_seq_pessoa", referencedColumnName = "co_seq_pessoa", nullable = false)
	private Pessoa pessoa;

	/* Declarando o construtor padrao */
	public Endereco() {

	}

	public Endereco(String cep, String uf, String localidade, String bairro, String complemento,
			String logradouro, Pessoa pessoa) {
		super();
		this.cep = cep;
		this.uf = uf;
		this.localidade = localidade;
		this.bairro = bairro;
		this.complemento = complemento;
		this.logradouro = logradouro;
		this.pessoa = pessoa;
	}

	/* GETTER AND SETTER */
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getLocalidade() {
		return localidade;
	}

	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Endereco other = (Endereco) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
