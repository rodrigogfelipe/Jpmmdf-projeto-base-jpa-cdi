package com.stefanini.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "CO_SEQ_PERFIL")
public class Perfil implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CO_SEQ_PERFIL")
	private Long id;

	@NotNull
	@Column(name = "NO_PERFIL")
	private String noPerfil;

	@NotNull
	@Column(name = "DS_PERFIL")
	private String dsPerfil;

	@NotNull
	@Column(name = "DT_HORA_INCLUSAO")
	private LocalDate horaInclusao;

	@NotNull
	@Column(name = "DT_HORA_ALTERACAO")
	private LocalDate horaAlteracao;

	@OneToMany(mappedBy = "perfil")
	private Set<PessoaPerfil> pessoaPerfil;

	public Perfil() {

	}

	public Perfil(@NotNull Long id, @NotNull String noPerfil, @NotNull String dsPerfil, @NotNull LocalDate horaInclusao,
			@NotNull LocalDate horaAlteracao) {
		super();
		this.noPerfil = noPerfil;
		this.dsPerfil = dsPerfil;
		this.horaInclusao = horaInclusao;
		this.horaAlteracao = horaAlteracao;
		this.id = id;
	}

	/* SETTER CLASSE PessoaPerfil */
	public Set<PessoaPerfil> getPessoaPerfil() {
		return pessoaPerfil;
	}

	public void setPessoaPerfil(Set<PessoaPerfil> pessoaPerfil) {
		this.pessoaPerfil = pessoaPerfil;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNoPerfil() {
		return noPerfil;
	}

	public void setNoPerfil(String noPerfil) {
		this.noPerfil = noPerfil;
	}

	public String getDsPerfil() {
		return dsPerfil;
	}

	public void setDsPerfil(String dsPerfil) {
		this.dsPerfil = dsPerfil;
	}

	public LocalDate getHoraInclusao() {
		return horaInclusao;
	}

	public void setHoraInclusao(LocalDate horaInclusao) {
		this.horaInclusao = horaInclusao;
	}

	public LocalDate getHoraAlteracao() {
		return horaAlteracao;
	}

	public void setHoraAlteracao(LocalDate horaAlteracao) {
		this.horaAlteracao = horaAlteracao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dsPerfil == null) ? 0 : dsPerfil.hashCode());
		result = prime * result + ((horaAlteracao == null) ? 0 : horaAlteracao.hashCode());
		result = prime * result + ((horaInclusao == null) ? 0 : horaInclusao.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((noPerfil == null) ? 0 : noPerfil.hashCode());
		result = prime * result + ((pessoaPerfil == null) ? 0 : pessoaPerfil.hashCode());
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
		Perfil other = (Perfil) obj;
		if (dsPerfil == null) {
			if (other.dsPerfil != null)
				return false;
		} else if (!dsPerfil.equals(other.dsPerfil))
			return false;
		if (horaAlteracao == null) {
			if (other.horaAlteracao != null)
				return false;
		} else if (!horaAlteracao.equals(other.horaAlteracao))
			return false;
		if (horaInclusao == null) {
			if (other.horaInclusao != null)
				return false;
		} else if (!horaInclusao.equals(other.horaInclusao))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (noPerfil == null) {
			if (other.noPerfil != null)
				return false;
		} else if (!noPerfil.equals(other.noPerfil))
			return false;
		if (pessoaPerfil == null) {
			if (other.pessoaPerfil != null)
				return false;
		} else if (!pessoaPerfil.equals(other.pessoaPerfil))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Perfil [id=" + id + ", noPerfil=" + noPerfil + ", dsPerfil=" + dsPerfil + ", horaInclusao="
				+ horaInclusao + ", horaAlteracao=" + horaAlteracao + ", pessoaPerfil=" + pessoaPerfil + "]";
	}

}
