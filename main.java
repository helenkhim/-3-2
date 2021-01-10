public class main {
    public static void main(String[] args) {
        long balance = 100;
        long plus = 1000;
        long bonus;
        if (plus >= 1000) {
            bonus = plus / 100 + balance + plus;
        } else {
            bonus = plus + balance;
        }
        System.out.println(bonus);


    }

}
