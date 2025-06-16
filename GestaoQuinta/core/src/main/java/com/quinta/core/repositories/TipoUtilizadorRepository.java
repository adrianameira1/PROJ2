package com.quinta.core.repositories;

import com.quinta.core.models.Tipoutilizador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoUtilizadorRepository extends JpaRepository<Tipoutilizador, Integer> {
}

