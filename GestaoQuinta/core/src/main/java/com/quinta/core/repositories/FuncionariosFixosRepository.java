package com.quinta.core.repositories;

import com.quinta.core.models.Funcionariosfixo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncionariosFixosRepository extends JpaRepository<Funcionariosfixo, Integer> {
}
