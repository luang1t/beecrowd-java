import java.util.Scanner;

public class bee1002 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double A, R;
        double n = 3.14159f;

        R = scanner.nextDouble();

        A = n * (R * R);

        System.out.printf("A=%.4f\n", A);

        scanner.close();
    }
}