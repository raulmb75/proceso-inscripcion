package com.serviciosescolares.inscripcion.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@DynamicUpdate
@DynamicInsert
@Builder
@Table(name = "carreras")
public class Carreras {

    @Id
    @SequenceGenerator(
            name = "carrera_sequence",
            sequenceName = "carrera_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "carrera_sequence"
    )
    @Column(name = "id_carrera")
    private Long idCarrera;
    @Column(name = "numero_carrera")
    private Long numeroCarrera;
    @Column(name = "reticula_carrera")
    private Long reticula_carrera;
    @Column(name = "nivel_escolar")
    private Character nivelEscolar;
    @Column(name = "clave_oficial")
    private String claveOficial;
    @Column(name = "nombre_carrera")
    private String nombreCarrera;
    @Column(name = "fecha_inicio")
    private Date fechaInicio;
    @Column(name = "fecha_fin")
    private Date fechaFin;
    @Column(name = "estatus_carrera")
    private String estatus_carerra;

}
