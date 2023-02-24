package service;

import entities.Contract;
import entities.Installment;

import java.util.Calendar;
import java.util.Date;

public class ContractService {

    private OnlinePaymentService paymentService;

    public ContractService(OnlinePaymentService paymentService) {
        this.paymentService = paymentService;
    }

    private Date addMonths(Date date, int n) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.MONTH, n);
        return cal.getTime();
    }

    public void process(Contract contract, int months) {
        double simpleValue = contract.getTotal() / months;

        for (int i = 0; i < months; i++) {

            double updatedValue = simpleValue + paymentService.interest(simpleValue, i+1);
            double totalValue = updatedValue + paymentService.paymentFee(updatedValue);

            Date date = addMonths(contract.getDate(), i+1);
            contract.addInstallment(new Installment(date, totalValue));
        }
    }
}
