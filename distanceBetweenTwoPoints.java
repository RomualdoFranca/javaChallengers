package com.company;

import java.util.Locale;
import java.util.Scanner;

public class distanceBetweenTwoPoints {
    public static void main(String[] args) {
//        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        //  variables
        double x1, y1;
        double x2, y2;

        System.out.println("Insira a coordenada x1 do p1");
        x1 = sc.nextDouble();
        System.out.println("Insira a coordenada y1 do p1");
        y1 = sc.nextDouble();
        System.out.println("Insira a coordenada x2 do p2");
        x2 = sc.nextDouble();
        System.out.println("Insira a coordenada y2 do p2");
        y2 = sc.nextDouble();
        double distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.printf("The distance is: %.4f\n", distance);

        sc.close();
    }
}
