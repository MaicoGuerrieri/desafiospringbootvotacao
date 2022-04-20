package com.maicolimaguerrieri.springbootjava.infra;

import org.springframework.stereotype.Component;

import com.maicolimaguerrieri.springbootjava.application.repository.VotoRepository;
import com.maicolimaguerrieri.springbootjava.domain.Voto;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Component
public class VotoRepositoryMongoDB implements VotoRepository{
	
	private VotoMongoDBRepository votoMongoDBRepository;
	
	@Override
	public Voto salva(Voto voto) {
		return votoMongoDBRepository.save(voto);
	}

}
