package com.quinta.core.repositories;

import com.quinta.core.models.Tipofatura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipofaturaRepository extends JpaRepository<Tipofatura, Integer> {
    // Adiciona aqui métodos customizados se precisares
}
