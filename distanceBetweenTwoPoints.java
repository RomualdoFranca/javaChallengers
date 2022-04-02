package com.company;

import java.util.Scanner;

public class distanceBetweenTwoPoints {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //  variables
        double x1, y1;
        double x2, y2;
        int a;
        System.out.println("Insira a coordenada x1 do p1");
        x1 = sc.nextInt();
        System.out.println("Insira a coordenada y1 do p1");
        y1 = sc.nextInt();
        System.out.println("Insira a coordenada x2 do p2");
        x2 = sc.nextInt();
        System.out.println("Insira a coordenada y2 do p2");
        y2 = sc.nextInt();

//        a = Math.pow(a , 2);
//        double distance = Math.sqrt(Math.pow((x2 - x1), 2))

        sc.close();
    }
}
