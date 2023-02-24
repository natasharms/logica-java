package application;

import entities.Aluno;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.println("Nome: ");
        aluno.name = sc.nextLine();
        System.out.println("Nota 1: ");
        aluno.nota1 = sc.nextDouble();
        System.out.println("Nota 2: ");
        aluno.nota2 = sc.nextDouble();
        System.out.println("Nota 3: ");
        aluno.nota3 = sc.nextDouble();

        System.out.printf("NOta Final: %.2f%n", aluno.notaFinal());

        if (aluno.notaFinal()>=60) {
            System.out.println("Passou");
        }else {
            System.out.println("Reprovou");
            System.out.printf("Quantos pontos faltaram: %.2f%n", aluno.missingPoints());
        }

        sc.close();
    }


}
