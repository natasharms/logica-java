/*
Em um portal de cursos online, cada usuário possui um código único, representado por
um número inteiro.
Cada instrutor do portal pode ter vários cursos, sendo que um mesmo aluno pode se
matricular em quantos cursos quiser. Assim, o número total de alunos de um instrutor não
é simplesmente a soma dos alunos de todos os cursos que ele possui, pois pode haver
alunos repetidos em mais de um curso.
O instrutor Alex possui três cursos A, B e C, e deseja saber seu número total de alunos.
Seu programa deve ler os alunos dos cursos A, B e C do instrutor Alex, depois mostrar a
quantidade total e alunos dele.
 */

package application;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Set<Integer> courseA = new TreeSet<>();
        Set<Integer> courseB = new TreeSet<>();
        Set<Integer> courseC = new TreeSet<>();

        System.out.print("How many students for course A? ");
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            System.out.print("Student #"  + (i+1) + ": ");
            courseA.add(sc.nextInt());
        }

        System.out.print("How many students for course B? ");
        n = sc.nextInt();
        for(int i=0; i<n; i++){
            System.out.print("Student #"  + (i+1) + ": ");
            courseB.add(sc.nextInt());
        }

        System.out.print("How many students for course C? ");
        n = sc.nextInt();
        for(int i=0; i<n; i++){
            System.out.print("Student #"  + (i+1) + ": ");
            courseC.add(sc.nextInt());
        }

        Set<Integer> total = new TreeSet<>();
        total.addAll(courseA);
        total.addAll(courseB);
        total.addAll(courseC);

        System.out.println("Total: " + total.size());

        sc.close();
    }
}
