package com.ufps.asincrono.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import static java.time.temporal.WeekFields.ISO;
import java.util.Date;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

@Data
@Entity
@Table(name = "usuarios")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "email")
    private String email;

}
