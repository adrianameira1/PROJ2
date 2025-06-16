package com.quinta.api.controllers;

import com.quinta.core.models.Fatura;
import com.quinta.core.models.Evento;
import com.quinta.core.models.Tipofatura;
import com.quinta.core.repositories.EventoRepository;
import com.quinta.core.repositories.TipofaturaRepository;
import com.quinta.api.DTOs.FaturaDTO;
import com.quinta.api.services.FaturaService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/faturas")
@Tag(name = "Faturas", description = "Endpoints para manipular faturas")
public class FaturaController {

    private final FaturaService faturaService;
    private final EventoRepository eventoRepository;
    private final TipofaturaRepository tipofaturaRepository;

    public FaturaController(FaturaService faturaService,
                            EventoRepository eventoRepository,
                            TipofaturaRepository tipofaturaRepository) {
        this.faturaService = faturaService;
        this.eventoRepository = eventoRepository;
        this.tipofaturaRepository = tipofaturaRepository;
    }

    @GetMapping
    public List<FaturaDTO> getAllFaturas() {
        return faturaService.findAll().stream()
                .map(f -> new FaturaDTO(
                        f.getValor(),
                        f.getDtemissao(),
                        f.getStatus(),
                        f.getDtpagamento(),
                        f.getIdEvento().getId(),
                        f.getIdTipofatura().getId()))
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public ResponseEntity<FaturaDTO> getFaturaById(@PathVariable Integer id) {
        Fatura f = faturaService.findById(id);
        if (f == null) return ResponseEntity.notFound().build();

        return ResponseEntity.ok(new FaturaDTO(
                f.getValor(),
                f.getDtemissao(),
                f.getStatus(),
                f.getDtpagamento(),
                f.getIdEvento().getId(),
                f.getIdTipofatura().getId()));
    }

    @PostMapping
    public ResponseEntity<Void> createFatura(@RequestBody FaturaDTO dto) {
        Evento evento = eventoRepository.findById(dto.getIdEvento()).orElse(null);
        Tipofatura tipo = tipofaturaRepository.findById(dto.getIdTipofatura()).orElse(null);
        if (evento == null || tipo == null) return ResponseEntity.badRequest().build();

        Fatura fatura = new Fatura();
        fatura.setValor(dto.getValor());
        fatura.setDtemissao(dto.getDtemissao());
        fatura.setStatus(dto.getStatus());
        fatura.setDtpagamento(dto.getDtpagamento());
        fatura.setIdEvento(evento);
        fatura.setIdTipofatura(tipo);

        faturaService.save(fatura);
        return ResponseEntity.status(201).build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateFatura(@PathVariable Integer id, @RequestBody FaturaDTO dto) {
        Fatura existing = faturaService.findById(id);
        if (existing == null) return ResponseEntity.notFound().build();

        Evento evento = eventoRepository.findById(dto.getIdEvento()).orElse(null);
        Tipofatura tipo = tipofaturaRepository.findById(dto.getIdTipofatura()).orElse(null);
        if (evento == null || tipo == null) return ResponseEntity.badRequest().build();

        existing.setValor(dto.getValor());
        existing.setDtemissao(dto.getDtemissao());
        existing.setStatus(dto.getStatus());
        existing.setDtpagamento(dto.getDtpagamento());
        existing.setIdEvento(evento);
        existing.setIdTipofatura(tipo);

        faturaService.save(existing);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFatura(@PathVariable Integer id) {
        Fatura fatura = faturaService.findById(id);
        if (fatura == null) return ResponseEntity.notFound().build();
        faturaService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
