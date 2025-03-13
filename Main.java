import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        int[] numbers = new int[5];
        numbers [0] = 1;
        numbers [2] =2;
        numbers [4] = 6;
        Arrays.sort(numbers);

        System.out.println(Arrays.toString(numbers));
    }
}
