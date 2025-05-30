package com.cajerodeleli.atm.entity;

import java.time.LocalDateTime;
import lombok.*;
import jakarta.persistence.*;

@Entity 
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Movimiento {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime fecha;
    @Enumerated(EnumType.STRING)
    private TipoMovimiento tipo;
    private double monto;
    @ManyToOne
    @JoinColumn(name = "cuenta_id", nullable = false)
    private Cuenta cuenta;

}
