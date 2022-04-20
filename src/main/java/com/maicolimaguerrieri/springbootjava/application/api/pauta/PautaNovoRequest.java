package com.maicolimaguerrieri.springbootjava.application.api.pauta;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import com.maicolimaguerrieri.springbootjava.domain.Assembleia;
import com.maicolimaguerrieri.springbootjava.domain.Associado;
import com.maicolimaguerrieri.springbootjava.domain.ResultadoVotacao;
import com.maicolimaguerrieri.springbootjava.domain.Voto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PautaNovoRequest {
	private String titulo;

	private String descricao;

	private Date dataAberturaPauta;
	//private LocalDateTime dataAberturaPauta = LocalDateTime.now();
	
	private Associado autor;
	
	private Assembleia idAssembleia;
	
	private List<Voto> votos;
	
	private ResultadoVotacao resultado = ResultadoVotacao.AGUARDANDO;

}
