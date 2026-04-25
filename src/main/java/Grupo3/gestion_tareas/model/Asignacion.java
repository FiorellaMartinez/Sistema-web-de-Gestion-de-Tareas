package Grupo3.gestion_tareas.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Asignacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long usuarioId;
    private Long tareaId;
    private LocalDate fechaAsignacion;

    // CONSTRUCTORES
    public Asignacion() {}

    public Asignacion(Long usuarioId, Long tareaId, LocalDate fechaAsignacion) {
        this.usuarioId = usuarioId;
        this.tareaId = tareaId;
        this.fechaAsignacion = fechaAsignacion;
    }

    // GETTERS Y SETTERS
    public Long getId() {
        return id;
    }

    public Long getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Long usuarioId) {
        this.usuarioId = usuarioId;
    }

    public Long getTareaId() {
        return tareaId;
    }

    public void setTareaId(Long tareaId) {
        this.tareaId = tareaId;
    }

    public LocalDate getFechaAsignacion() {
        return fechaAsignacion;
    }

    public void setFechaAsignacion(LocalDate fechaAsignacion) {
        this.fechaAsignacion = fechaAsignacion;
    }
}