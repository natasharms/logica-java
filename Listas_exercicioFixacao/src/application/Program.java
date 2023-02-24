package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.Salary;

public class Program {

    ////////////////////////////////////////////////////////////// METHOD TO AVOID REPETITION OF AN ID
    public static boolean hasId(List<Salary> list, int id) {
        Salary emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Salary> list = new ArrayList<>();

        ////////////////////////////////////////////////////////////// READING DATA:

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();

        for (int i=0; i<n; i++) {
            System.out.println("\nEmployee #" + (i+1) + ": ");

            System.out.print("Id: ");
            int id = sc.nextInt();

            while (hasId(list, id)) {
                System.out.print("Id already taken. Try again: ");
                id = sc.nextInt();
            }

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            list.add(new Salary(id, name, salary));
        }

        ////////////////////////////////////////////////////////////// UPDATING SALARY OF GIVEN EMPLOYEE:

        System.out.print("\nEnter the employee id that will have salary increase: ");
        int id = sc.nextInt();
        Salary emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if (emp == null) {
            System.out.println("This id does not exist!");
        }
        else {
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();
            emp.increaseSalary(percentage);
        }

        ////////////////////////////////////////////////////////////// LISTING EMPLOYEES:

        System.out.println("\nList of employees:");
        for (Salary obj : list) {
            System.out.println(obj);
        }

        sc.close();
    }
}