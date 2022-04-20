package com.maicolimaguerrieri.springbootjava.application.api.assembleia;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.maicolimaguerrieri.springbootjava.domain.Assembleia;
import com.maicolimaguerrieri.springbootjava.domain.Associado;
import com.maicolimaguerrieri.springbootjava.domain.Pauta;

import lombok.Data;


@Data
public class AssembleiaCriadoResponse {
	
	private final UUID idAssembleia;
	private final String titulo;
	private final String objetivo;
	private final LocalDateTime dataAberturaAssembleia;
	private List<Pauta> pautas = new ArrayList<>();
	private List<Associado> associados = new ArrayList<>();

	public AssembleiaCriadoResponse(Assembleia assembleia) {
		this.idAssembleia = assembleia.getId();
		this.titulo = assembleia.getTitulo();
		this.objetivo = assembleia.getObjetivo();
		this.dataAberturaAssembleia = assembleia.getDataAberturaAssembleia();
		this.pautas = assembleia.getPautas();
		this.associados = assembleia.getAssociados();
	}

}
