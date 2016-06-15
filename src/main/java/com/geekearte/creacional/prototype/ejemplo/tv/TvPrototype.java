package com.geekearte.creacional.prototype.ejemplo.tv;

import java.util.HashMap;

/**
 * Created by rodrigo on 6/14/16.
 */
public class TvPrototype {

    private HashMap<String, TV> prototipos = new HashMap<String, TV>();

    public TvPrototype() {
        Plasma plasma = new Plasma("Sony", 21, "Negro", 399.99, 90, 0.05);
        LCD lcd = new LCD("Panasonic", 47, "Plateado", 599.99, 290);

        prototipos.put("Plasma", plasma);
        prototipos.put("LCD", lcd);
    }

    public Object prototipo(String tipo) throws CloneNotSupportedException {
        return prototipos.get(tipo).clone();
    }
}
