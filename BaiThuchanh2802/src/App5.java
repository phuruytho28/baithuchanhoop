import java.util.Scanner;

public class App5 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhap vao so nguyen duong n ");
        n = scanner.nextInt();

        int s = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                s = s + i;
            }
        }
        if (s == n) {
            System.out.println("day la so hoan thien");
        } else {
            System.out.println("day khong phai so hoan thien");
        }
    }
}