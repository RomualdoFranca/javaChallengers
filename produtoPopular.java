package challengers;

import java.util.Scanner;

public class produtoPopular {
    public static void main(String[] args) {
        // Um estabelecimento que descobrir qual a forma de pagamento mais utilizada pelos seus clientes.
        //  São aceitas 3 formas de pagamentos: Cartão, dinheiro e PIX. Implementar um programa que identifique
        //  qual a forma de pagamento mais utilizada.
        Scanner sc = new Scanner(System.in);

        //  Input
        System.out.println("Escolha a forma de pagamento:");
        System.out.println("Cartão digite 1\nDinheiro digite 2\nPIX digite 3\nFinalizar digite 4.");
        int opcao = sc.nextInt();
        int cartao = 0;
        int pix = 0;
        int dinheiro = 0;
        while (opcao != 4){

            if (opcao == 1){
                cartao += 1;
                System.out.println("Cartão digite 1\nDinheiro digite 2\nPIX digite 3\nFinalizar digite 4.\n");
                opcao = sc.nextInt();
                System.out.printf("Realizada:\n%d cartão\n%d dinheiro\n%d PIX\n", cartao, dinheiro, pix);
            }
        }
        sc.close();
    }
}
