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
public class Main {

    public static void main(String[] args) {
        Entrenador entrenador1 = new Entrenador();
        entrenador1.setNombre("Gabriel");
        System.out.println("Nombre: " + entrenador1.getNombre());
        entrenador1.setidEntrenador(12324);
        System.out.println("El id es: " + entrenador1.getidEntrenador());
        entrenador1.setTipo("Tenis");
        System.out.println("El tipo es: " + entrenador1.getTipo());

    }
}
