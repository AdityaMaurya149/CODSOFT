public class BankAccount {
    private double my_money;

    public BankAccount(double my_start_money) {
        this.my_money = my_start_money;
    }

    public double what_do_i_have() {
        return my_money;
    }

    public void deposit_it(double a_lot_of_money) {
        if (a_lot_of_money > 0) {
            my_money = my_money + a_lot_of_money;
            System.out.println("deposited, my new total is: $" + my_money);
        } else {
            System.out.println("that's not a real amount of money.");
        }
    }

    public boolean get_it_out_of_here(double i_need_this_much) {
        if (i_need_this_much > 0 && i_need_this_much <= my_money) {
            my_money = my_money - i_need_this_much;
            System.out.println("took it out, my new total is: $" + my_money);
            return true;
        } else {
            System.out.println("you can't take that much out.");
            return false;
        }
    }
}