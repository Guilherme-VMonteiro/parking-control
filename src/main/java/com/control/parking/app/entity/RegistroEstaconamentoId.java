package com.control.parking.app.entity;

import jakarta.persistence.Embeddable;

import java.util.UUID;

@Embeddable
public class RegistroEstaconamentoId {
	private UUID usuarioId;
	private UUID estacionamentoId;
	private UUID veiculoId;
}
