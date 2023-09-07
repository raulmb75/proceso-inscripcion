package com.serviciosescolares.inscripcion.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@DynamicUpdate
@DynamicInsert
@Builder
@Table(name = "aceptados")
public class Aceptados {
    @Id
    @SequenceGenerator(
            name = "aceptados_sequence",
            sequenceName = "aceptados_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "aceptados_sequence"
    )
    @Column(name = "id_aceptado")
    private Long idAceptado;
    @JoinColumn(name = "periodo_admision", referencedColumnName = "periodo_admision")
    @ManyToOne
    private PeriodosAdmision periodoAdmision;
    @JoinColumn(name = "numero_solicitud", referencedColumnName = "numero_solicitud")
    @ManyToOne
    private Solicitudes numeroSolicitud;
    ;


}
