import java.util.Scanner;
import java.lang.Math;

public class App4 {
    public static boolean kt(int n) {

        if (n < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap n = ");
        n = scanner.nextInt();

        System.out.printf("cac so nguyen to do la: ", n);
        if (n >= 2) {
            System.out.print(2);
        }
        for (int i = 3; i < n; i += 2) {
            if (kt(i)) {
                System.out.print("   " + i);
            }
        }
    }

}
