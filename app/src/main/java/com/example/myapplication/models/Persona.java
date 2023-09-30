package com.example.myapplication.models;

    import androidx.annotation.NonNull;
public abstract class Persona {
    private String codigoPersona;
    private String nombrePersona;
    private String apellidoPersona;

    public Persona(){}

    public Persona(String codigoPersona, String nombrePersona, String apellidoPersona){
        this.setCodigoPersona(codigoPersona);
        this.setNombrePersona(nombrePersona);
        this.setApellidoPersona(apellidoPersona);
    }

    public String getCodigoPersona() {
        return codigoPersona;
    }

    public void setCodigoPersona(String codigoPersona) {
        this.codigoPersona = codigoPersona;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public String getApellidoPersona() {
        return apellidoPersona;
    }

    public void setApellidoPersona(String apellidoPersona) {
        this.apellidoPersona = apellidoPersona;
    }
    @NonNull
    @Override
    public String toString() {
        return codigoPersona + nombrePersona + apellidoPersona;
    }
}