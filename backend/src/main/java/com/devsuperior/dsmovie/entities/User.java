package com.devsuperior.dsmovie.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//MAPEAMENTO OBJETO RELACIONAL //
@Entity
@Table(name = "tb_user")
public class User {
	
	@Id  //MAPEAMENTO OOBJETO RELACIONAL //
	@GeneratedValue(strategy = GenerationType.IDENTITY) //AUTO INCREMENTAR O ID NO BD//
	private Long id;
	private String email;
	
	public User() {
		
	}

	public User(Long id, String email) {
		this.id = id;
		this.email = email;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return email;
	}

	public void setName(String email) {
		this.email = email;
	}

}