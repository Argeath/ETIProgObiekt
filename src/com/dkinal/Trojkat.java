package com.dkinal;

/**
 * @author Dominik Kinal <d.kinal@volanto.pl>
 */
class Trojkat extends Figura {
    private double a, b, c;

    public Trojkat(double a, double b, double c) throws Wyjatek
    {
        name = "Trojkat";
        if(weryfikacja(a, b, c))
        {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }

    private boolean weryfikacja(double a, double b, double c) throws Wyjatek {
        boolean ok = (a > 0) && (b > 0) && (c > 0);
        if(!ok)
            throw new Wyjatek(name);
        return true;
    }

    @Override
    double pole() {
        double p = 0.5 * obwod();
        double in = p * (p - a) * (p - b) * (p - c); // Wzór Herona
        return Math.sqrt(in);
    }

    @Override
    double obwod() {
        return a + b + c;
    }
}
