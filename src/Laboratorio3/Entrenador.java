/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laboratorio3;

/**
 *
 * @author Gabriel
 */
public class Entrenador {

    private String  nombre, tipo;
    public int ContadorEntrenadores, idEntrenador;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setidEntrenador(int idEntrenador) {
        this.idEntrenador = idEntrenador;
    }

    public void setContadorEntrenadores(int ContadorEntrenadores) {
        this.ContadorEntrenadores = ContadorEntrenadores;

    }

    public int getidEntrenador() {
        return idEntrenador;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

}
