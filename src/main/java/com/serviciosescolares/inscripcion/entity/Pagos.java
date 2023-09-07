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
@Table(name = "pagos")
public class Pagos {

    @Id
    @SequenceGenerator(
            name = "pagos_sequence",
            sequenceName = "pagos_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "pagos_sequence"
    )
    @Column(name = "id_pago")
    private Long idPago;
    @JoinColumn(name = "concepto_pago", referencedColumnName = "concepto_pago")
    @ManyToOne
    private TiposDePagos conceptoPago; // Revisar el tipo de dato
    @JoinColumn(name = "periodo", referencedColumnName = "periodo")
    @ManyToOne
    private PeriodosEscolares periodo;
    @JoinColumn(name = "numero_solicitud", referencedColumnName = "numero_solicitud")
    @ManyToOne
    private Solicitudes numeroSolicitud;
    @JoinColumn(name = "numero_control", referencedColumnName = "numero_control")
    @ManyToOne
    private NumerosDeControl numeroControl;
    @Column(name = "forma_pago")
    private String formaPago;
    @Column(name = "cantidad_pago")
    private Long cantidadPago;
    @Column(name = "fecha_pago")
    private Date fechaPago;
    @Column(name = "hora_pago")
    private Date horaPago;
    @Column(name = "folio")
    private Long folio;
    @Column(name = "marca_temporal_envio_pago")
    @Temporal(TemporalType.TIMESTAMP)
    private Date marcaTemporalEnvioPago;
    @Column(name = "estatus_pago")
    private String estatusPago;
    @Column(name = "observacion_pago")
    private String observacionPago;



}
