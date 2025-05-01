package javaapplication11;

// DomesticDivision class, which inherits from the Division class
public class DomesticDivision extends Division {
    private String state; // Represents the state where the division is located

    // Constructor for the DomesticDivision class
    public DomesticDivision(String divisionName, int accountNumber, String state) {
        super(divisionName, accountNumber); // Calls the constructor of the parent class (Division)
        this.state = state; // Initializes the state for the domestic division
    }

    // Overrides the display method from the parent class
    @Override
    public void display() {
        System.out.println("Division Name: " + divisionName); // Prints the division name
        System.out.println("Account Number: " + accountNumber); // Prints the account number
        System.out.println("State: " + state); // Prints the state
    }
}