package com.maicolimaguerrieri.springbootjava.application.api.voto;

import javax.validation.Valid;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maicolimaguerrieri.springbootjava.application.service.VotoApplicationService;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping(value = "/v1/voto", produces = MediaType.APPLICATION_JSON_VALUE)
@Log4j2
@AllArgsConstructor
public class VotoController implements VotoAPI{
	
	private VotoApplicationService votoApplicationService;
	
	@Override
	public VotoCriadoResponse novoVoto(@Valid @RequestBody VotoNovoRequest votoNovo) {
		log.info("[start] VotoController - novoVoto");
		VotoCriadoResponse votoCriado = votoApplicationService.criaNovoVoto(votoNovo);
		log.info("[finish] VotoController - novoVoto");
		return votoCriado;
	}

}
