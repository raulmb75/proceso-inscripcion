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
@Table(name = "numeros_control")
public class NumerosDeControl {

    @Id
    @SequenceGenerator(
            name = "control_sequence",
            sequenceName = "control_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "control_sequence"
    )
    @Column(name = "id_control")
    private Long idControl;
    @JoinColumn(name = "periodo_ingreso", referencedColumnName = "periodo_admision")
    @ManyToOne
    private PeriodosAdmision periodoIngreso;
    @JoinColumn(name = "numero_solicitud", referencedColumnName = "numero_solicitud")
    @ManyToOne
    private Solicitudes numeroSolicitud;
    @Column(name= "numero_control")
    private String numeroControl;
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
    @Column(name = "domicilio_municipio")
    private String municipio;
    @Column(name = "domicilio_estado")
    private String domicilioEstado;
    @Column(name = "carrera")
    private String carrera;


}

