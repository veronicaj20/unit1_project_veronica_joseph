import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // user inputs information
        System.out.print("Welcome! Enter your bill amount: ");
        String billNoTipConvert = s.nextLine();
        double totalBillNoTip = Double.parseDouble(billNoTipConvert); // variable for original bill

        System.out.print("Enter your tip percentage: " );
        String tipConvert = s.nextLine();
        double tipPercentage = Double.parseDouble(tipConvert); // variable for tip percentage

        System.out.print("Enter the total number of people in your party: ");
        String partyConvert = s.nextLine();
        int numPeople = Integer.parseInt(partyConvert); // variable for people in party
        System.out.println();

        // variables for calculations
        double totalTipAmt = totalBillNoTip * (tipPercentage / 100);
        double totalBillWithTip = totalBillNoTip + totalTipAmt;
        double tipPerPerson = totalTipAmt / numPeople;
        double totalPerPerson = (totalBillNoTip / numPeople) + tipPerPerson;

        System.out.print("Your total tip amount is: $");
        System.out.format("%.2f", totalTipAmt);
        System.out.println(); // printing total tip amount

        System.out.print("Your total bill with tip is: $");
        System.out.format("%.2f", totalBillWithTip);
        System.out.println(); // printing total bill w/ tip

        System.out.print("The amount each person should tip is: $");
        System.out.format("%.2f", tipPerPerson);
        System.out.println(); // printing tip per person

        System.out.print("The total per person is: $");
        System.out.format("%.2f", totalPerPerson);
        System.out.println(); // printing total per person




    }
}