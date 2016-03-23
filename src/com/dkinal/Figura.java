package com.dkinal;

/**
 * @author Dominik Kinal <d.kinal@volanto.pl>
 */
abstract class Figura {
    String name;

    abstract double pole();

    abstract double obwod();

    @Override
    public String toString() {
        return name + ", obwod: " + obwod() + ", pole: " + pole();
    }
}
