package Bank;

public class Account {

    public static final double TAX = 5.00;
    private final int number;
    private String holder;
    private double balance;

    public Account(int number, String holder) { ///////// CONSTRUCTOR
        this.number = number;
        this.holder = holder;
    }

    public Account(int number, String holder, double initialDeposit) { /////////  OPTIONAL INITIAL DEPOSIT CONSTRUCTOR
        this.number = number;
        this.holder = holder;
        deposit(initialDeposit);
    }

    public String getHolder() {
        return holder;
    }
    public void setHolder(String holder) {
        this.holder = holder;
    }

    public int getNumber() {
        return number;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit (double amount) { ///////////////// DEPOSIT
        balance+=amount;
    }

    public void withdraw (double amount) { ///////////////// WITHDRAW
        balance -= amount + TAX;
    }

    public String toString() {
        return "Account "
                + number +
                ", Holder: "
                + holder +
                ", Balance: $ "
                + String.format("%.2f", balance);
    }
}
