package com.quinta.core.repositories;

import com.quinta.core.models.Tipoevento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoEventoRepository extends JpaRepository<Tipoevento, Integer> {
}

