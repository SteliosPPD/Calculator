package calculator;

import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Give me a number: ");
        double a = input.nextDouble();
        System.out.println("Give me another one: ");
        double b = input.nextDouble();

        calculator calc = new calculator();
        double apotelesma = calc.prosthesi(a, b);
        System.out.println("a + b = " + apotelesma);
        double apotelesma1 = calc.afairesi(a, b);
        System.out.println("a - b = " + apotelesma1);
        double apotelesma2 = calc.diairesi(a, b);
        System.out.println("a / b = " + apotelesma2);
        double apotelesma3 = calc.pollaplasiasmos(a, b);
        System.out.println("a * b = " + apotelesma3);

    }

    public double prosthesi(double x, double y) {
        double sum = x + y;
        return sum;
    }

    public double afairesi(double x, double y) {
        double diafora = x - y;
        return diafora;
    }

    public double diairesi(double x, double y) {
        if (y == 0) {
            System.out.println("The second value is invalid");
            return 0;
        } else {
            double di = x / y;
            return di;
        }
    }

    public double pollaplasiasmos(double x, double y) {
        double pol = x * y;
        return pol;
    }

}
