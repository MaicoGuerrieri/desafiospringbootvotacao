package com.maicolimaguerrieri.springbootjava.application.api.assembleia;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.maicolimaguerrieri.springbootjava.domain.Associado;
import com.maicolimaguerrieri.springbootjava.domain.Pauta;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AssembleiaNovoRequest {
	
	private String titulo;

	private String objetivo;

	private LocalDateTime dataAberturaAssembleia = LocalDateTime.now();
	
	private List<Pauta> pautas = new ArrayList<>();
	
	private List<Associado> associados = new ArrayList<>();

}
