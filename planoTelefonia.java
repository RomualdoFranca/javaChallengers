package challengers;

import java.util.Scanner;

public class planoTelefonia {
    public static void main(String[] args){
        /*  Um plano de telefonia cobra R$ 50.00 por um plano básico que dá direito a 100 minutos de telefone
        *   Cada minuto que exceder a franquia de 100 minutos custa R$ 2.00. Fazer um programa para ler
        *   a quantidade de minutos que uma pessoa consumiu, daí mostrar o valor a ser pago*/

        Scanner sc = new Scanner(System.in);
        int minutos;
        double acrescimo;
        System.out.println("Informe o consumo de minutos do período:");
        minutos = sc.nextInt();
        if (minutos > 100){
            acrescimo = 50 + (minutos - 100) * 2;
            System.out.printf("O valor de sua fatura é %.2f\n", acrescimo);
        }
        else {
            System.out.println("O valor da sua fatura é R$ 50,00");

        }
        sc.close();
    }
}
