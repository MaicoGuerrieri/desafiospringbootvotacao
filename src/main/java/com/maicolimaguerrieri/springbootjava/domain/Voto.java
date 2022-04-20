package com.maicolimaguerrieri.springbootjava.domain;

import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

import com.maicolimaguerrieri.springbootjava.application.api.voto.VotoNovoRequest;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "Voto")
public class Voto {
	
	@MongoId(targetType = FieldType.STRING)

	@Id
	private UUID idVoto;

	private Pauta idPauta;

	private Associado idAssociado;

	private DecisaoAssociado voto = DecisaoAssociado.AGUARDANDO;
	
	public Voto(VotoNovoRequest voto) {
		this.idVoto = UUID.randomUUID();
		this.idPauta = voto.getIdPauta();
		this.idAssociado = voto.getIdAssociado();
		this.voto = voto.getVoto();
		
	}
	
	

}
