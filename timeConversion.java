package com.company;

import java.util.Scanner;

public class timeConversion {
    public static void main(String[] args){
        /*  Read an integer value, which is the duration in seconds of a certain event in a factory,
        and inform it expressed in hours:minutes:seconds.
        Input
        The input file contains an integer N.
        Output
        Print the read time in the input file (seconds) converted in hours:minutes:seconds like the following example.
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("Time Conversion\n\nInput the seconds:");
        int N = sc.nextInt();

        System.out.println("Time Conversion\n\nInput the seconds:");
        int N = sc.nextInt();
        int hour, minuts, seconds;

        //  Os segundos inseridos resulta em menos de uma hora
        if (N < 3600 && N >= 60){
            minuts = N / 60;
            seconds = N % 60;
            System.out.printf("0:%d:%d\n", minuts, seconds);
        //  Nessa condicao temos duas possibilidades
        }else if (N >= 3600){
        //  Os segundos inseridos resulta em hora inteira
            if (N % 3600 == 0){
                hour = N / 3600;
                System.out.printf("%d:0:0\n", hour);

            //  Os segundos inseridos resultam em hora fracionada
            }else {
                //  Essa divisão resulta na hora inteira
                hour = N / 3600;
                //  Esse módulo é a sobra dos segundos que não somam uma hora
                minuts = (N % 3600) / 60;
                System.out.println(minuts);
                //  Esse módulo é a sobra dos segundos que não somam um minuto
                seconds = (N % 60) % 60;
                System.out.println("seconds " + seconds);
                System.out.printf("%d:%d:%d\n", hour, minuts, seconds);
            }
        }else {
            System.out.printf("0:0:%d", N);
        }
        sc.close();
    }
}
