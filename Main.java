import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
       int temp = 50;
       if (temp > 32) {
           System.out.println("Its a hot day");
           System.out.println("Drink  water");
       }
       else if (temp > 20 && temp <= 32) {
           System.out.println("Its a great day");
       }
       else
            System.out.println("Cool day");
    }
}
