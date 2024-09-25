package com.example.Trabajo.service;

import com.example.Trabajo.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManejoMercanciaService {
    // ------- Cliente
    @Autowired
    private ClienteRepository clienteRepository;

    // ------- Empleado
    @Autowired
    private EmpleadoRepository empleadoRepository;

    // ------- Proveedor
    @Autowired
    private ProveedorRepository proveedorRepository;

    // ------- Mercancia
    @Autowired
    private MercanciaRepository mercanciaRepository;

    // ------- Recibo unitario
    @Autowired
    private ReciboUnitarioRepository reciboUnitarioRepository;

    // ------- Recibo general
    @Autowired
    private ReciboGeneralVentaRepository reciboGeneralVentaRepository;

    @Autowired
    private ReciboGeneralCompraRepository reciboGeneralCompraRepository;
}
