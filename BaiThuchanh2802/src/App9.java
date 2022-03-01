import java.util.Scanner;

public class App9 {
    public static void main(String[] args) {
        int n, k, sy = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhap vao so nguyen duong n: ");
        n = scanner.nextInt();

        while (n > 0) {
            k = n % 10;
            sy = sy * 10 + k;
            n = n / 10;
        }
        System.out.println("" + sy);
    }
}