package com.maicolimaguerrieri.springbootjava.application.api.voto;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;



public interface VotoAPI {
	@PostMapping 
    @ResponseStatus(code = HttpStatus.CREATED) 
    VotoCriadoResponse novoVoto(@RequestBody @Valid VotoNovoRequest votoNovo);

}
