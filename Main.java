public class Main {
    public static void main(String[] args) {
        long balance = 100;
        long plus = 900;
        if (plus >= 1000) {
            balance = plus / 100 + balance + plus;
        } else {
            balance = plus + balance;
        }
        System.out.println(balance);

    }

}

