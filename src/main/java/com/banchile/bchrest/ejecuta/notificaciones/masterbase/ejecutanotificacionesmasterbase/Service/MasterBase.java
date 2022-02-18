package com.banchile.bchrest.ejecuta.notificaciones.masterbase.ejecutanotificacionesmasterbase.Service;

import java.util.List;

import com.banchile.bchrest.ejecuta.notificaciones.masterbase.ejecutanotificacionesmasterbase.Entity.User;

import org.springframework.stereotype.Component;

@Component
public interface MasterBase {

    List<User> atrapalosATodes();

}
