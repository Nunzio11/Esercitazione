package org.legaseriea.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name = "giocatore_squadra", uniqueConstraints = @UniqueConstraint(columnNames = { "giocatore_id",
		"squadra_id" }))
public class GiocatoreSquadra {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "giocatore_squadra")
	private long id;

	@ManyToOne
	@JoinColumn(name = "giocatore_id", nullable = false)
	private Giocatore giocatore;

	@ManyToOne
	@JoinColumn(name = "squadra_id", nullable = false)
	private Squadra squadra;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Giocatore getGiocatore() {
		return giocatore;
	}

	public void setGiocatore(Giocatore giocatore) {
		this.giocatore = giocatore;
	}

	public Squadra getSquadra() {
		return squadra;
	}

	public void setSquadra(Squadra squadra) {
		this.squadra = squadra;
	}

}
