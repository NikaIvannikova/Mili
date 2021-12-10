public class Main {
    public static void main2 (String[] args) {
        int x = 100;
        int accountBill = 2_000;
        int bonus = 1;

        if ( x >= 100)  {
            bonus = 1;
        } else {
            bonus = 0;
        }
        int total = (accountBill / x * bonus);
        System.out.println(total);


    }
}