package com.utn.ejer01.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Entity  //califica a la proxima instruccion, en este caso la clase y le dice q vaa estar manejado x jpa
@Data    //genera metodos get,set,equals
@NoArgsConstructor //genera const
@AllArgsConstructor //genera todos los const sobrecargados
@Builder
public class Persona implements Serializable {
    @Id
    @GeneratedValue()
    private Long id;
    
    private String nombre;
    
    private String apellido;
    
    private int edad;
     
    
}
