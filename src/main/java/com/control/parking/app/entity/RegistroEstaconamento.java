package com.control.parking.app.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Set;
import java.util.UUID;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "registro_estacionamento")
public class RegistroEstaconamento {
	
	@EmbeddedId
	private RegistroEstaconamentoId id;
	
	@ManyToOne
	@MapsId("usuarioId")
	@JoinColumn(name = "usuario_id")
	private Usuario usuario;
	
	@ManyToOne
	@MapsId("veiculoId")
	@JoinColumn(name = "veiculo_id")
	private Veiculo veiculo;
	
	@ManyToOne
	@MapsId("estacionamentoId")
	@JoinColumn(name = "estacionamento_id")
	private Estacionamento estacionamento;
	
	@OneToMany(mappedBy = "registroEstacionamento")
	private Set<Pagamento> pagamentos;
	
	@Column(name = "data_entrada", nullable = false)
	private LocalDate dataEntrada;
	
	@Column(name = "data_saida")
	private LocalDate dataSaida;
	
	@Column(name = "valor_hora")
	private BigDecimal valorHora;
	
	private boolean agendado;
	
	private boolean cancelado;
}
