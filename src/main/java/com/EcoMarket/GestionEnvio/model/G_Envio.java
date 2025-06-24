package com.EcoMarket.GestionEnvio.model;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
    private String codigoSeguimiento;
    private int idPedido; 
}
