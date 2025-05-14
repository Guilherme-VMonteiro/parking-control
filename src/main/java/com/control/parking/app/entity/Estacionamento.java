package com.control.parking.app.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Estacionamento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID id;
	
	@Column(name = "razao_social", nullable = false, unique = true)
	private String razaoSocial;
	
	@Column(name = "nome_fantasia", nullable = false)
	private String nomeFantasia;
	
	@Column(name = "cnpj", nullable = false, unique = true)
	private String cnpj;
	
	@OneToOne
	@JoinColumn(name = "endereco_id", referencedColumnName = "id")
	private Endereco endereco;
	
	@Column(nullable = false)
	private Integer vagas;

	@ManyToOne
	@JoinColumn(name = "proprietario_id", referencedColumnName = "id")
	private Usuario proprietario;
	
	@OneToMany(mappedBy = "estacionamento")
	private Set<RegistroEstaconamento> registroEstacionamentos;
}
