package com.control.parking.app.repository;

import com.control.parking.app.entity.Estacionamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface EstacionamentoRepository extends JpaRepository<Estacionamento, UUID> {
}
