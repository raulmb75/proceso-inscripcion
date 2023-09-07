package com.serviciosescolares.inscripcion.entity;

import com.serviciosescolares.inscripcion.dto.ERole;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Roles {
    @Id
    @Basic(optional = false)
    @Column(name = "idrol")
    private String idrol;
    @Enumerated(EnumType.STRING)
    @Column(name = "rol")
    private ERole rol;

    public Roles(ERole rol){
        this.rol = rol;
    }
}
