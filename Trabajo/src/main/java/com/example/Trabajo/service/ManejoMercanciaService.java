package com.example.Trabajo.service;

import com.example.Trabajo.model.*;
import com.example.Trabajo.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManejoMercanciaService {
    // ------- Cliente
    @Autowired
    private ClienteRepository clienteRepository;

    // Agregar cliente
    public Cliente agregarCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }
    // Ver clientes
    public List<Cliente> listarClientes() {
        return clienteRepository.findAll();
    }


    // ------- Empleado
    @Autowired
    private EmpleadoRepository empleadoRepository;

    // Agregar empleado
    public Empleado agregarEmpleado(Empleado empleado) {
        return empleadoRepository.save(empleado);
    }
    // Ver empleados
    public List<Empleado> listarEmpleados() {
        return empleadoRepository.findAll();
    }


    // ------- Proveedor
    @Autowired
    private ProveedorRepository proveedorRepository;

    // agregar proveedor
    public Proveedor agregarProveedor(Proveedor proveedor) {
        return proveedorRepository.save(proveedor);
    }
    // Ver proveedores
    public List<Proveedor> listarProveedores() {
        return proveedorRepository.findAll();
    }

    // ------- Mercancia
    @Autowired
    private MercanciaRepository mercanciaRepository;

    // Agregar mercancia
    public Mercancia agregarMercancia(Mercancia mercancia) {
        return mercanciaRepository.save(mercancia);
    }
    // Ver mercancia
    public List<Mercancia> listarMercancias() {
        return mercanciaRepository.findAll();
    }


    // ------- Recibo unitario
    @Autowired
    private ReciboUnitarioRepository reciboUnitarioRepository;

    // Crear recibo
    public ReciboUnitario crearRecibo(ReciboUnitario recibo) {
        return reciboUnitarioRepository.save(recibo);
    }
    // Ver Recibos
    public List<ReciboUnitario> listarRecibos() {
        return reciboUnitarioRepository.findAll();
    }

    // ------- Recibo general
    @Autowired
    private ReciboGeneralVentaRepository reciboGeneralVentaRepository;

    // Crear recibo venta
    public ReciboGeneralVenta crearReciboGeneralVenta(ReciboGeneralVenta recibo) {
        return reciboGeneralVentaRepository.save(recibo);
    }
    // ver los recibos de las ventas
    public List<ReciboGeneralVenta> listarReciboGeneralVentas() {
        return reciboGeneralVentaRepository.findAll();
    }


    @Autowired
    private ReciboGeneralCompraRepository reciboGeneralCompraRepository;

    // Crear recibo compra
    public ReciboGeneralCompra crearReciboGeneralCompra(ReciboGeneralCompra recibo) {
        return reciboGeneralCompraRepository.save(recibo);
    }
    // Ver los recibos de las compras hechas
    public List<ReciboGeneralCompra> listarReciboGeneralCompras() {
        return reciboGeneralCompraRepository.findAll();
    }
}

