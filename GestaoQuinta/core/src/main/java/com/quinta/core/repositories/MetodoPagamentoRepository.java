package com.quinta.core.repositories;

import com.quinta.core.models.Metodopagamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MetodoPagamentoRepository extends JpaRepository<Metodopagamento, Integer> {
}
