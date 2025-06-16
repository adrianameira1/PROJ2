package com.quinta.api.services;

import com.quinta.core.models.Tipoevento;
import com.quinta.core.repositories.TipoEventoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoEventoService {

    private final TipoEventoRepository repository;

    public TipoEventoService(TipoEventoRepository repository) {
        this.repository = repository;
    }

    public List<Tipoevento> findAll() {
        return repository.findAll();
    }

    public Tipoevento findById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    public Tipoevento save(Tipoevento tipoevento) {
        return repository.save(tipoevento);
    }

    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}
