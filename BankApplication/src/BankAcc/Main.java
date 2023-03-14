package BankAcc;

import java.util.*;
class BankAccount {
    private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account = new BankAccount(0);

        while (true) {
            System.out.println("1. Check balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("Balance: " + account.getBalance());
            } else if (choice == 2) {
                System.out.println("Enter amount to deposit: ");
                int amount = scanner.nextInt();
                account.deposit(amount);
                System.out.println("Amount deposited: " + amount);
            } else if (choice == 3) {
                System.out.println("Enter amount to withdraw: ");
                int amount = scanner.nextInt();
                account.withdraw(amount);
                System.out.println("Amount withdrawn: " + amount);
            } else if (choice == 4) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid choice.");
                }
            }
        }
    }
