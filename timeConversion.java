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
        sc.close();
    }
}
