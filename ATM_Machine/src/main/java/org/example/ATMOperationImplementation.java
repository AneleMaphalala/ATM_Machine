package org.example;

import java.util.HashMap;
import java.util.Map;

public class ATMOperationImplementation implements ATMOperationalInterface {
    ATM atm = new ATM();
    Map<Double, String> mini_statement = new HashMap<>();

    @Override
    public void viewBalance() {
        System.out.println("Available Balance is: R" + atm.getBalance());
    }

    @Override
    public void withdrawAmount(double withdrawAmount) {
        if (withdrawAmount % 500 == 0 && withdrawAmount <= atm.getBalance()) {
            mini_statement.put(withdrawAmount, " Amount Withdrawn");
            System.out.println("Collect the Cash R" + withdrawAmount);
            atm.setBalance(atm.getBalance() - withdrawAmount);
            viewBalance();
            //}
            //if (withdrawAmount <= atm.getBalance()) {
            // mini_statement.put(withdrawAmount, " Amount Withdrawn");
            // System.out.println("Collect the Cash R" + withdrawAmount);
            //atm.setBalance(atm.getBalance() - withdrawAmount);
            // viewBalance();
        } else if (withdrawAmount >= atm.getBalance()) {
            System.out.println("Insufficient funds");
        } else {
            //System.out.println("Insufficient Balance!!!");
            System.out.println("Please enter an amount in multiple of 500");
        }
    }

    @Override
    public void depositAmount(double depositAmount) {
        mini_statement.put(depositAmount, " Amount Deposited");
        System.out.println("R" + depositAmount + " Deposited Successfully!");
        atm.setBalance(atm.getBalance() + depositAmount);
        viewBalance();
    }

    @Override
    public void viewMiniStatement() {
        for (Map.Entry<Double, String> m : mini_statement.entrySet()) {
            System.out.println("R" + m.getKey() + " " + m.getValue());
        }
        System.out.println("Available Balance is: R" + atm.getBalance());
    }

    @Override
    public void transferAmount(String name, int accountNumber, double transferAmount) {
        if (transferAmount % 500 == 0 && transferAmount <= atm.getBalance()) {
            mini_statement.put(transferAmount, " Amount Transferred");
            atm.setBalance(atm.getBalance() - transferAmount);
            viewBalance();
            //}
            //if (withdrawAmount <= atm.getBalance()) {
            // mini_statement.put(withdrawAmount, " Amount Withdrawn");
            // System.out.println("Collect the Cash R" + withdrawAmount);
            //atm.setBalance(atm.getBalance() - withdrawAmount);
            // viewBalance();
        } else if (transferAmount >= atm.getBalance()) {
            System.out.println("Insufficient funds");
        } else {
            //System.out.println("Insufficient Balance!!!");
            System.out.println("Please enter an amount in multiple of 500");
        }
    }
}
