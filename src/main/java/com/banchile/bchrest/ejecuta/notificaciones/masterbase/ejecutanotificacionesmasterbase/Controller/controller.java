package com.banchile.bchrest.ejecuta.notificaciones.masterbase.ejecutanotificacionesmasterbase.Controller;

import java.util.ArrayList;
import java.util.List;

import com.banchile.bchrest.ejecuta.notificaciones.masterbase.ejecutanotificacionesmasterbase.Entity.Employee;
import com.banchile.bchrest.ejecuta.notificaciones.masterbase.ejecutanotificacionesmasterbase.Entity.User;
import com.banchile.bchrest.ejecuta.notificaciones.masterbase.ejecutanotificacionesmasterbase.Service.MasterBase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.java.Log;

@RestController
@Log
public class controller {

    @Autowired
    private MasterBase metodos;

    @GetMapping("/users")
    public List<User> findAll() {
        // retornará todos los usuarios
        log.info(metodos.atrapalosATodes().toString());
        return metodos.atrapalosATodes();
    }

    @PostMapping("/employees")
    Employee newEmployee(@RequestBody Employee newEmployee) {
        return newEmployee;
    }

}