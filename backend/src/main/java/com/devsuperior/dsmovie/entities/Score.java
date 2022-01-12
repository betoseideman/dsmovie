package com.devsuperior.dsmovie.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

//MAPEAMENTO OBJETO RELACIONAL //
@Entity
@Table(name = "tb_score")
public class Score {
	
	@EmbeddedId  //CONFIGURAÇÃO ID COMPOSTO //
	private ScorePK id = new ScorePK();
	private Double value;
	
	public Score() {
		
	}
	
	public void setMovie(Movie movie) { //LIGAR FILME AO SCORE//
		id.setMovie(movie);
	}
	
	public void serUser(User user) {  //LIGAR O USER AO SCORE//
		id.setUser(user);
	}

	public ScorePK getId() {
		return id;
	}

	public void setId(ScorePK id) {
		this.id = id;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}
	
}