public abstract class Employee implements Payable{
    // TODO fix class declaration and declare variables here
        String employeeId;
        String name;
        protected double averageMonthlySalary;

        public Employee(String employeeId, String name) {
            this.employeeId = employeeId;
            this.name = name;

    }

    public String getEmployeeId() {
        return this.employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double getAverageMonthlySalary() {
        return averageMonthlySalary;
    }

    @Override
    public String toString() {
        return String.format("Employee ID: %s, Name: %s, Average Monthly Salary: %.2f", employeeId, name, averageMonthlySalary);
    }

}