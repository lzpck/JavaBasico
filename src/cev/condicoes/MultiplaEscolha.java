package cev.condicoes;

import java.util.Scanner;

public class MultiplaEscolha {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira a quantidade de pernas: ");
        int pernas = teclado.nextInt();
        String tipo = null;


        switch (pernas){
            case 1:
                tipo = "saci";
                break;
            case 2:
                tipo = "bípede";
                break;
            case 3:
                tipo = "tripé";
                break;
            case 4:
                tipo = "quadrúpede";
                break;
            case 6:
                tipo = "aranha";
                break;
            default:
                tipo = "alien";
                break;
        }
        System.out.println("Isso é um " +
                tipo);
    }
}
