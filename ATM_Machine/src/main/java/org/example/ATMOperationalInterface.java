package org.example;

public interface ATMOperationalInterface {
    public void viewBalance();
    public void withdrawAmount(double withdrawAmount);
    public void depositAmount(double depositAmount);
    public void viewMiniStatement();
    public void transferAmount(String name,int accountNumber, double transferAmount);
}
