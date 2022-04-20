package com.maicolimaguerrieri.springbootjava.domain;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

import com.maicolimaguerrieri.springbootjava.application.api.pauta.PautaNovoRequest;

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
	@Id
	private UUID idPauta;

	private String titulo;

	private String descricao;

	private Date dataAberturaPauta;
	
	private Associado autor;
	
	private Assembleia idAssembleia;
	
	private List<Voto> votos;
	
	private ResultadoVotacao resultado = ResultadoVotacao.AGUARDANDO;
	
	public Pauta(PautaNovoRequest novaPauta) {
		this.idPauta = UUID.randomUUID();
		this.titulo = novaPauta.getTitulo();
		this.descricao = novaPauta.getDescricao();
		this.dataAberturaPauta = novaPauta.getDataAberturaPauta(); 
		this.autor = novaPauta.getAutor();
		this.idAssembleia = novaPauta.getIdAssembleia();
		this.votos = novaPauta.getVotos();
		this.resultado = novaPauta.getResultado();
	}


}
