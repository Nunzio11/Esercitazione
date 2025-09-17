package org.legaseriea.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "squadra")
public class Squadra {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;

	@Column(name = "foto", nullable = true)
	private String foto;

	@Column(name = "nome", nullable = false, length = 45)
	private String nome;

	@Column(name = "sede", nullable = false, length = 45)
	private String sede;

	@Column(name = "stadio", nullable = false, length = 30)
	private String stadio;

	@Column(name = "sito_web", nullable = false, length = 255)
	private String sitoWeb;;

	@Column(name = "storia", nullable = false)
	private String storia;

	@Column(name = "colori_sociali", nullable = false, length = 45)
	private String coloriSociali;

	@Column(name = "anno_fondazione", nullable = false)
	private int annoFondazione;

	@OneToMany(mappedBy = "squadra", fetch = FetchType.EAGER)
	private List<Giocatore> giocatori;

	@OneToOne(mappedBy = "squadra", fetch = FetchType.EAGER)
	private Allenatore allenatore;

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

	public String getSede() {
		return sede;
	}

	public void setSede(String sede) {
		this.sede = sede;
	}

	public String getStadio() {
		return stadio;
	}

	public void setStadio(String stadio) {
		this.stadio = stadio;
	}

	public String getSitoWeb() {
		return sitoWeb;
	}

	public void setSitoWeb(String sitoWeb) {
		this.sitoWeb = sitoWeb;
	}

	public String getStoria() {
		return storia;
	}

	public void setStoria(String storia) {
		this.storia = storia;
	}

	public String getColoriSociali() {
		return coloriSociali;
	}

	public void setColoriSociali(String coloriSociali) {
		this.coloriSociali = coloriSociali;
	}

	public int getAnnoFondazione() {
		return annoFondazione;
	}

	public void setAnnoFondazione(int annoFondazione) {
		this.annoFondazione = annoFondazione;
	}

	public List<Giocatore> getGiocatori() {
		return giocatori;
	}

	public void setGiocatori(List<Giocatore> giocatori) {
		this.giocatori = giocatori;
	}

	public Allenatore getAllenatore() {
		return allenatore;
	}

	public void setAllenatore(Allenatore allenatore) {
		this.allenatore = allenatore;
	}

}
