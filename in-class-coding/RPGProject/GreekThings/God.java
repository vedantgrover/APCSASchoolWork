package GreekThings;

import Defaults.Greek;

public class God extends Greek {
    public God(String name, int level) {
        super(name, level);
        health = 40 * level + 60;
        type = "greek";
        attackVal = level * 100;
    }
}
