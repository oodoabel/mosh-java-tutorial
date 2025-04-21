import java.util.Scanner;

public class Main{
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first integer");
        int firstInt = input.nextInt();

        System.out.println("Enter your Second integer");
        int secondInt = input.nextInt();

        int sum = firstInt+secondInt;

        int difference = firstInt-secondInt;

        int product = firstInt*secondInt;

        int quotient = firstInt/secondInt;

        System.out.println("Sum: "+ sum);
        System.out.println("Difference: "+ difference);
        System.out.println("Product: "+ product);
        System.out.println("Quotient: "+ quotient);



    }
}