package com.maicolimaguerrieri.springbootjava.application.service;

import org.springframework.stereotype.Service;

import com.maicolimaguerrieri.springbootjava.application.api.assembleia.AssembleiaCriadoResponse;
import com.maicolimaguerrieri.springbootjava.application.api.assembleia.AssembleiaNovoRequest;
import com.maicolimaguerrieri.springbootjava.application.repository.AssembleiaRepository;
import com.maicolimaguerrieri.springbootjava.domain.Assembleia;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Service
@AllArgsConstructor
public class AssembleiaService implements AssembleiaApplicationService {
	
	private AssembleiaRepository assembleiaRepository;

	@Override
	public AssembleiaCriadoResponse novaAssembleia(AssembleiaNovoRequest assembleiaNova) {
		log.info("[start] AssembleiaService - novaAssembleia");
		Assembleia assembleia = new Assembleia(assembleiaNova);
		assembleiaRepository.salva(assembleia);
		log.info("[finish] AssembleiaService - novaAssembleia");
		return new AssembleiaCriadoResponse(assembleia);

	}

}
