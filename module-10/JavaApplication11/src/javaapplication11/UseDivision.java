package javaapplication11;

// Class to demonstrate the use of Division subclasses
public class UseDivision {
    public static void main(String[] args) {
        // Create instances of InternationalDivision
        InternationalDivision intDiv1 = new InternationalDivision("IntDiv1", 101, "Canada", "English/French"); // Division in Canada
        InternationalDivision intDiv2 = new InternationalDivision("IntDiv2", 102, "Germany", "German");       // Division in Germany

        // Create instances of DomesticDivision
        DomesticDivision domDiv1 = new DomesticDivision("DomDiv1", 201, "California"); // Division in California
        DomesticDivision domDiv2 = new DomesticDivision("DomDiv2", 202, "Texas");      // Division in Texas

        // Display the information for each division
        intDiv1.display(); // Display info for International Division 1
        System.out.println("---"); // Separator
        intDiv2.display(); // Display info for International Division 2
        System.out.println("---"); // Separator
        domDiv1.display(); // Display info for Domestic Division 1
        System.out.println("---"); // Separator
        domDiv2.display(); // Display info for Domestic Division 2
    }
}