import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        byte a = 3;
        byte b = 10;
        long c = 100L;

        int sub = b - a;
        int sum =  a+b;
        float div = (float)b/a;
        double mod = b%a;
        short inc = ++a;

        //Results output
        System.out.println("Sub: " + sub);
        System.out.println("Sum: "+ sum);
        System.out.println("Formatted Div: " + new DecimalFormat("#0.00").format(div));
        System.out.println("Mod: " + mod );
        System.out.println("Some func with long: " + (c -(b+a)));
        System.out.println("Inc: " + inc);
    }
}