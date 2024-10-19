public class ContractedEmployee extends Employee {
    @Description("Federal Tax ID for contracted employees")
    private String federalTaxId;
    private double hourlyRate;
    private double numberOfHoursWorked;

    public ContractedEmployee(String employeeId, String name, String federalTaxId) {
        super(employeeId, name);
        this.federalTaxId = federalTaxId;
    }

    public String getFederalTaxId() {
        return this.federalTaxId;
    }

    public void setFederalTaxId(String federalTaxId) {
        this.federalTaxId = federalTaxId;
    }

    public double getHourlyRate() {
        return this.hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getNumberOfHoursWorked() {
        return this.numberOfHoursWorked;
    }

    public void setNumberOfHoursWorked(double numberOfHoursWorked) {
        this.numberOfHoursWorked = numberOfHoursWorked;
    }

    @Override
    public double getAverageMonthlySalary() {
        return hourlyRate * numberOfHoursWorked;
    }

    @Override
    public String toString() {
        return String.format("Employee ID: %s, Name: %s, Average Monthly Salary: %.2f",
                getEmployeeId(), getName(), averageMonthlySalary);
    }

    @Override
    public void calculatePay() {
        averageMonthlySalary = hourlyRate * numberOfHoursWorked;
    }
}

@interface Description {
    String value();
}