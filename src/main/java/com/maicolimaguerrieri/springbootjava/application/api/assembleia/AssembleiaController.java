package com.maicolimaguerrieri.springbootjava.application.api.assembleia;

import javax.validation.Valid;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maicolimaguerrieri.springbootjava.application.service.AssembleiaApplicationService;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping(value = "/v1/assembleia", produces = MediaType.APPLICATION_JSON_VALUE)
@Log4j2
@AllArgsConstructor
public class AssembleiaController implements AssembleiaAPI{
	
	private AssembleiaApplicationService assembleiaApplicationService;

	@Override
	public AssembleiaCriadoResponse novaAssembleia(@Valid AssembleiaNovoRequest assembleiaNova) {
		log.info("[start] AssembleiaController - novaAssembleia");
		AssembleiaCriadoResponse assembleiaCriada = assembleiaApplicationService.novaAssembleia(assembleiaNova);
		log.info("[finish] AssembleiaController - novaAssembleia");
		return assembleiaCriada;
		
	}
	

}
