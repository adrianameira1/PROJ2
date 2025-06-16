package com.quinta.core.repositories;

import com.quinta.core.models.ServicoFornecedor;
import com.quinta.core.models.ServicoFornecedorId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServicoFornecedorRepository extends JpaRepository<ServicoFornecedor, ServicoFornecedorId> {
    // Se precisar de queries customizadas, declare aqui.
}
