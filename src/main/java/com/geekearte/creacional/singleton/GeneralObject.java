package com.geekearte.creacional.singleton;

/**
 * Created by rodrigo on 6/9/16.
 */

//Esta es la manera clasica de generar objetos

public class GeneralObject {

    private String nombre;

    public GeneralObject(String nombre) {
        this.nombre = nombre;
        System.out.println("Este es el nombre con el que se genero el objeto:" + getNombre());
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


}
