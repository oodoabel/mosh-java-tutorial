import java.util.Scanner;

public class Main{
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Type a sentence");
        String Sentence = input.nextLine();

        int num = Sentence.length();
        System.out.println("Your sentence has a total of "+num +" words long");

    }
}