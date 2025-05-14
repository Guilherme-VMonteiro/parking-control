package com.control.parking.app.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Set;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID id;
	
	@Column(nullable = false)
	private String name;
	
	@Column(nullable = false, unique = true)
	private String email;
	
	@Column(nullable = false)
	private String telefone;
	
	@Column(name = "data_aniversario",nullable = false)
	private LocalDate dataAniversario;
	
	@OneToMany(mappedBy = "usuario")
	private Set<RegistroEstaconamento> registroEstacionamentos;
}
