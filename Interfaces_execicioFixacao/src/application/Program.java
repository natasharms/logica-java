package application;

import entities.Contract;
import entities.Installment;
import service.ContractService;
import service.PaypalService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter the contract data");
        System.out.print("Number: ");
        int number = sc.nextInt();
        System.out.print("Date: ");
        Date date = sdf.parse(sc.next());
        System.out.print("Contract value: ");
        double contractValue = sc.nextDouble();
        System.out.print("Number of installments: ");
        int inst = sc.nextInt();

        Contract contract = new Contract(number, date, contractValue);
        ContractService contractService = new ContractService(new PaypalService());

        contractService.process(contract, inst);

        System.out.println("Installments");
        for(Installment p : contract.getInstallments()){
            System.out.println(p);
        }

        sc.close();

    }
}
