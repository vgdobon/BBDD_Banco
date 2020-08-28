package com.clases;


import com.clases.BaseDeDatos;
import com.sun.security.ntlm.Client;

public class Cliente {

    private int id;
    private String nombre;
    private String apellido;

    public Cliente (String nombre,String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.crearCliente(this.nombre,this.apellido);
    }

    private void crearCliente(String nombre , String apellido){

    }



    //--------------GETTER Y SETTER------------


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
