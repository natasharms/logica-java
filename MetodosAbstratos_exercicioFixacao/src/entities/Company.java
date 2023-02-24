package entities;

public class Company extends TaxPayer {

    private Integer numberofEmployees;

    public Company() {
        super();
    }

    public Company(String name, Double anualIncome, Integer numberofEmployees) {
        super(name, anualIncome);
        this.numberofEmployees = numberofEmployees;
    }

    public Integer getNumberofEmployees() {
        return numberofEmployees;
    }

    public void setNumberofEmployees(Integer numberofEmployees) {
        this.numberofEmployees = numberofEmployees;
    }

    @Override
    public double tax() {
        double totalTax;

        if (numberofEmployees > 10){

            totalTax = getAnualIncome() * 0.14;

        } else {

            totalTax = getAnualIncome() * 0.16;

        }
        return totalTax;
    }
}
