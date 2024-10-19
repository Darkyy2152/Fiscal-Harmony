import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Fiscal Harmony!");
        System.out.println("Please select an option:");
        System.out.println("1. Read Instructions for Income and Expenses Allocation, Emergency Fund Calculator, Tax Calculator, and Privacy Act");
        System.out.println("2. Exit");

        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice == 1) {
            showCombinedInstructions();
            askIfDone(scanner);
        } else if (choice == 2) {
            System.out.println("Exiting the program. Thank you!");
        } else {
            System.out.println("Invalid choice. Please select a valid option.");
        }

        scanner.close();
    }

    private static void showCombinedInstructions() {
        System.out.println("\nInstructions for Income and Expenses Allocation, Emergency Fund Calculator, Tax Calculator, and Privacy Act");

        System.out.println("   INCOME AND EXPENSES ALLOCATION");
        System.out.println("   - Access the Feature: Navigate to the 'Income and Expenses Allocation' section.");
        System.out.println("   - Input Income: Enter your total income for the month.");
        System.out.println("   - Enter Expenses: List all your monthly expenses.");
        System.out.println("   - Review Allocation: Click 'Calculate' to see how your income is allocated.");

        System.out.println("   EMERGENCY FUND CALCULATOR");
        System.out.println("   - Access the Feature: Select 'Emergency Fund Calculator' from the menu.");
        System.out.println("   - Set Savings Goal: Enter your desired savings goal.");
        System.out.println("   - Determine Monthly Contribution: Specify how much you can contribute monthly.");
        System.out.println("   - Calculate Timeframe: Press 'Calculate' to see how long it will take to reach your goal.");

        System.out.println("   TAX CALCULATOR");
        System.out.println("   - Access the Feature: Go to the 'Tax Calculator' section.");
        System.out.println("   - Input Income: Enter your total taxable income.");
        System.out.println("   - Enter Deductions: List any deductions you qualify for.");
        System.out.println("   - Calculate Tax: Click 'Calculate' to see the estimated tax you need to pay.\n");

        System.out.println("   PRIVACY ACT");
        System.out.println("   The Republic Act 10173, officially known as the Data Privacy Act of 2012 (DPA).");
        System.out.println("   We request your consent to use this program for managing your finances. " +
                "Your permission allows us to assist you with budgeting and tracking expenses.\n");
    }

    private static void askIfDone(Scanner scanner) {
        System.out.println("Are you done reading the instructions? (Yes or No)");
        String response = scanner.nextLine().toLowerCase();

        if (response.equals("yes")) {
            askPrivacyActQuestion(scanner);
        } else if (response.equals("no")) {
            System.out.println("Feel free to review the instructions again.");
        } else {
            System.out.println("Invalid response. Please answer 'Yes' or 'No'.");
        }
    }

    private static void askPrivacyActQuestion(Scanner scanner) {
        System.out.println("Do you understand how your data will be used and the privacy policies in place? (Yes or No)");
        String response = scanner.nextLine().toLowerCase();

        if (response.equals("yes")) {
            System.out.println("Thank you for your understanding!");
        } else if (response.equals("no")) {
            System.out.println("Please review our privacy policy for more information.");
        } else {
            System.out.println("Invalid response. Please answer 'Yes' or 'No'.");
        }
    }
}
