
public class Main {
    public static void main(String[] args){
       //implicit casting
        //byte > short > int > long > float > double
       double x = 1.1;
       int y = (int)x + 2; //explicit casting

        System.out.println(y);
        String c = "1.1";
        double yy = Double.parseDouble(c) + 2;
        System.out.println(yy);



    }
}
