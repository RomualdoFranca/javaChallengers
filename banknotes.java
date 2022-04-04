package com.company;

import java.util.Locale;
import java.util.Scanner;

public class banknotes {
    public static void main(String[] args) {
        /*
        In this problem you have to read an integer value and calculate the smallest possible number of banknotes
        in which the value may be decomposed. The possible banknotes are 100, 50, 20, 10, 5, 2 e 1.
        Print the read value and the list of banknotes.
        Input
        The input file contains an integer value N (0 < N < 1000000).
        Output
        Print the read number and the minimum quantity of each necessary banknotes in Portuguese language,
        as the given example.
        */
        Locale.setDefault(Locale.US);
        Scanner sc  = new Scanner(System.in);
        int value;
        System.out.println("Informe o valor do saque:\n" +
                "Cédulas disponíveis 2, 5, 10, 20, 50, 100");
        value = sc.nextInt();


        if (value % 100 == 0){
            int notasDe100 = value / 100;
            System.out.printf("%d nota(s) de R$ 100,00\n", notasDe100);

        }else if (value > 100){
            int notasDe100 = value / 100;
            System.out.printf("%d nota(s) de R$ 100,00\n", notasDe100);
            int restoValue = value - (notasDe100 * 100);
            if (restoValue >= 50){
                System.out.println("1 nota(s) de R$ 50,00");
                int notasDe20 = (restoValue - 50) / 20;
            }


        }





        sc.close();
    }
}
