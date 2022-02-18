package com.banchile.bchrest.ejecuta.notificaciones.masterbase.ejecutanotificacionesmasterbase.Service;

import java.util.ArrayList;
import java.util.List;

import com.banchile.bchrest.ejecuta.notificaciones.masterbase.ejecutanotificacionesmasterbase.Entity.User;

import org.springframework.stereotype.Component;

@Component
public class MasterBaseImpl implements MasterBase {

    public List<User> atrapalosATodes() {
        List<User> salida = new ArrayList<User>();
        salida.add(new User("Ricardo", "Gonzalez", "sagi.eltremendo@gmail.com"));
        return salida;
    }
}