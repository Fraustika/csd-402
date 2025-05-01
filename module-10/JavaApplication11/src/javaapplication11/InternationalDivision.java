package javaapplication11;

// InternationalDivision class, which inherits from the Division class
public class InternationalDivision extends Division {
    private String country; // Represents the country where the division is located
    private String language; // Represents the language spoken in the division

    // Constructor for the InternationalDivision class
    public InternationalDivision(String divisionName, int accountNumber, String country, String language) {
        super(divisionName, accountNumber); // Calls the constructor of the parent class (Division)
        this.country = country; // Initializes the country for the international division
        this.language = language; // Initializes the language for the international division
    }

    // Overrides the display method from the parent class
    @Override
    public void display() {
        System.out.println("Division Name: " + divisionName); // Prints the division name
        System.out.println("Account Number: " + accountNumber); // Prints the account number
        System.out.println("Country: " + country); // Prints the country
        System.out.println("Language: " + language); // Prints the language
    }
}