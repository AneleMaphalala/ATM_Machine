package org.example;

public class ATMOperationImplementation implements ATMOperationalInterface{
    ATM atm = new ATM();
    @Override
    public void viewBalance() {
        System.out.println("Available Balance is: R" + atm.getBalance());
    }

    @Override
    public void withdrawAmount(double withdrawAmount) {

    }

    @Override
    public void depositAmount(double depositAmount) {
        System.out.println(depositAmount+ " Deposited Successfully!");
        atm.setBalance(atm.getBalance() + depositAmount);
        viewBalance();
    }

    @Override
    public void viewMiniStatement() {

    }
}
