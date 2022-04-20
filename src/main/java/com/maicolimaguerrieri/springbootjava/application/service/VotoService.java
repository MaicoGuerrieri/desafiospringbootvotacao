package com.maicolimaguerrieri.springbootjava.application.service;


import org.springframework.stereotype.Service;

import com.maicolimaguerrieri.springbootjava.application.api.voto.VotoCriadoResponse;
import com.maicolimaguerrieri.springbootjava.application.api.voto.VotoNovoRequest;
import com.maicolimaguerrieri.springbootjava.application.repository.VotoRepository;
import com.maicolimaguerrieri.springbootjava.domain.Voto;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Service
@AllArgsConstructor
public class VotoService implements VotoApplicationService {
private VotoRepository votoRepository;
	
	@Override
	public VotoCriadoResponse criaNovoVoto(VotoNovoRequest votoNovo) {
		log.info("[start] VotoService - criaNovoVoto");
		Voto voto = new Voto(votoNovo);
		votoRepository.salva(voto);
		log.info("[finish] VotoService - criaNovoVoto");
		return new VotoCriadoResponse(voto);
	}

}
