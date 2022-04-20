package com.maicolimaguerrieri.springbootjava.application.api.pauta;

import javax.validation.Valid;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maicolimaguerrieri.springbootjava.application.service.PautaApplicationService;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping(value = "/v1/pauta", produces = MediaType.APPLICATION_JSON_VALUE)
@Log4j2
@AllArgsConstructor
public class PautaController implements PautaAPI {
	private PautaApplicationService pautaApplicationService;

	@Override
	public PautaCriadoResponse novaPauta(@Valid @RequestBody PautaNovoRequest novaPauta) {
		log.info("[start] PautaController - novoPauta");
		PautaCriadoResponse pautaCriado = pautaApplicationService.criaNovaPauta(novaPauta);
		log.info("[finish] PautaController - novaPauta");

		return pautaCriado;
	}

}
