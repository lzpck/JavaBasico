package cev.vetores;

public class Vetor02 {
    public static void main(String[] args) {
        String mes[] = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
        int dias[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for (int c=0; c<mes.length; c++){
            System.out.println("O mês de " +
                    mes[c] + " tem " +
                    dias[c] + " dias ao todo!");
        }
    }
}
