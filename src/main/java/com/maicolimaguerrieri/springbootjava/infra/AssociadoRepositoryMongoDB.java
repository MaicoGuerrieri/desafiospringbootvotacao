package com.maicolimaguerrieri.springbootjava.infra;

import org.springframework.stereotype.Component;
import com.maicolimaguerrieri.springbootjava.application.repository.AssociadoRepository;
import com.maicolimaguerrieri.springbootjava.domain.Associado;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Component
public class AssociadoRepositoryMongoDB implements AssociadoRepository {
	
	private AssociadoMongoDBRepository associadoMongoDBRepository;

	@Override
	public Associado salva(Associado associado) {
		return associadoMongoDBRepository.save(associado);
	}

}
