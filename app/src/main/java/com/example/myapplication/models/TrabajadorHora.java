package com.example.myapplication.models;

public class TrabajadorHora extends Trabajador {
    private int numeroHoras;
    private float valorHora;

    public TrabajadorHora(){}
    public TrabajadorHora(String codigoPersona, String nombrePersona, String apellidoPersona, int numeroHoras, float valorHora){
        super(codigoPersona, nombrePersona, apellidoPersona);
        this.setNumeroHoras(numeroHoras);
        this.setValorHora(valorHora);
    }

    public int getNumeroHoras() {
        return numeroHoras;
    }

    public void setNumeroHoras(int numeroHoras) {
        this.numeroHoras = numeroHoras;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    public int getTipoTrabajador() {
        return 1;
    }
}
