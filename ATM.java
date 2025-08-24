import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {
        Scanner my_tool = new Scanner(System.in);
        BankAccount my_account_info = new BankAccount(1000.00);

        while (true) {
            System.out.println("\nwhat do you want to do:");
            System.out.println("1. see my balance");
            System.out.println("2. put money in");
            System.out.println("3. take money out");
            System.out.println("4. get out of here");
            System.out.print("pick a number: ");

            try {
                int my_choice = my_tool.nextInt();

                switch (my_choice) {
                    case 1:
                        System.out.println("your balance is: $" + my_account_info.what_do_i_have());
                        break;
                    case 2:
                        System.out.print("how much to put in: $");
                        double how_much_to_put = my_tool.nextDouble();
                        my_account_info.deposit_it(how_much_to_put);
                        break;
                    case 3:
                        System.out.print("how much to take out: $");
                        double how_much_to_take = my_tool.nextDouble();
                        my_account_info.get_it_out_of_here(how_much_to_take);
                        break;
                    case 4:
                        System.out.println("ok bye!");
                        my_tool.close();
                        return;
                    default:
                        System.out.println("that's not a choice. try again.");
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("i need a number, not text.");
                my_tool.nextLine();
            }
        }
    }
}