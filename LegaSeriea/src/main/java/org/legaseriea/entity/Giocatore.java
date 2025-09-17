package org.legaseriea.entity;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "giocatore")
public class Giocatore {

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

	@Column(name = "ruolo", nullable = false, length = 45)
	private String ruolo;

	@Column(name = "nazione", nullable = false, length = 45)
	private String nazione;

	@Column(name = "altezza", nullable = false)
	private int altezza;

	@Column(name = "numero_maglia", nullable = false)
	private int numeroMaglia;

	@Column(name = "piede", nullable = false, length = 2)
	private String piede;

	@Column(name = "valore_mercato", nullable = false, precision = 12, scale = 2)
	private BigDecimal valoreMercato;

	@ManyToOne
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

	public String getRuolo() {
		return ruolo;
	}

	public void setRuolo(String ruolo) {
		this.ruolo = ruolo;
	}

	public String getNazione() {
		return nazione;
	}

	public void setNazione(String nazione) {
		this.nazione = nazione;
	}

	public int getAltezza() {
		return altezza;
	}

	public void setAltezza(int altezza) {
		this.altezza = altezza;
	}

	public int getNumeroMaglia() {
		return numeroMaglia;
	}

	public void setNumeroMaglia(int numeroMaglia) {
		this.numeroMaglia = numeroMaglia;
	}

	public String getPiede() {
		return piede;
	}

	public void setPiede(String piede) {
		this.piede = piede;
	}

	public BigDecimal getValoreMercato() {
		return valoreMercato;
	}

	public void setValoreMercato(BigDecimal valoreMercato) {
		this.valoreMercato = valoreMercato;
	}

	public Squadra getSquadra() {
		return squadra;
	}

	public void setSquadra(Squadra squadra) {
		this.squadra = squadra;
	}

	@Override
	public String toString() {
		return "Giocatore [id=" + id + ", foto=" + foto + ", nome=" + nome + ", cognome=" + cognome + ", dataNascita="
				+ dataNascita + ", ruolo=" + ruolo + ", nazione=" + nazione + ", altezza=" + altezza + ", numeroMaglia="
				+ numeroMaglia + ", piede=" + piede + ", valoreMercato=" + valoreMercato + ", squadra=" + squadra + "]";
	}

}
