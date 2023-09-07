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
@Table(name = "solicitudes")
public class Solicitudes {

    @Id
    @SequenceGenerator(
            name = "solicitud_sequence",
            sequenceName = "aspirante_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "solicitud_sequence"
    )
    @Column(name = "id_solicitud")
    private Long idSolicitud;
    @JoinColumn(name = "periodo_admision", referencedColumnName = "periodo_admision")
    @ManyToOne
    private PeriodosAdmision periodoAdmision;
    @Column(name= "numero_solicitud")
    private int numeroSolicitud;
    @Column(name= "apellido_paterno",length = 50)
    private String apellidoPaterno;
    @Column(name= "apellido_materno",length = 50)
    private String apellidoMaterno;
    @Column(name="nombre")
    private String nombre;
    @Column(name= "telefono",length = 10)
    private String telefono;
    @Column(name= "correo_electronico",length = 50, nullable = false, unique = true)
    private String correoElectronico;
    @Column(name= "nip",nullable = false)
    private Long nip;
    @Column(name = "estado_nacimiento")
    private String estadoNacimiento;
    @Column(name = "clave_estado_nacimiento")
    private String claveEstado;
    @Column(name = "letras_curp_estado_nacimiento")
    private String letrasCurpEstado;
    @Column(name= "fecha_nacimiento")
    private Date fechaNacimiento;
    @Column(name= "genero")
    private char genero; // H - M
    @Column(name= "curp",length = 18, nullable = false, unique = true)
    private String curp;
    @Column(name = "domicilio_calle")
    private String domicilioCalle;
    @Column(name = "domicilio_numero")
    private String domicilioNumero;
    @Column(name = "domicilio_colonia")
    private String domicilioColonia;
    @Column(name= "domicilio_cp",length = 7)
    private String codigoPostal;
    @Column(name = "domicilio_municipio", length = 50)
    private String municipio;
    @Column(name = "domicilio_estado")
    private String domicilioEstado;
    @Column(name = "escuela_procedencia")
    private String escuelaProcedencia;
    @Column(name = "clave_escuela_procedencia")
    private String claveEscuelaProcedencia;
    @JoinColumn(name = "clave_carrera_1", referencedColumnName = "reticula_carrera")
    @ManyToOne
    private Carreras claveCarrera1;
    @JoinColumn(name = "clave_carrera_2", referencedColumnName = "reticula_carrera")
    @ManyToOne
    private Carreras claveCarrera2;

}
