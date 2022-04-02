package challengers;

import java.util.Scanner;

public class conversorBinario {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        //  Criar um algoritmo que mostre o quociente e o resto.

        //  input
        System.out.println("Numero decimal:");
        //  variável do dividendo
        int D = sc.nextInt();
        //  variável do quociente
        int q = D / 2;
        //  variável do resto
        int r = D % 2;

        while (q != 1) {
            System.out.printf("Quociente = %d\nResto = %d\n", q, r);
            q = q / 2;
            r = q % 2;

        }
        sc.close();
    }
}
