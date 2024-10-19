public class SalariedEmployee extends Employee {
    // TODO fix class declaration and declare variables here
    private String socialSecurityNumber;
    private double fixedMonthlyPayment;

    public SalariedEmployee(String employeeId, String name, String socialSecurityNumber) {
        super(employeeId, name);
        this.socialSecurityNumber = socialSecurityNumber;

    }

    public String getSocialSecurityNumber() {
        return this.socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public double getFixedMonthlyPayment() {
        return this.fixedMonthlyPayment;
    }

    public void setFixedMonthlyPayment(double fixedMonthlyPayment) {
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    @Override
    public String toString() {
        return String.format("Employee ID: %s, Name: %s, Social Security Number: %s, Fixed Monthly Payment: %.2f",
                getEmployeeId(), getName(), socialSecurityNumber, getAverageMonthlySalary());
    }

    @Override
    public void calculatePay() {
        averageMonthlySalary = fixedMonthlyPayment;
    }
}