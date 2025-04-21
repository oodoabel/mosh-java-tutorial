import java.util.Scanner;

public class Main{
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a whole number");
        int number = input.nextInt();
         if (number % 2 == 0){
            System.out.println("Number is even");
         }else {
             System.out.println("Number is ood");
         }

         input.close();

    }
}