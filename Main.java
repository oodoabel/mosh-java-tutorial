import java.util.Scanner;

public class Main{
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Operand 1");
        double num1 = input.nextDouble();

        System.out.println("Enter Operator");
        char operator = input.next().charAt(0);

        System.out.println("Enter Operand 2");
        double num2 = input.nextDouble();

        double result = 0;

        switch (operator){
            case '-':
                result = num1 - num2;
                break;
            case'+':
                result = num1 + num2;
            case'*':
                result = num1 * num2;
            case'/':
                if (num2 == 0){
                    System.out.println("Cannot devide by 0");
                }else{
                result = num1 + num2;}
        }

        System.out.println(num1 +" "+operator +" " + num2 +" " + "=" + " " + result);
    }
}