package com.maicolimaguerrieri.springbootjava.application.service;

import com.maicolimaguerrieri.springbootjava.application.api.associado.AssociadoCriadoResponse;
import com.maicolimaguerrieri.springbootjava.application.api.associado.AssociadoNovoRequest;

public interface AssociadoApplicationService {
	AssociadoCriadoResponse criaNovoAssociado(AssociadoNovoRequest associadoNovo);

}
