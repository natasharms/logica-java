/*
Fazer um programa para ler os dados (nome, email e salário) de funcionários a partir de um arquivo em formato .csv.
Em seguida mostrar, em ordem alfabética, o email dos funcionários cujo salário seja superior a um dado valor
fornecido pelo usuário. Mostrar também a soma dos salários dos funcionários cujo nome começa com a letra 'M'.
 */

package application;

import entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file path: ");
        String path = sc.nextLine();

        try(BufferedReader br = new BufferedReader(new FileReader(path))){

            List<Employee> employee = new ArrayList<>();

            String line = br.readLine();
            while (line != null){

                String[] fields = line.split(",");
                employee.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
                line = br.readLine();
            }

            System.out.print("Enter salary: ");
            double salary = sc.nextDouble();

            List<String> emails = employee.stream()
                    .filter(p -> p.getSalary() > salary) // funcionarios com o salario superior ao salary
                    .map(p -> p.getEmail()).sorted() // ordem alfabetica
                    .collect(Collectors.toList());

            System.out.printf("Email of people whose salary is more than %.2f:\n", salary);
            emails.forEach(System.out::println);



            double sum = employee.stream()
                    .filter(p -> p.getName().charAt(0) == 'M')
                    .map(p -> p.getSalary()).reduce(0.0, (x, y) -> x + y);

            System.out.printf("Sum of salary from people whose name starts with 'M': %.2f", sum);

        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
