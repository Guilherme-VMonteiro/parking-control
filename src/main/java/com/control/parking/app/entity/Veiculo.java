package com.control.parking.app.entity;

import com.control.parking.app.enums.TipoVeiculo;
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
public class Veiculo {
	
	@Id
	@GeneratedValue(strategy = jakarta.persistence.GenerationType.UUID)
	private UUID id;
	
	@Column(nullable = false, unique = true)
	private String placa;
	
	@Column(nullable = false)
	private String modelo;
	
	@Column(nullable = false)
	private String cor;
	
	@Column(nullable = false)
	private String marca;
	
	@Enumerated(EnumType.ORDINAL)
	@Column(name = "tipo_veiculo", nullable = false)
	private TipoVeiculo tipoVeiculo;
	
	@ManyToOne
	@JoinColumn(name = "proprietario_id", referencedColumnName = "id")
	private Usuario proprietario;
}
