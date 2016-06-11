package com.geekearte.creacional.prototype;

/**
 * Created by rodrigo on 6/10/16.
 */
public class PruebaFactoria {

    public static void main(String[] args) {
        FactoriaPrototipo factoria = new FactoriaPrototipo();
        Producto producto = (Producto) factoria.create("producto 1");
        System.out.println ("Este es el objeto creado: " + producto);
    }
}
