package com.quinta.api.services;

import com.quinta.core.models.Eventofuncionario;
import com.quinta.core.models.EventofuncionarioId;
import com.quinta.core.repositories.EventoFuncionarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventoFuncionarioService {

    private final EventoFuncionarioRepository eventoFuncionarioRepository;

    public EventoFuncionarioService(EventoFuncionarioRepository eventoFuncionarioRepository) {
        this.eventoFuncionarioRepository = eventoFuncionarioRepository;
    }

    public List<Eventofuncionario> findAll() {
        return eventoFuncionarioRepository.findAll();
    }

    public Eventofuncionario findById(EventofuncionarioId id) {
        return eventoFuncionarioRepository.findById(id).orElse(null);
    }

    public Eventofuncionario save(Eventofuncionario ef) {
        return eventoFuncionarioRepository.save(ef);
    }

    public void deleteById(EventofuncionarioId id) {
        eventoFuncionarioRepository.deleteById(id);
    }
}
