package com.udea.cancelaciones.models;

public abstract class Usuario {
    protected String nombre;
    protected String apellidos;
    protected EnumTipoDoc tipoDoc;
    protected String id;
    protected String correo;
    protected String nombreUsuario;
    protected String contraseña;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public EnumTipoDoc getTipoDoc() {
        return tipoDoc;
    }
    public void setTipoDoc(EnumTipoDoc tipoDoc) {
        this.tipoDoc = tipoDoc;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getNombreUsuario() {
        return nombreUsuario;
    }
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
    public String getContraseña() {
        return contraseña;
    }
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
}
