package GreekThings;

import Defaults.Greek;

public class Demigod extends Greek {
    public Demigod(String name, int level) {
        super(name, level);
        health = 4 * level + 6;
        type = "greek";
    }
}
