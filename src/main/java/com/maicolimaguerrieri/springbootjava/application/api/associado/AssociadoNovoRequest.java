package com.maicolimaguerrieri.springbootjava.application.api.associado;



import com.maicolimaguerrieri.springbootjava.domain.SexoAssociado;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AssociadoNovoRequest {
	private String nome;
	private String cpf;
	private String email;
	private SexoAssociado sexo;

}
