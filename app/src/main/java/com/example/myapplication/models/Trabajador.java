package com.example.myapplication.models;

public abstract class Trabajador extends Persona {
    private float sueldoMensual;
    private float descuentoISR;
    private float totalDescuento;
    private float totalPagar;

    public Trabajador(){}
    public Trabajador(String codigoPersona, String nombrePersona, String apellidoPersona){
        super(codigoPersona, nombrePersona, apellidoPersona);
    }

    public float getSueldoMensual() {
        return sueldoMensual;
    }

    public void setSueldoMensual(float sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }

    public float getDescuentoISR() {
        return descuentoISR;
    }

    public void setDescuentoISR(float descuentoISR) {
        this.descuentoISR = descuentoISR;
    }

    public float getTotalDescuento() {
        return totalDescuento;
    }

    public void setTotalDescuento(float totalDescuento) {
        this.totalDescuento = totalDescuento;
    }

    public float getTotalPagar() {
        return totalPagar;
    }

    public void setTotalPagar(float totalPagar) {
        this.totalPagar = totalPagar;
    }
    public abstract int getTipoTrabajador();
}
