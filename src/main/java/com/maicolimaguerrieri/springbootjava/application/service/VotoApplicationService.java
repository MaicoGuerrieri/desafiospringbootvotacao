package com.maicolimaguerrieri.springbootjava.application.service;

import com.maicolimaguerrieri.springbootjava.application.api.voto.VotoCriadoResponse;
import com.maicolimaguerrieri.springbootjava.application.api.voto.VotoNovoRequest;

public interface VotoApplicationService {
	VotoCriadoResponse criaNovoVoto(VotoNovoRequest votoNovo);


}
