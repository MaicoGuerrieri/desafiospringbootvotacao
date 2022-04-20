package com.maicolimaguerrieri.springbootjava.domain;

import java.util.UUID;
import javax.validation.constraints.Email;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import com.maicolimaguerrieri.springbootjava.application.api.associado.AssociadoNovoRequest;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter 
@AllArgsConstructor 
@NoArgsConstructor 
@Builder 
@Document(collection = "Associado")
public class Associado {
	
	@Id 
	private UUID idAssociado;

	private String nome;
	
	@Indexed(unique = true)
	private String cpf;
	
	@Email 
	@Indexed(unique = true) 
	private String email;
	
	private SexoAssociado sexo;

	
	public Associado(AssociadoNovoRequest associadoNovo) {
		this.idAssociado = UUID.randomUUID();
		this.nome = associadoNovo.getNome();
		this.cpf = associadoNovo.getCpf();
		this.sexo = associadoNovo.getSexo();
		this.email = associadoNovo.getEmail();
	}

}
