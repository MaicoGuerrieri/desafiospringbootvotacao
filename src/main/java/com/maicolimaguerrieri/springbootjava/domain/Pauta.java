package com.maicolimaguerrieri.springbootjava.domain;

import java.util.Date;
import java.util.List;
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
@Document(collection = "Pauta")
public class Pauta {
	
	@MongoId(targetType = FieldType.STRING)
	private String id;

	private String titulo;

	private String descricao;

	private Date dataAberturaPauta;
	
	private Associado autor;
	
	private Assembleia idAssembleia;
	
	private List<Voto> votos;
	
	private ResultadoVotacao resultado = ResultadoVotacao.AGUARDANDO;


}
