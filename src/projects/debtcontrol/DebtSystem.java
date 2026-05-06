package projects.debtcontrol;
/*
Daniel Figueredo
04/05/2026 - att 05/05/2026
Debt Control System

Console application developed in Java to manage personal debts.
The system allows the user to:

- Register debts
- List all registered debts
- Mark debts as paid
- Remove debts
- Show the total amount of debts

Project created to practice:
- Arrays
- Loops
- Methods
- Conditional structures
- User input with Scanner
- Basic CRUD logic
 */

import java.util.Scanner;


public class DebtSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DebtService debtService = new DebtService();
        int option;
        String[] names = new String[10];
        double[] values = new double[10];
        int[] days = new int[10];
        boolean [] states  = new boolean[10];
        int count = 0;
        int choice;

        while(true)
        {
            System.out.println("1 - Add debt\n" +
                    "2 - List debts\n" +
                    "3 - Mark as paid\n" +
                    "4 - Remove debt\n" +
                    "5 - Show total\n" +
                    "0 - Exit");

            System.out.print("Choose the option: ");
            option = scanner.nextInt();
            scanner.nextLine();

            if (option == 0) {
                System.out.println("Finished");
                break;
            }

            if (option == 1){
                System.out.println("--- Add Debt ---");
                System.out.print("What is the name of the debt? ");
                names[count] = scanner.nextLine();

                System.out.print("What is the value of the debt? ");
                values[count] = scanner.nextDouble();
                scanner.nextLine();

                System.out.print("How many days are left until the due date? ");
                days[count] = scanner.nextInt();
                scanner.nextLine();
                count++;
            }

            if (option == 2){
                debtService.listDebts(names, values, days, count,states);
            }

            if (option == 3){
                System.out.print("Which debt do you want to mark as paid? ");
                choice = scanner.nextInt();
                choice = choice - 1;
                if (choice >= 0 && choice < count){
                    states[choice] = true;
                    System.out.println("Debt marked as paid successfully");
                }else{
                    System.out.println("Invalid option");
                }
            }

            if (option == 4){
                System.out.print("Which debt do you want to delete? ");
                choice = scanner.nextInt();
                choice = choice - 1;
                if (choice >= 0 && choice < count) {
                    for (int i = choice; i < count - 1; i++){
                        names[i] = names[i+1];
                        values[i] = values[i+1];
                        days[i] = days[i+1];
                        states[i] = states[i + 1];
                    }
                    count--;
                    System.out.println("Debt removed successfully");
                }else{
                    System.out.println("Invalid option");
                }
            }

            if (option == 5){
                debtService.totalDebts(values,count);
            }

        }//end while
    }

}
