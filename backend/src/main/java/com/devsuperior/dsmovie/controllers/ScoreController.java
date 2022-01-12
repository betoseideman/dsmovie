package com.devsuperior.dsmovie.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsmovie.dto.MovieDTO;
import com.devsuperior.dsmovie.dto.ScoreDTO;
import com.devsuperior.dsmovie.services.ScoreService;

//CLASSA IMPLEMENTA O ENDPOINT//
@RestController
@RequestMapping(value = "/scores") // MAPEAR O CAMINHO DA PAGINA//
public class ScoreController {

	@Autowired
	private ScoreService service;

	@PutMapping
	public MovieDTO saveScore(@RequestBody ScoreDTO dto) { //CORPO DA REQUISICAO
		MovieDTO movieDTO = service.saveScore(dto);
		return movieDTO;
	}

}