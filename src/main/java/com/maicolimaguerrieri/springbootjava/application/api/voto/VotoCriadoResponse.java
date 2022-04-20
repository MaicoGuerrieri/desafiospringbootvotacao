package com.maicolimaguerrieri.springbootjava.application.api.voto;

import java.util.UUID;

import com.maicolimaguerrieri.springbootjava.domain.Associado;
import com.maicolimaguerrieri.springbootjava.domain.DecisaoAssociado;
import com.maicolimaguerrieri.springbootjava.domain.Pauta;
import com.maicolimaguerrieri.springbootjava.domain.Voto;

import lombok.Data;

@Data
public class VotoCriadoResponse {
	private UUID idVoto;
	private Pauta idPauta;
	private Associado idAssociado;
	private DecisaoAssociado voto = DecisaoAssociado.AGUARDANDO;
	
	public VotoCriadoResponse(Voto voto) {
		this.idVoto = voto.getIdVoto();
		this.idPauta = voto.getIdPauta();
		this.idAssociado = voto.getIdAssociado();
		this.voto = voto.getVoto();
		
	}

}
