public class Main {
public static void main(String[] args){
long begin = 100; //переменная отражает баланс до пополнения
long plus = 1000 ; // пополнение
long balance ;
if (plus >= 1000) {
balance = plus/100 + begin + plus;
                  }
else{
balance = plus + begin;
     }
System.out.println(balance);
    }
}

