package application;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<TaxPayer> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){

            System.out.println("Tax payer #" + (i+1) + " data:");
            System.out.print("Individual or company (i/c)? ");
            char type = sc.next().charAt(0);

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Anual income: ");
            double income = sc.nextDouble();

            if (type == 'i'){

                System.out.print("Health expenditures: ");
                double exp = sc.nextDouble();
                list.add(new Individual(name, income, exp));

            } else {

                System.out.print("Number of employees: ");
                int emp = sc.nextInt();
                list.add(new Company(name, income, emp));
            }
        }

        double sum = 0.0;
        System.out.println();
        System.out.println("TAXES PAID:");
        for (TaxPayer payer : list){

            double totalTax = payer.tax();
            System.out.printf("%s: $%.2f\n", payer.getName(), payer.tax());
            sum += totalTax;
        }

        System.out.printf("\nTOTAL TAXES: $%.2f", sum);

         sc.close();
    }
}
