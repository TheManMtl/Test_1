/*
 * Ehsan KH. Motlagh
 * student ID: 2340457
 * */
package Employee;

import java.time.LocalDate;

public class Employee {

    private String empName;
    private String empNumber;
    private LocalDate hireDate;

    public Employee() {
    }

    public Employee(String empName) {
        this.empName = empName;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpNumber() {
        return empNumber;
    }

    public void setEmpNumber(String empNumber) {
        this.empNumber = empNumber;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }
}
