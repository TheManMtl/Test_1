/*
 * Ehsan KH. Motlagh
 * student ID: 2340457
 * */
package Bank;

import java.util.Scanner;

public class BankAccountDemo {
    public static void main(String[] args) {

        BankAccount ba = new BankAccount(5000);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter annual interest rate: ");
        ba.setAnnualInterest(sc.nextFloat());
        System.out.print("Enter Starting balance: ");
        ba.setStartingBalance(sc.nextFloat());
        System.out.print("How many months that have passed since the account was established: ");
        ba.setAccountAge(sc.nextInt());

        for (int i = 0; i < ba.getAccountAge(); i++) {

            System.out.print("Enter this month deposit amount: ");
            ba.setDeposit(sc.nextFloat());
            ba.addDepositAmount();

            System.out.print("Enter this month withdrawal amount: ");
            ba.setWithdrawal(sc.nextFloat());

            ba.subWithdrawalAmount();
            ba.addMonthlyInterest();
        }

        System.out.println("Account info:");

        System.out.printf("Balance: %.2f\n", ba.getBalance());
        System.out.println("Total Deposit: " + ba.getTotalDeposit());
        System.out.println("Total Withdrawal: " + ba.getTotalWithdrawal());
        System.out.printf("Total Interest: %.2f", ba.getTotalInterestAmount());

        sc.close();
    }
}
