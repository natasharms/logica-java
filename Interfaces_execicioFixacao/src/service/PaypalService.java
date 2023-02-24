package service;

public class PaypalService implements OnlinePaymentService {

    private static final double FEE = 0.02; // taxa de pagamento
    private static final double INTEREST = 0.01; // juro de parcelamento

    @Override
    public double paymentFee(double amount) {
        return amount * FEE;
    }

    @Override
    public double interest(double amount, int months) {
        return amount * INTEREST * months;
    }
}
