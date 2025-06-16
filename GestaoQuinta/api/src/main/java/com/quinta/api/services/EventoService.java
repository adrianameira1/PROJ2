package com.quinta.api.services;

import com.quinta.core.models.Evento;
import com.quinta.core.repositories.EventoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventoService {

    private final EventoRepository eventoRepository;

    public EventoService(EventoRepository eventoRepository) {
        this.eventoRepository = eventoRepository;
    }

    public List<Evento> findAll() {
        return eventoRepository.findAll();
    }

    public Evento findById(Integer id) {
        return eventoRepository.findById(id).orElse(null);
    }

    public Evento save(Evento evento) {
        return eventoRepository.save(evento);
    }

    public void deleteById(Integer id) {
        eventoRepository.deleteById(id);
    }
}
