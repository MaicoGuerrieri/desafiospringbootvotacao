package com.maicolimaguerrieri.springbootjava.application.api.pauta;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

public interface PautaAPI {
	@PostMapping 
    @ResponseStatus(code = HttpStatus.CREATED) 
   PautaCriadoResponse novaPauta(@RequestBody @Valid PautaNovoRequest novaPauta);

}
