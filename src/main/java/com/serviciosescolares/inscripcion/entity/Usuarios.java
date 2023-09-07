package com.serviciosescolares.inscripcion.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Table(name = "acceso",
        uniqueConstraints = @UniqueConstraint(columnNames = "usuario"))
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Usuarios {


    @Id
    @Column(nullable = false, length = 20)
    private String usuario;
    @Column(nullable = false)
    private String nombreUsuario;
    @Column(nullable = false)
    private String contrasena;
    @Column(nullable = false)
    private Character tipoUsuario;
    private Character status;
    @Column(nullable = false)
    private LocalDateTime ultimoAcceso;
    @Column(name = "observaciones", length = 512)
    private String observaciones;
    @JoinColumn(name = "idrol", referencedColumnName = "idrol")
    @ManyToOne(optional = false)
    private Roles idrol;


}
