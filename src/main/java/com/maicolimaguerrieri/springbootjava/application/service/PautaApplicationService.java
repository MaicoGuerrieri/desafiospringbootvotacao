package com.maicolimaguerrieri.springbootjava.application.service;

import com.maicolimaguerrieri.springbootjava.application.api.pauta.PautaCriadoResponse;
import com.maicolimaguerrieri.springbootjava.application.api.pauta.PautaNovoRequest;

public interface PautaApplicationService {
	PautaCriadoResponse criaNovaPauta(PautaNovoRequest pautaNova);

}
