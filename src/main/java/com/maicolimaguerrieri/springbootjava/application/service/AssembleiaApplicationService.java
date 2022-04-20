package com.maicolimaguerrieri.springbootjava.application.service;

import com.maicolimaguerrieri.springbootjava.application.api.assembleia.AssembleiaCriadoResponse;
import com.maicolimaguerrieri.springbootjava.application.api.assembleia.AssembleiaNovoRequest;

public interface AssembleiaApplicationService {
	AssembleiaCriadoResponse novaAssembleia(AssembleiaNovoRequest assembleiaNova);

}
