package com.AppRH.AppRH.models;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="coop")
public class Cooperado implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="coop_index_cod")
	private int coopindexcod;
	
	@NotNull
	@Column(name="coop_matricula",unique = true)
	private int coopmatricula;
	
	public int getCoopindexcod() {
		return coopindexcod;
	}

	public void setCoopindexcod(int coopindexcod) {
		this.coopindexcod = coopindexcod;
	}

	public int getCoopmatricula() {
		return coopmatricula;
	}

	public void setCoopmatricula(int coopmatricula) {
		this.coopmatricula = coopmatricula;
	}

	public String getCoopnome() {
		return coopnome;
	}

	public void setCoopnome(String coopnome) {
		this.coopnome = coopnome;
	}

	public String getCoopnomeguerra() {
		return coopnomeguerra;
	}

	public void setCoopnomeguerra(String coopnomeguerra) {
		this.coopnomeguerra = coopnomeguerra;
	}

	public List<Telefone> getTelefones() {
		return telefones;
	}

	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}

	@NotNull
	@Column(name="coop_nome")
	private String coopnome;
	
	@NotNull
	@Column(name="coop_nome_guerra")
	private String coopnomeguerra;
	
	@OneToMany(mappedBy = "cooperado", cascade = CascadeType.REMOVE)
	private List<Telefone> telefones;

	
}





