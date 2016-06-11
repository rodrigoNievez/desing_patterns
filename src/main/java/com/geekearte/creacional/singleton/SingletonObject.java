package com.geekearte.creacional.singleton;

/**
 * Created by rodrigo on 6/9/16.
 */

/*
Este patrón se encarga de generar solo una instancia del objeto, esto se logra al crear un constructor privado
y agregando un método que nos regresara una instancia del objeto si es que esté no existe.
*/

public class SingletonObject {

    private String nombre;

    private static SingletonObject patternSongleton;

/*    De este modo nos aseguramos de que solo desde la clase
    podamos acceder a crear la instancia de esta clase */
    private SingletonObject(String nombre) {
        this.nombre = nombre;
        System.out.println("Este es el nombre recibido como parámetro: " + nombre);
    }

    public static SingletonObject getInstance(String nombre) {
        if (patternSongleton == null) {

            patternSongleton = new SingletonObject(nombre);
        } else {
            System.out.println("No se puede crear el objeto con nombre: " +
                    nombre + " por que ya existe un objeto de la clase con el nombre: " +
                    patternSongleton.getNombre());
        }

        return patternSongleton;

    }

    public String getNombre() {
        return nombre;
    }

}
