package cev.vetores;

import java.util.Arrays;

public class Vetor04 {
    public static void main(String[] args) {
        int vet[] = {3, 7, 6, 1, 9, 4, 2};
        for (int valor:
             vet) {
            System.out.println(valor);
        }
        System.out.println();
        int posicao = Arrays.binarySearch(vet, 1);

        System.out.println("Encontrei o valor na posição " +
                posicao);
    }
}
