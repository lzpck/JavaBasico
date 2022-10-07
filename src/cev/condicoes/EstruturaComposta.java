package cev.condicoes;

import java.time.LocalDate;
import java.util.Scanner;

public class EstruturaComposta {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe o seu ano de nascimento: ");
        int ano = teclado.nextInt();
        int idade = 2022 - ano;
        System.out.println("Você possui " +
                idade + " anos");
        if (idade < 16){
            System.out.println("Você ainda não tem idade para votar!");
        } else {
            if (idade >= 16 && idade < 18 || idade > 70) {
                System.out.println("É opcional");
            } else {
                System.out.println("Você precisa votar, exerça o seu direito!");
            }
        }
    }
}
