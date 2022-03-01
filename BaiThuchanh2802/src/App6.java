import java.util.Scanner;

public class App6 {
    public static void main(String[] args) {
        int n, sum;
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhap vao so nguyen duong n ");
        n = scanner.nextInt();

        for (int j = 1; j <= n; j++) {
            sum = 0;
            for (int i = 1; i <= j; i++) {
                if (j % i == 0)
                    sum += i;
            }
            if (sum / 2 == j)
                System.out.println(" " + j);
        }
    }
}