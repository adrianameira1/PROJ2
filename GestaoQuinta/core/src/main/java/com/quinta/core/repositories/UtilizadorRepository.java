package com.quinta.core.repositories;

import com.quinta.core.models.Utilizador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtilizadorRepository extends JpaRepository<Utilizador, Integer> {
}

