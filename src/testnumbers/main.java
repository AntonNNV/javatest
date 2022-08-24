package testnumbers;

import javax.print.attribute.standard.PrinterMakeAndModel;

public class main {
    public static void main(String[] args) {
        byte a = 126;
        short b = 15045;
        int c = -2054862120;
        long d = 1000000000;
        float e = 123.456f;
        double g = 5.124343284;
        char f = '*';
        boolean h = true;
        String s = "Переменная ССЫЛОЧНОГО типа STRING";

        System.out.println("Переменная byte (8 битная): " + a);
        System.out.println("Переменная целочисленная (16 битная): " + b);
        System.out.println("Переменная целочисленная (32 битная): " + c);
        System.out.println("Переменная целочисленная (64 битная LONG): " + d);
        System.out.println("Переменная с плавающей точкой (32 бит): " + e);
        System.out.println("Переменная с плавающей точкой (64 бит): " + g);
        System.out.println("Переменная (символ): " + f);
        System.out.println("Переменная логическая (t/f): " + h);
        System.out.println(s);
        
    }
}
