package com.maicolimaguerrieri.springbootjava.application.api.associado;

import java.util.UUID;

import com.maicolimaguerrieri.springbootjava.domain.Associado;
import com.maicolimaguerrieri.springbootjava.domain.SexoAssociado;

import lombok.Data;

@Data
public class AssociadoCriadoResponse {
	private final UUID idAssociado;
	private final String nome;
	private final String cpf;
	private final String email;
	private final SexoAssociado sexo;

	public AssociadoCriadoResponse(Associado associado) {
		this.idAssociado = associado.getIdAssociado();
		this.nome = associado.getNome();
		this.cpf = associado.getCpf();
		this.email = associado.getEmail();
		this.sexo = associado.getSexo();
	}

}
