package edu.fer.try_catch;

import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploExcecao {
    public static void main(String[] args)  {
//        Number valor = Double.valueOf("a1.55");
//        System.out.println(valor);

        try {
            Number value = NumberFormat.getInstance().parse("a1.55");
            System.out.println(value);
        } catch (ParseException e) {
            System.out.println("tratar valor");
            throw new RuntimeException(e);
        }
    }
}
