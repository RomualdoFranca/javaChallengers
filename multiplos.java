package challengers;

import java.util.Scanner;

public class multiplos {
    /*Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
    Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
    ordem crescente ou decrescente.*/

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A, B;
        System.out.println("Digite um valor inteiro: ");
        A = sc.nextInt();
        System.out.println("Digite outro valor inteiro: ");
        B = sc.nextInt();
        if (A > B){
            if (A % B == 0){
                System.out.println("Os números digitados são multiplos entre si.");
            }
            else {
                System.out.println("Os números digitados não são multiplos entre si.");
            }
        }
        else if (B % A == 0){
            System.out.println("Os números digitados são multiplos entre si.");

        }
        else {
            System.out.println("Os números digitados não são multiplos entre si.");
        }
        sc.close();
    }
}
