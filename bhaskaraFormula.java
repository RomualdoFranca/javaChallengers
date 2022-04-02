package challengers;

import java.util.Scanner;

public class bhaskaraFormula {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
    Read 3 floating-point numbers. After, print the roots of bhaskara’s formula.
    If it's impossible to calculate the roots because a division by zero or a square root of a negative number,
    presents the message “Impossivel calcular”.
    Input
    Read 3 floating-point numbers (double) A, B and C.
    Output
    Print the result with 5 digits after the decimal point or the message if it is impossible to calculate.
        * */
        double A, B, C, delta , sqrtDelta, x1, x2;
        //  Imput
        System.out.println("Digite a variavel A:");
        A = sc.nextDouble();
        System.out.println("Digite a variavel B:");
        B = sc.nextDouble();
        System.out.println("Digite a variavel C:");
        C = sc.nextDouble();
        delta = Math.pow(B, 2) - (4 * A * C);
        sqrtDelta = Math.sqrt(delta);
        System.out.printf(" Delta = %.5f\nRaiz de delta %.5f\n",delta, sqrtDelta);

        if (sqrtDelta > 0 || sqrtDelta == 0) {
            x1 = (-B + sqrtDelta) / (2 * A);
            x2 = (-B - sqrtDelta) / (2 * A);
            System.out.printf("x' = %.5f\nx'' = %.5f", x1, x2);
        }
        else {
            System.out.println("Impossible to calculate");
        }
        sc.close();
    }

}