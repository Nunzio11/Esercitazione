package org.legaseriea.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "allenatore")
public class Allenatore {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;

	@Column(name = "foto", nullable = true)
	private String foto;

	@Column(name = "nome", nullable = false, length = 45)
	private String nome;

	@Column(name = "cognome", nullable = false, length = 45)
	private String cognome;

	@Column(name = "data_nascita", nullable = false)
	private LocalDate dataNascita;

	@OneToOne
	@JoinColumn(name = "squadra_id", nullable = false)
	private Squadra squadra;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public LocalDate getDataNascita() {
		return dataNascita;
	}

	public void setDataNascita(LocalDate dataNascita) {
		this.dataNascita = dataNascita;
	}

	public Squadra getSquadra() {
		return squadra;
	}

	public void setSquadra(Squadra squadra) {
		this.squadra = squadra;
	}

	@Override
	public String toString() {
		return "Allenatore [id=" + id + ", foto=" + foto + ", nome=" + nome + ", cognome=" + cognome + ", dataNascita="
				+ dataNascita + ", squadra=" + squadra + "]";
	}

}
