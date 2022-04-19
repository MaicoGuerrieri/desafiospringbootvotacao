package com.maicolimaguerrieri.springbootjava.domain;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

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

	private String id;

	private Pauta idPauta;

	private Associado idAssociado;

	private DecisaoAssociado voto = DecisaoAssociado.AGUARDANDO;

}
