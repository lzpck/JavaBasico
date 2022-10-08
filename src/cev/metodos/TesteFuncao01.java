package cev.metodos;

public class TesteFuncao01 {
    static int soma(int a, int b){
        int soma = a + b;
        return soma;
    }

    public static void main(String[] args) {
        int sm = soma(5,2);
        System.out.println("A soma vale: " +
                sm);
    }
}
