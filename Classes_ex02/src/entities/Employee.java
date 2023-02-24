package entities;

public class Employee {

    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary(){ // Salário líquido
        return grossSalary-tax;
    }
    public void increaseSalary(double percentage){ // Aumento no salário
        grossSalary += grossSalary * percentage/100;

    }

    public String toString(){
        return name + ", $ "
                + String.format("%.2f", netSalary());
    }
}
