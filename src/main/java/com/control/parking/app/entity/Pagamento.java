package com.control.parking.app.entity;

import com.control.parking.app.enums.FormaPagamento;
import com.control.parking.app.enums.PagamentoStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Pagamento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID id;
	
	@ManyToOne
	@JoinColumns({
			@JoinColumn(name = "usuario_id", referencedColumnName = "usuario_id"),
			@JoinColumn(name = "veiculo_id", referencedColumnName = "veiculo_id"),
			@JoinColumn(name = "estacionamento_id", referencedColumnName = "estacionamento_id")
	})
	private RegistroEstaconamento registroEstacionamento;
	
	@Column(nullable = false)
	private BigDecimal valor;
	
	@Column(name = "data_pagamento")
	private LocalDateTime dataPagamento;
	
	@Enumerated(EnumType.ORDINAL)
	@Column(name = "forma_pagamento", nullable = false)
	private FormaPagamento formaPagamento;
	
	@Enumerated(EnumType.ORDINAL)
	@Column(name = "status", nullable = false)
	private PagamentoStatus status;
}
