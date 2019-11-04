package com.agustin.prcticointegrador_apirest.Model;

public class Museo {

   private int id;
   private String url;
   private String link;
   private String nombre;
   private String direccion;
   private String telefono;
   private String descripcion;
   private String email;
   private String provincia;
   private String depende_de;
   private String autoridad;

    public Museo(int id, String url, String link, String nombre, String direccion, String telefono, String descripcion, String email, String provincia, String depende_de, String autoridad) {
        this.id = id;
        this.url = url;
        this.link = link;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.descripcion = descripcion;
        this.email = email;
        this.provincia = provincia;
        this.depende_de = depende_de;
        this.autoridad = autoridad;
    }

    public Museo(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getDepende_de() {
        return depende_de;
    }

    public void setDepende_de(String depende_de) {
        this.depende_de = depende_de;
    }

    public String getAutoridad() {
        return autoridad;
    }

    public void setAutoridad(String autoridad) {
        this.autoridad = autoridad;
    }
}
