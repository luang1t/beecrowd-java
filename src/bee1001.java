import java.util.Scanner;

public class bee1001 {
    public static void main(String[] args) throws Exception {
        int a = 0;
        int b = 0;
        int x = 0;

        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();

        x = a + b;

        System.out.println("X = " + x);

        sc.close();
    }
}
