package com.quinta.api.services;
import com.quinta.core.models.Fatura;
import com.quinta.core.repositories.FaturaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FaturaService {

    private final FaturaRepository faturaRepository;

    public FaturaService(FaturaRepository faturaRepository) {
        this.faturaRepository = faturaRepository;
    }

    public List<Fatura> findAll() {
        return faturaRepository.findAll();
    }

    public Fatura findById(Integer id) {
        return faturaRepository.findById(id).orElse(null);
    }

    public Fatura save(Fatura fatura) {
        return faturaRepository.save(fatura);
    }

    public void deleteById(Integer id) {
        faturaRepository.deleteById(id);
    }
}
