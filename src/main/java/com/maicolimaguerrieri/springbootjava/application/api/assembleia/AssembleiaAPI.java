package com.maicolimaguerrieri.springbootjava.application.api.assembleia;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;



public interface AssembleiaAPI {
	
	@PostMapping 
    @ResponseStatus(code = HttpStatus.CREATED) 
   AssembleiaCriadoResponse novaAssembleia(@RequestBody @Valid AssembleiaNovoRequest novaAssembleia);

}
