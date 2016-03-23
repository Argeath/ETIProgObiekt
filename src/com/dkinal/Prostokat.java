package com.dkinal;

/**
 * @author Dominik Kinal <d.kinal@volanto.pl>
 */
public class Prostokat extends Figura {
    private double a, b;

    public Prostokat(double a, double b) throws Wyjatek
    {
        name = "Prostokat";
        if(weryfikacja(a, b))
        {
            this.a = a;
            this.b = b;
        }
    }

    private boolean weryfikacja(double a, double b) throws Wyjatek {
        boolean ok = (a > 0) && (b > 0);
        if(!ok)
            throw new Wyjatek(name);
        return true;
    }

    @Override
    double pole() {
        return a * b;
    }

    @Override
    double obwod() {
        return 2 * (a + b);
    }
}
