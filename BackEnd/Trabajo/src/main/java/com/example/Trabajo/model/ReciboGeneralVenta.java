package com.example.Trabajo.model;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name="Recibo_General_Venta")
public class ReciboGeneralVenta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int id_empleado;
    private int id_cliente;
    private int id_recibo_unitario;
    private int precio_total;
    private String forma_pago;
    private Date fecha_compra;

    public ReciboGeneralVenta() {
    }

    public ReciboGeneralVenta(int id_empleado, int id_cliente, int id_recibo_unitario, int precio_total, String forma_pago, Date fecha_compra) {
        this.id_empleado = id_empleado;
        this.id_cliente = id_cliente;
        this.id_recibo_unitario = id_recibo_unitario;
        this.precio_total = precio_total;
        this.forma_pago = forma_pago;
        this.fecha_compra = fecha_compra;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getId_recibo_unitario() {
        return id_recibo_unitario;
    }

    public void setId_recibo_unitario(int id_recibo_unitario) {
        this.id_recibo_unitario = id_recibo_unitario;
    }

    public int getPrecio_total() {
        return precio_total;
    }

    public void setPrecio_total(int precio_total) {
        this.precio_total = precio_total;
    }

    public String getForma_pago() {
        return forma_pago;
    }

    public void setForma_pago(String forma_pago) {
        this.forma_pago = forma_pago;
    }

    public Date getFecha_compra() {
        return fecha_compra;
    }

    public void setFecha_compra(Date fecha_compra) {
        this.fecha_compra = fecha_compra;
    }
}
