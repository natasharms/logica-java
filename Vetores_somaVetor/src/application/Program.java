package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar?");
        int n = sc.nextInt();

        double[] vect = new double[n];
        double soma = 0, media = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Digite um numero:");
            vect[i] = sc.nextDouble();
            soma+=vect[i];
        }

        media = soma/n;

        System.out.print("VALORES = ");
        for (double j : vect) {
                System.out.printf("%.1f ", j);
        }

        System.out.printf("\nSOMA = %.2f", soma);
        System.out.printf("\nMEDIA = %.2f", media);

        sc.close();
    }
}
