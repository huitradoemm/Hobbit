import org.junit.jupiter.api.Test;
import payroll.Employee;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SalaryHandlerTest {
    @Test
    void checkTest(){
        assertEquals(1,1);
    }

    void calculateSalaryTest()
    {
        Employee gimly = new Employee("Gimly","Warrior");
        assertEquals(gimly.setSalary(),220.00);
    }
}