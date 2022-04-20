package com.maicolimaguerrieri.springbootjava.application.api.voto;

import com.maicolimaguerrieri.springbootjava.domain.Associado;
import com.maicolimaguerrieri.springbootjava.domain.DecisaoAssociado;
import com.maicolimaguerrieri.springbootjava.domain.Pauta;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VotoNovoRequest {
	
	private Pauta idPauta;

	private Associado idAssociado;

	private DecisaoAssociado voto = DecisaoAssociado.AGUARDANDO;

}
