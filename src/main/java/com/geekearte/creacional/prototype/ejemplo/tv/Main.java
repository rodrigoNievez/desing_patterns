package com.geekearte.creacional.prototype.ejemplo.tv;

/**
 * Created by rodrigo on 6/14/16.
 */
public class Main {

    public static void main(String[] args) throws Exception{
        TvPrototype prototype = new TvPrototype();

        Plasma plasma = (Plasma) prototype.prototipo("Plasma");

        System.out.println(plasma.getColor());
        System.out.println(plasma.getTiempoRespuesta());
    }
}
