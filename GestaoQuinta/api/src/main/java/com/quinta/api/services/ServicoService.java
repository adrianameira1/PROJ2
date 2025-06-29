package com.quinta.api.services;

import com.quinta.core.models.Servico;
import com.quinta.core.repositories.ServicoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicoService {

    private final ServicoRepository repository;

    public ServicoService(ServicoRepository repository) {
        this.repository = repository;
    }

    public List<Servico> findAll() {
        return repository.findAll();
    }

    public Servico findById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    public Servico save(Servico servico) {
        return repository.save(servico);
    }

    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}
