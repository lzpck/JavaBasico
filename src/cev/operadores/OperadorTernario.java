package cev.operadores;

import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o primeiro valor a comparar: ");
        int n1 = teclado.nextInt();
        System.out.print("Digite o segundo valor a comparar: ");
        int n2 = teclado.nextInt();

        int res = (n1>n2) ? n1:n2;
        System.out.println("O maior número é: " +
                res);
    }
}
