import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello!!!  " + args[0]);
        Scanner scanner = new Scanner(System.in);
        System.out.print("x = ");
        double x = scanner.nextDouble();
        System.out.print("y = ");
        double y = scanner.nextDouble();
        double z = 3.0 * Math.pow(Math.cos(x - Math.PI / 6.0), 2.0) /
                (0.5 + Math.sin(y) * Math.sin(y) );
        System.out.println("z = " + z);
    }
}
