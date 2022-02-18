package com.banchile.bchrest.ejecuta.notificaciones.masterbase.ejecutanotificacionesmasterbase.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@AllArgsConstructor
@ToString
public class User {

    private String nombre;
    private String apellido;
    private String correo;

}