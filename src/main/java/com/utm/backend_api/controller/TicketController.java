package com.utm.backend_api.controller;

import com.utm.backend_api.model.Ticket;
import com.utm.backend_api.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tickets")
@CrossOrigin(origins = "*") // Permite peticiones desde Angular
public class TicketController {

    @Autowired
    private TicketRepository ticketRepository;

    // GET /api/tickets: Listar todos los incidentes
    @GetMapping
    public List<Ticket> listarTodos() {
        return ticketRepository.findAll();
    }

    // POST /api/tickets: Registrar un nuevo incidente
    @PostMapping
    public ResponseEntity<Ticket> crearTicket(@RequestBody Ticket ticket) {
        Ticket nuevoTicket = ticketRepository.save(ticket);
        return new ResponseEntity<>(nuevoTicket, HttpStatus.CREATED);
    }
    
    // (Los endpoints PUT y DELETE deben ser implementados por los estudiantes)
}