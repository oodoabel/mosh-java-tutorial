import java.awt.*;
import java.util.Date;

public class Main {
    public static void main(String[] args){
        byte age = 30;
        Date now = new Date();
        System.out.println(now);

        Point point1 = new Point(1, 1);
        Point point2 = point1;
        point1.x=2;
        System.out.println(point2);
    }
}
