package com.company;

import java.util.Scanner;

public class average {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a primeira nota:");
        double A = sc.nextDouble();
        System.out.println("Insira a segunda nota:");
        double B = sc.nextDouble();
        double average = (A * 3.5D + B * 7.5D) / 11.0D;
        System.out.printf("Média = %.5f\n", average);
        sc.close();    }
}
