package com.maicolimaguerrieri.springbootjava.infra;

import org.springframework.stereotype.Component;

import com.maicolimaguerrieri.springbootjava.application.repository.PautaRepository;
import com.maicolimaguerrieri.springbootjava.domain.Pauta;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Component
public class PautaRepositoryMongoDB implements PautaRepository {

	private PautaMongoDBRepository pautaMongoDBRepository;

	@Override
	public Pauta salva(Pauta pauta) {
		return pautaMongoDBRepository.save(pauta);
	}

}
