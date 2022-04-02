package challengers;

import java.util.Scanner;

public class confirmacaoSenha {

    public static void main(String[] args){
        //  Criar um programa de confrimação de senha com bloqueio devido ao excesso de tentativas
        Scanner sc = new Scanner(System.in);
        int senha;
        int soma;
        System.out.println("Insira uma senha com 4 algarismos:");
        senha = sc.nextInt();
        System.out.println("Confirme a sua senha:");
        int validacao = sc.nextInt();
        soma = 0;

        while (validacao != senha) {
            soma += 1;
            if (soma < 3) {
                System.out.println("Senha incorreta");
                System.out.println("Repita a sua senha:");
                validacao = sc.nextInt();
            }
            else {

//                System.out.println("Acesso bloqueado.Excesso de tentativas");
            }
        }
        System.out.println("Login efetuado");
        sc.close();
    }
}
