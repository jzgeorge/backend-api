package com.utm.backend_api.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tickets")
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String titulo;

    private String descripcion;

    @Column(nullable = false)
    private String categoria; // Red, Hardware, Software

    @Column(nullable = false)
    private String prioridad; // Alta, Media, Baja

    @Column(nullable = false)
    private String estado = "Abierto"; // Por defecto

    // Constructores, Getters y Setters (Omitidos por brevedad, los estudiantes deben generarlos)
    public Ticket() {}
    
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    
    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    
    public String getCategoria() { return categoria; }
    public void setCategoria(String categoria) { this.categoria = categoria; }
    
    public String getPrioridad() { return prioridad; }
    public void setPrioridad(String prioridad) { this.prioridad = prioridad; }
    
    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
}