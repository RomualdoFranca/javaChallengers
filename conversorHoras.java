package challengers;

import java.util.Scanner;

public class conversorHoras {
    //  Criar um programa que converta horas em minutos
    //  Falta Implementar conversao em dias horas e minutos
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int hora, minuto,minutosExcedentes, horasExcedentes, horasInteiras, diasInteiros, convertMinuto, convertDia, opcoes;
        System.out.println("Digite as horas:");
        hora = sc.nextInt();
        System.out.println("Digite os minutos:");
        minuto = sc.nextInt();
        System.out.println("Converter em h min tecle 1\nConverter em minutos tecle 2\nConverter em d h min tecle 3");
        opcoes = sc.nextInt();
        //  Converte tudo em minutos
        convertMinuto = (hora * 60) + minuto;
        //  Ignora as horas inteiras e mostra apenas os minutos. Mostra os minutos que não completam 1h
        //  Esse módulo mostra os minutos que excedem as horas inteiras
        minutosExcedentes = convertMinuto % 60;
        //  Converte em horas inteiras
        horasInteiras = (convertMinuto -  minutosExcedentes) / 60;
        convertDia = horasInteiras / 24;

        if (opcoes == 1) {
            System.out.printf("%dh e %dmin", horasInteiras, minutosExcedentes);

        }
        else if (opcoes == 2) {
            System.out.printf("%dh e %dmin = %dmin\n",hora, minuto, convertMinuto);

        }
        else if (horasInteiras >= 24 ){
            if (horasInteiras % 24 == 0) {
                System.out.printf("%d horas correspondem a %d dias.\n", horasInteiras, convertDia);
            }
            else {
                //  Esse modulo mostra as horas que excedem os dias inteiros. As horas que passam de um dia e não completam 24
                horasExcedentes = horasInteiras % 24;
                //  Dias inteiros sem as horas excedentes que não completam 24 horas
                diasInteiros = (horasInteiras - horasExcedentes) / 24;
                System.out.printf("%d horas correspondem a %d dias e %d horas\n", horasInteiras, diasInteiros, horasExcedentes);
            }
        }





        sc.close();
    }
}
