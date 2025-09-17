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
@Table(name = "allenatore_squadra", uniqueConstraints = @UniqueConstraint(columnNames = { "allenatore_id",
		"squadra_id" }))
public class AllenatoreSquadra {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "allenatore_squadra")
	private long id;

	@ManyToOne
	@JoinColumn(name = "allenatore_id", nullable = false)
	private Allenatore allenatore;

	@ManyToOne
	@JoinColumn(name = "squadra_id", nullable = false)
	private Squadra squadra;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Allenatore getAllenatore() {
		return allenatore;
	}

	public void setAllenatore(Allenatore allenatore) {
		this.allenatore = allenatore;
	}

	public Squadra getSquadra() {
		return squadra;
	}

	public void setSquadra(Squadra squadra) {
		this.squadra = squadra;
	}

}
