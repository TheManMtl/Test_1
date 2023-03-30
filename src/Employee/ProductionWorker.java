/*
 * Ehsan KH. Motlagh
 * student ID: 2340457
 * */
package Employee;

public class ProductionWorker extends Employee {

    private int shift;
    private double payRate;


    /*
     * shifts 1=Day, 2=Night
     * if none of above shift=-1
     * */
    public ProductionWorker(int shift) {
        if (shift == 1 || shift == 2)
            this.shift = shift;
        else this.shift = -1;
    }

    public ProductionWorker(String empName, int shift) {
        super(empName);
        if (shift == 1 || shift == 2)
            this.shift = shift;
        else this.shift = -1;
    }

    public int getShift() {
        return shift;
    }

    public void setShift(int shift) {
        this.shift = shift;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

}
