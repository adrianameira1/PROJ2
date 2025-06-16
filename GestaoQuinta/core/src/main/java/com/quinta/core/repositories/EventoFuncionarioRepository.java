package com.quinta.core.repositories;

import com.quinta.core.models.Eventofuncionario;
import com.quinta.core.models.EventofuncionarioId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventoFuncionarioRepository extends JpaRepository<Eventofuncionario, EventofuncionarioId> {
    // Se precisar de queries customizadas, declare aqui.
}
