package com.dkinal;

/**
 * @author Dominik Kinal <d.kinal@volanto.pl>
 */
public class Wyjatek extends Exception {
    public Wyjatek(String name) {
        super("To nie jest poprawna figura klasy " + name + "! Autor: Dominik Kinal 160589");
    }
}
