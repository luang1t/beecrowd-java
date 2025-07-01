import java.util.Scanner;

public class bee1002 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double A = 0;
        double n = 3.14159;
        double R = 0;

        R = scanner.nextDouble();

        A = n * (R * R);

        System.out.println("A = " + A);

        scanner.close();
    }
}