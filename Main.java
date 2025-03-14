import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int x = 1;
        int y = 1;
        System.out.println(x != y);

        int temperature = 22;
        boolean isWarm = temperature > 20 && temperature < 30;
        System.out.println(isWarm);

        boolean hasHighIncome = true;
        boolean hasGoodConduct = true;
        boolean hasCriminalRecord = true;
        boolean isEligible = (hasHighIncome && hasGoodConduct) && !hasCriminalRecord;
        System.out.println(isEligible);
    }
}
