package challengers;

import java.util.Scanner;

/*
Read 2 variables, named A and B and make the sum of these two variables, assigning its result to the variable X.
Print X as shown below.
Print endline after the result otherwise you will get “Presentation Error”.
Input
The input file will contain 2 integer numbers.
Output
Print the letter X (uppercase) with a blank space before and after the equal signal followed by the value of X, according to the following example.
Obs.: don't forget the endline after all.
*/
public class sumTwoVariables {
    public static void main(String[] args){

        int A, B, X;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a variable A:");
        A = sc.nextInt();
        System.out.println("Input a variable B:");
        B = sc.nextInt();
        X = A + B;
        System.out.printf("X = %d", X);
        sc.close();
    }
}
