package payroll;

public abstract class SalaryHandler {
    public abstract double calculateSalary();

    public void addSalary(Employee employee, double salary){
        employee.setSalary(salary);
    }
}
