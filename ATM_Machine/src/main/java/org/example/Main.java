package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Object
        ATMOperationalInterface op = new ATMOperationImplementation();

        int ATMNumber = 12345;
        int ATMPin = 123;

        System.out.println("Welcome to the ATM Machine");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter ATM Number: ");
        int atmNumber = in.nextInt();
        System.out.println("Enter Pin: ");
        int atmPin = in.nextInt();

        if((ATMNumber == atmNumber) && (ATMPin == atmPin)){
            while(true) {
                System.out.println("1. View Available Balance\n2. Withdraw Amount\n3. Deposit Amount\n4. Transfer Amount\n5. Display MiniStatement\n6. Exit");
                System.out.println("Enter Option: ");
                int option = in.nextInt();
                if(option == 1){
                    op.viewBalance();
                }else if(option == 2) {
                    System.out.println("Enter Amount to Withdraw: ");
                    double withdrawAmount = in.nextDouble();
                    op.withdrawAmount(withdrawAmount);
                } else if(option == 3){
                    System.out.println("Enter Amount to Deposit: ");
                    double depositAmount = in.nextDouble();
                    op.depositAmount(depositAmount);
                } else if(option == 4){
                    System.out.println("Enter Beneficiary Account Number: ");
                    int accountNumber = in.nextInt();
                    System.out.println("Enter Beneficiary Name: ");
                    String name = in.next();
                    System.out.println("Enter Amount to Transfer: ");
                    double amountToTransfer = in.nextDouble();
                    System.out.println("R"+ amountToTransfer + " has been transferred to " + name + " in the account number: "+ accountNumber);
                    op.transferAmount(name, accountNumber, amountToTransfer);
                }else if(option == 5){
                    op.viewMiniStatement();
                }else if(option ==6){
                    System.out.println("Please remove your card\nThank you for using the ATM!\nSee you next time!");
                    System.exit(0);
                }
                else {
                    System.out.println("Please enter a valid option");
                }
            }
        }
        else{
            System.out.println(("Incorrect AT M Number or ATM Pin"));
            System.exit(0);
        }
    }
}