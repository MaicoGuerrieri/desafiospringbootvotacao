package com.maicolimaguerrieri.springbootjava.application.api.associado;

import javax.validation.Valid;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.maicolimaguerrieri.springbootjava.application.service.AssociadoApplicationService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping(value = "/v1/associado", produces = MediaType.APPLICATION_JSON_VALUE)
@Log4j2
@AllArgsConstructor
public class AssociadoController implements AssociadoAPI {
	
	private AssociadoApplicationService associadoApplicationService;

	public AssociadoCriadoResponse postNovoAssociado(@Valid @RequestBody AssociadoNovoRequest associadoNovo) {
		log.info("[start] AssociadoController - postNovoAssociado");
		AssociadoCriadoResponse associadoCriado = associadoApplicationService.criaNovoAssociado(associadoNovo);
		log.info("[finish] AssociadoController - postNovoAssociado");
		return associadoCriado;
	}

}
