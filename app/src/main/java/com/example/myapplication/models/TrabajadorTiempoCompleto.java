package com.example.myapplication.models;

public class TrabajadorTiempoCompleto extends Trabajador {
    private float descuentoAFP;
    private float descuentoISSS;

    public TrabajadorTiempoCompleto(){}
    public TrabajadorTiempoCompleto(String codigoPersona, String nombrePersona, String apellidoPersona, float descuentoAFP){
        super(codigoPersona, nombrePersona,apellidoPersona);
        this.setDescuentoAFP(descuentoAFP);
        this.setDescuentoISSS(descuentoISSS);
    }

    public float getDescuentoAFP() {
        return descuentoAFP;
    }

    public void setDescuentoAFP(float descuentoAFP) {
        this.descuentoAFP = descuentoAFP;
    }

    public float getDescuentoISSS() {
        return descuentoISSS;
    }

    public void setDescuentoISSS(float descuentoISSS) {
        this.descuentoISSS = descuentoISSS;
    }
    public int getTipoTrabajador() {
        return 2;
    }

}
