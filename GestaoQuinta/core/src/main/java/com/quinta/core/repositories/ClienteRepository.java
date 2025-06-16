package com.quinta.core.repositories;

import com.quinta.core.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
    // Se precisares de queries customizadas, podes declarar aqui.
}
