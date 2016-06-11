package com.geekearte.creacional.singleton;

/**
 * Created by rodrigo on 6/9/16.
 */
public class EjemploPattern {

    public static void main(String[] args) {
//        Creamos dos objetos singleton
        SingletonObject singletonObject1 = SingletonObject.getInstance("Singleton Nombre 1");
        SingletonObject singletonObject2 = SingletonObject.getInstance("Singleton Nombre 2");

//        Creamos dos objetos generico
        GeneralObject generalObject1 = new GeneralObject("General Nombre 1");
        GeneralObject generalObject2 = new GeneralObject("General Nombre 2");


    }
}
