public class main {
    public static void main(String[] args){
        long begin = 100;
        long plus = 1000 ;
        long bonus;
        long balance = begin + plus ;
       if (balance >= 1000) {
            bonus = ((balance)/100)+balance;
           System.out.println(bonus);
        }
       else{
               System.out.println(balance);
       }




    }

}
