package com.quinta.api.services;

import com.quinta.core.models.Fornecedor;
import com.quinta.core.repositories.FornecedorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FornecedoresService {

    private final FornecedorRepository fornecedoresRepository;

    public FornecedoresService(FornecedorRepository fornecedoresRepository) {
        this.fornecedoresRepository = fornecedoresRepository;
    }

    public List<Fornecedor> findAll() {
        return fornecedoresRepository.findAll();
    }

    public Fornecedor findById(Integer id) {
        return fornecedoresRepository.findById(id).orElse(null);
    }

    public Fornecedor save(Fornecedor fornecedor) {
        return fornecedoresRepository.save(fornecedor);
    }

    public void deleteById(Integer id) {
        fornecedoresRepository.deleteById(id);
    }
}
