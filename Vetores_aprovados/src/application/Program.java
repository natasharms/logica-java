package application;

import grades.Grades;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos alunos serao digitados?");
        int n = sc.nextInt();
        Grades[] vect = new Grades[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.println("Digite nome, primeira e segunda nota do " + (i+1) + "o aluno:");
            sc.nextLine();
            String name = sc.nextLine();
            double grade1 = sc.nextDouble();
            double grade2 = sc.nextDouble();
            vect[i] = new Grades(name, grade1, grade2);
        }

        System.out.println("Alunos aprovados:");

        for (Grades grades : vect) {
            if (grades.media() >= 6.0) {
                System.out.println(grades);
            }
        }

        sc.close();

    }
}
