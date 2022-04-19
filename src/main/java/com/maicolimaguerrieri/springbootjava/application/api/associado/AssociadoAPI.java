package com.maicolimaguerrieri.springbootjava.application.api.associado;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;



public interface AssociadoAPI {
	@PostMapping 
    @ResponseStatus(code = HttpStatus.CREATED) 
    AssociadoCriadoResponse postNovoAssociado(@RequestBody @Valid AssociadoNovoRequest associadoNovo);

}
