package com.maicolimaguerrieri.springbootjava.domain;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.maicolimaguerrieri.springbootjava.application.api.assembleia.AssembleiaNovoRequest;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "Assembleia")
public class Assembleia {

	@Id
	private UUID id;
	private String titulo;

	private String objetivo;

	private LocalDateTime dataAberturaAssembleia;

	private List<Pauta> pautas = new ArrayList<>();

	private List<Associado> associados = new ArrayList<>();
	
	public Assembleia(AssembleiaNovoRequest assembleia) {
		this.id = UUID.randomUUID();
		this.titulo = assembleia.getTitulo();
		this.objetivo = assembleia.getObjetivo();
		this.dataAberturaAssembleia = assembleia.getDataAberturaAssembleia();
		this.pautas = assembleia.getPautas();
		this.associados = assembleia.getAssociados();
	}

}
