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
@Table(name = "fichas_examen")
public class FichasExamen {
    @Id
    @SequenceGenerator(
            name = "fichas_sequence",
            sequenceName = "fichas_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "fichas_sequence"
    )
    @Column(name = "id_ficha")
    private Long idFicha;
    @JoinColumn(name = "periodo_admision", referencedColumnName = "periodo_admision")
    @ManyToOne
    private PeriodosAdmision periodoAdmision;
    @JoinColumn(name = "numero_solicitud", referencedColumnName = "numero_solicitud")
    @ManyToOne
    private Solicitudes numeroSolicitud;
    @Column(name = "numero_ficha")
    private Long numeroFicha;
    @Column(name = "marca_temporal_envio_pago")
    @Temporal(TemporalType.TIMESTAMP)
    private Date marcaTemporalEnvioPago;
}
