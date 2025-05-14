package com.control.parking.app.repository;

import com.control.parking.app.entity.RegistroEstaconamento;
import com.control.parking.app.entity.RegistroEstaconamentoId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistroEstacionamentoRepository extends JpaRepository<RegistroEstaconamento, RegistroEstaconamentoId> {
}
