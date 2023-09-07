package com.serviciosescolares.inscripcion.entity;

import com.serviciosescolares.inscripcion.dto.CicloPeriodo;
import com.serviciosescolares.inscripcion.dto.Estatus;
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
@Table(name = "periodos_admision")
public class PeriodosAdmision {

    @Id
    @SequenceGenerator(
            name = "periodo_sequence",
            sequenceName = "periodo_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "periodo_sequence"
    )
    @Column(name = "id_periodo_admision")
    private Long idPeriodoAdmision;
    @Column(name = "periodo_admision")
    private Long periodoAdmision;
    @Column(name = "anio_periodo_admision")
    private Long anioPeriodoAdmision;
    @Column(name = "ciclo_periodo_admision")
    @Enumerated(value = EnumType.STRING)
    private CicloPeriodo cicloPeriodoAdmision;

    public CicloPeriodo getCicloPeriodoAdmision() {
        return cicloPeriodoAdmision;
    }
    public void setCicloPeriodoAdmision(CicloPeriodo cicloPeriodoAdmision) {
        this.cicloPeriodoAdmision = cicloPeriodoAdmision;
    }

    @Column(name = "nombre_periodo_admision")
    private String nombrePeriodoAdmision;
    @Column(name = "fecha_inicio_admision")
    private Date fechaInicio;
    @Column(name = "fecha_fin_admision")
    private Date fechaFin;
    @Column(name = "estatus_periodo_admision")
    @Enumerated(value = EnumType.STRING)
    private Estatus estatusPeriodo;

    public Estatus getEstatusPeriodo() {
        return estatusPeriodo;
    }

    public void setEstatusPeriodo(Estatus estatusPeriodo) {
        this.estatusPeriodo = estatusPeriodo;
    }

    @Column(name = "url_proceso_admision")
    private String urlProcesoAdmision;
    @Column(name = "url_proceso_inscripcion")
    private String urlProcesoInscripcion;


}
