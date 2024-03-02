package com.driver;

public class Main {
    public static void main(String[] args) {
        try {
            // Example usage of BankAccount
            BankAccount bankAccount = new BankAccount("John Doe", 1000, 500);
            System.out.println("Generated Account Number: " + bankAccount.generateAccountNumber(6, 21));
            bankAccount.deposit(500);
            System.out.println("Balance after deposit: " + bankAccount.getBalance());
            bankAccount.withdraw(300);
            System.out.println("Balance after withdrawal: " + bankAccount.getBalance());

            // Example usage of CurrentAccount
            CurrentAccount currentAccount = new CurrentAccount("Alice", 7000, "ABCDEF");
            System.out.println("Trade License ID: " + currentAccount.getTradeLicenseId());
            currentAccount.validateLicenseId();

            // Example usage of SavingsAccount
            SavingsAccount savingsAccount = new SavingsAccount("Bob", 2000, 1000, 0.05);
            savingsAccount.withdraw(500);
            System.out.println("Balance after withdrawal: " + savingsAccount.getBalance());
            System.out.println("Simple Interest after 3 years: " + savingsAccount.getSimpleInterest(3));
            System.out.println("Compound Interest after 2 years (compounded quarterly): " + savingsAccount.getCompoundInterest(4, 2));

            // Example usage of StudentAccount
            StudentAccount studentAccount = new StudentAccount("Eve", 500, "University XYZ");
            System.out.println("Institution Name: " + studentAccount.getInstitutionName());
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
