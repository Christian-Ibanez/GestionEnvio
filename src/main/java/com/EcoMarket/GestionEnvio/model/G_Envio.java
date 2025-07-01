package com.EcoMarket.GestionEnvio.model;

import java.time.LocalDateTime;


import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.*;
import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "G_Envio")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class G_Envio {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEnvio;

    @Enumerated(EnumType.STRING)
    
    private Estado estadoEnvio;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "America/Santiago")
    private LocalDateTime fechaEnvio;
    
    
    
    
    private String direccionDestino;

    
    @Column(nullable = false, unique = true) // Código único en la base de datos
    private String codigoSeguimiento;

    @Min(value = 1, message = "El ID del pedido debe ser mayor que 0")
    private int idPedido; 
}
