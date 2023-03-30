/*
 * Ehsan KH. Motlagh
 * student ID: 2340457
 * */
package Employee;

import java.sql.SQLOutput;
import java.time.LocalDate;

public class EmployeeWorkerDemo {
    public static void main(String[] args) {
        /*
        * initializing a worker
        * using constructor subclass
        * */
        LocalDate hireDate = LocalDate.of(2022, 8, 7);
        ProductionWorker workerA = new ProductionWorker(2);
        workerA.setEmpName("Ehsan");
        workerA.setPayRate(25.5);
        workerA.setHireDate(hireDate);
        workerA.setEmpNumber("859");
        if (workerA.getShift() != -1) {
            String shift = workerA.getShift() == 1 ? "Day" : "Night";
            System.out.println("Worker A demonstration");
            System.out.println("Name: " + workerA.getEmpName());
            System.out.println("Hourly Pay Rate: " + workerA.getPayRate());
            System.out.println("Shift: " + shift);
            System.out.println("Employee Number: " + workerA.getEmpNumber());
        } else{
            System.out.println("Employee name: "+workerA.getEmpName());
            System.out.println("There is no such shift!");
        }


        System.out.println("-------------------------------");

        /*
         * initializing a worker
         * using constructor subclass and superclass
         * */
        hireDate=LocalDate.of(2023,1,15);
        ProductionWorker workerB = new ProductionWorker("Robert junior",3);
        workerB.setPayRate(32.0);
        workerB.setHireDate(hireDate);
        workerB.setEmpNumber("900");
        if (workerB.getShift() != -1) {
            String shift = workerB.getShift() == 1 ? "Day" : "Night";
            System.out.println("Worker B demonstration");
            System.out.println("Name: " + workerB.getEmpName());
            System.out.println("Hourly Pay Rate: " + workerB.getPayRate());
            System.out.println("Shift: " + shift);
            System.out.println("Employee Number: " + workerB.getEmpNumber());

        } else {
            System.out.println("Employee name: " + workerB.getEmpName());
            System.out.println("There is no such shift!");
        }
    }
}


