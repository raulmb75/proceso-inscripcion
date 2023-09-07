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
@Table(name = "periodos_escolares")
public class PeriodosEscolares {

    @Id
    @SequenceGenerator(
            name = "periodoescolar_sequence",
            sequenceName = "periodoescolar_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "periodoescolar_sequence"
    )
    @Column(name = "id_periodo")
    private Long idPeriodo;
    @Column(name = "periodo")
    private Long periodo;
    @Column(name = "anio_periodo")
    private Long anioPeriodo;
    @Column(name = "ciclo_periodo")
    private String cicloPeriodo;
    @Column(name = "nombre_periodo")
    private String nombrePeriodo;
    @Column(name = "nombre_periodo_largo")
    private String nombrePeriodoLargo;
    @Column(name = "fecha_inicio")
    private Date fechaInicio;
    @Column(name = "fecha_fin")
    private Date fechaFin;
    @Column(name = "estatus_periodo")
    private String estatusPeriodo;
    @Column(name = "fecha_inicio_periodo_inter_1")
    private Date fechaInicioInter1;
    @Column(name = "fecha_fin_periodo_inter_1")
    private Date fechaFinInter1;
    @Column(name = "fecha_inicio_vacaciones_1")
    private Date fechaInicioVacaciones1;
    @Column(name = "fecha_fin_vacaciones_1")
    private Date fechaFinVacaciones1;
    @Column(name = "fecha_inicio_periodo_inter_2")
    private Date fechaInicioInter2;
    @Column(name = "fecha_fin_periodo_inter_2")
    private Date fechaFinInter2;
    @Column(name = "fecha_inicio_vacaciones_2")
    private Date fechaInicioVacaciones2;
    @Column(name = "fecha_fin_vacaciones_2")
    private Date fechaFinVacaciones2;
    @Column(name = "fecha_inicio_seleccion_materias")
    private Date fechaInicioSeleccionMaterias;
    @Column(name = "fecha_fin_seleccion_materias")
    private Date fechaFinSeleccionMaterias;
    @Column(name = "fecha_inicio_carga_calificaciones")
    private Date fechaInicioCargaCalificaciones;
    @Column(name = "fecha_fin_carga_calificaciones")
    private Date fechaFinCargaCalificaciones;

}
