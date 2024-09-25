package com.example.Trabajo.controller;

import com.example.Trabajo.service.ManejoMercanciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/ControlManejoMercancias")
public class ManejoSistema {

    @Autowired
    private ManejoMercanciaService manejoMercanciaService;

    
}
