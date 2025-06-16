package com.quinta.core.repositories;

import com.quinta.core.models.Funcaofuncionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncaoFuncionarioRepository extends JpaRepository<Funcaofuncionario, Integer> {
}
