package com.maicolimaguerrieri.springbootjava.application.service;

import org.springframework.stereotype.Service;

import com.maicolimaguerrieri.springbootjava.application.api.associado.AssociadoCriadoResponse;
import com.maicolimaguerrieri.springbootjava.application.api.associado.AssociadoNovoRequest;
import com.maicolimaguerrieri.springbootjava.application.repository.AssociadoRepository;
import com.maicolimaguerrieri.springbootjava.domain.Associado;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Service
@AllArgsConstructor
public class AssociadoService implements AssociadoApplicationService {

	private AssociadoRepository associadoRepository;

	@Override
	public AssociadoCriadoResponse criaNovoAssociado(AssociadoNovoRequest associadoNovo) {
		log.info("[start] AssociadoService - criaNovoAssociado");
		Associado associado = new Associado(associadoNovo);
		associadoRepository.salva(associado);
		log.info("[finish] AssociadoService - criaNovoAssociado");
		return new AssociadoCriadoResponse(associado);
	}

}
