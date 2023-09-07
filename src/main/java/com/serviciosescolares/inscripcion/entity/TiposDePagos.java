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
@Table(name = "tipos_pagos")
public class TiposDePagos {
    @Id
    @SequenceGenerator(
            name = "tipospagos_sequence",
            sequenceName = "tipospagos_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "tipospagos_sequence"
    )
    @Column(name = "id_tipo_pago")
    private Long idTipoPago;
    @Column(name = "concepto_pago")
    private String conceptoPago;
    @Column(name = "concepto_pago_corto")
    private String conceptoPagoCorto;
    @Column(name = "estatus_concepto_pago")
    private Boolean estatusConceptoPago;

}
