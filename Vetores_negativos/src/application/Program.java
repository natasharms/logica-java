package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] vect = new int[10];
        System.out.println("Quantos numeros voce vai digitar?");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Digite um numero:");
            vect[i] = sc.nextInt();
        }

        System.out.println("NUMEROS NEGATIVOS:");

        for (int j : vect) {

            if (j < 0) {
                System.out.println(j);
            }
        }

        sc.close();
    }
}
