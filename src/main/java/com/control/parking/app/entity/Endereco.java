package com.control.parking.app.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Endereco {
	
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID id;
	
	@Column(nullable = false)
	private String logradouro;
	
	private String numero;
	
	private String complemento;
	
	@Column(nullable = false)
	private String bairro;
	
	@Column(nullable = false)
	private String cidade;
	
	@Column(nullable = false, length = 2)
	private String estado;
	
	@Column(nullable = false)
	private String cep;
}
