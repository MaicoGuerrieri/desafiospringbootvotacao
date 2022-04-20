package com.maicolimaguerrieri.springbootjava.application.service;

import org.springframework.stereotype.Service;

import com.maicolimaguerrieri.springbootjava.application.api.pauta.PautaCriadoResponse;
import com.maicolimaguerrieri.springbootjava.application.api.pauta.PautaNovoRequest;
import com.maicolimaguerrieri.springbootjava.application.repository.PautaRepository;
import com.maicolimaguerrieri.springbootjava.domain.Pauta;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Service
@AllArgsConstructor
public class PautaService implements PautaApplicationService {
	private PautaRepository pautaRepository;
	
	@Override
	public PautaCriadoResponse criaNovaPauta(PautaNovoRequest pautaNova) {
		log.info("[start] PautaService - criaNovaPauta");
		Pauta pauta = new Pauta(pautaNova);
		pautaRepository.salva(pauta);
		log.info("[finish] PautaService - criaNovaPauta");
		return new PautaCriadoResponse(pauta) ;
	}

}
