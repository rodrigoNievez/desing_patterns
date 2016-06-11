package com.geekearte.creacional.prototype;

import java.util.HashMap;

/**
 * Created by rodrigo on 6/10/16.
 */
public class FactoriaPrototipo {

    private HashMap mapaObjetos;
    private String nombrePorDefecto;

    public FactoriaPrototipo() {
        mapaObjetos = new HashMap();
        // Se incluyen en el mapa todos los productos prototipo
        mapaObjetos.put("producto 1", new UnProducto(1));
    }

    public Object create() {
        return null;
    }

    public Object create(String nombre) {
        nombrePorDefecto = nombre;
        Producto objecto = (Producto) mapaObjetos.get(nombre);
        return objecto != null ? objecto.clone() : null;
    }
}
