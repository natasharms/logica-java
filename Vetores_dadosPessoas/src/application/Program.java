package application;

import entities.Height;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas serao digitadas?");
        int n = sc.nextInt();
        Height[] vect = new Height[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.println("Altura da " + (i+1) + "a pessoa");
            double altura = sc.nextDouble();
            sc.nextLine();
            System.out.println("Genero da " + (i+1) + "a pessoa");
            String genero = sc.nextLine();
            vect[i] = new Height(altura, genero);
        }

        double maxHeight = vect[0].getH(), minHeight = vect[0].getH(), mediaWomen = 0, sumHeight = 0;
        int sumMen = 0, sumWomen = 0;

        for (Height height : vect) {
            if (height.getH() > maxHeight) {
                maxHeight = height.getH();
            }
            else if (height.getH() < minHeight) {
                minHeight = height.getH();
            }
        }

        for (Height height : vect){

            if (height.getGender().equalsIgnoreCase("f")){
                sumWomen++;
                sumHeight += height.getH();
            }
            else {
                sumMen++;
            }
        }

        mediaWomen = sumHeight / sumWomen;

        System.out.printf("\nMenor altura: %.2f", minHeight);
        System.out.printf("\nMaior altura: %.2f", maxHeight);
        System.out.printf("\nMedia das alturas das mulheres = %.2f\n", mediaWomen);
        System.out.println("Numero de homens: " + sumMen);

        sc.close();
    }
}
