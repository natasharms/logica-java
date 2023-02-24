package util;

public class CurrencyConverter {

    public static final double IOF = 0.06;
    public static double converter (double price, double brl){
        return price * brl + (1.0 + IOF);
    }
}
