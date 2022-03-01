import java.util.Scanner;

public class App3 {
    public static void main(String[] args) {
        int a;
        int i = 2;
        int kt = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhap vao so nguyen muon kiem tra: ");
        a = scanner.nextInt();

        if (a < 2) {
            System.out.println("day khong phai so nguyen to.");
        }

        for (; i < a - 1; i++) {
            if (a % i == 0) {
                kt = 1;
            }
        }
        if (kt == 1) {
            System.out.println("day khong phai so nguyen to");
        } else {
            System.out.println("day la so nguyen to");
        }
    }
}
