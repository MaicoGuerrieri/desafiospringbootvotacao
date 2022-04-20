package com.maicolimaguerrieri.springbootjava.application.api.pauta;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import com.maicolimaguerrieri.springbootjava.domain.Assembleia;
import com.maicolimaguerrieri.springbootjava.domain.Associado;
import com.maicolimaguerrieri.springbootjava.domain.Pauta;
import com.maicolimaguerrieri.springbootjava.domain.ResultadoVotacao;
import com.maicolimaguerrieri.springbootjava.domain.Voto;

import lombok.Data;

@Data
public class PautaCriadoResponse {
	private UUID idPauta;

	private String titulo;

	private String descricao;

	private Date dataAberturaPauta;
	
	private Associado autor;
	
	private Assembleia idAssembleia;
	
	private List<Voto> votos;
	
	private ResultadoVotacao resultado = ResultadoVotacao.AGUARDANDO;
	
	public PautaCriadoResponse(Pauta pauta) {
		this.idPauta = pauta.getIdPauta();
		this.titulo = pauta.getTitulo();
		this.descricao = pauta.getDescricao();
		this.dataAberturaPauta = pauta.getDataAberturaPauta(); 
		this.autor = pauta.getAutor();
		this.idAssembleia = pauta.getIdAssembleia();
		this.votos = pauta.getVotos();
		this.resultado = pauta.getResultado();
	}

}
