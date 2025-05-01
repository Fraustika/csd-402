package javaapplication11;

// Abstract class Division
public abstract class Division {
    protected String divisionName; // Represents the name of the division
    protected int accountNumber; // Represents the account number

    // Constructor for the Division class
    public Division(String divisionName, int accountNumber) {
        this.divisionName = divisionName; // Initializes the division name
        this.accountNumber = accountNumber; // Initializes the account number
    }

    // Abstract method to display division information
    public abstract void display();

    // Getter method for divisionName
    public String getDivisionName() {
        return divisionName; // Returns the division name
    }

    // Getter method for accountNumber
    public int getAccountNumber() {
        return accountNumber; // Returns the account number
    }
}