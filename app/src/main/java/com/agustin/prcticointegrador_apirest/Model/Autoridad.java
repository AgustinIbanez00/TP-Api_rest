package com.agustin.prcticointegrador_apirest.Model;

public class Autoridad {
    private String nombre;
    private String email;
    private String cargo;

    public Autoridad(String nombre, String email, String cargo) {
        this.nombre = nombre;
        this.email = email;
        this.cargo = cargo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
