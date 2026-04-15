package Main;

import service.BankService;
import model.*;
import util.InputUtil;

public class BankApp {

    public static void main(String[] args) {

        BankService service = new BankService();
        int choice;

        do {
            System.out.println("\n--- BANK MENU ---");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Display All");
            System.out.println("5. Exit");

            choice = InputUtil.getInt("Enter choice: ");

            switch (choice) {
                case 1:
                    Integer accNo = InputUtil.getInt("Acc No: ");
                    String name = InputUtil.getString("Name: ");
                    Double bal = InputUtil.getDouble("Balance: ");

                    System.out.println("1. Savings  2. Current");
                    int type = InputUtil.getInt("Choose type: ");

                    if (type == 1)
                        service.createAccount(new SavingsAccount(accNo, name, bal));
                    else
                        service.createAccount(new CurrentAccount(accNo, name, bal));
                    break;

                case 2:
                    service.deposit(
                        InputUtil.getInt("Acc No: "),
                        InputUtil.getDouble("Amount: ")
                    );
                    break;

                case 3:
                    service.withdraw(
                        InputUtil.getInt("Acc No: "),
                        InputUtil.getDouble("Amount: ")
                    );
                    break;

                case 4:
                    service.displayAll();
                    break;

                case 5:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);
    }
}
