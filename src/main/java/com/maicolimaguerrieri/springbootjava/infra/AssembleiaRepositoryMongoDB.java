package com.maicolimaguerrieri.springbootjava.infra;

import org.springframework.stereotype.Component;

import com.maicolimaguerrieri.springbootjava.application.repository.AssembleiaRepository;
import com.maicolimaguerrieri.springbootjava.domain.Assembleia;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Component
public class AssembleiaRepositoryMongoDB implements AssembleiaRepository {
	
	private AssembleiaMongoDBRepository assembleiaMongoDBRepository;

	@Override
	public Assembleia salva(Assembleia assembleia) {
		return assembleiaMongoDBRepository.save(assembleia);
	}

}
