import java.util.Scanner;

public class App1 {
    public static void main(String[] args) throws Exception {
        int a, b;
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhap vao so thu nhat: ");
        a = scanner.nextInt();
        System.out.println("nhap vao so thu hai: ");
        b = scanner.nextInt();

        if (a == 0 || b == 0) {
            System.out.println(+(a + b));
        }

        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                a = b - a;
            }
        }
        System.out.println("uoc chung lon nhat cua hai so la: " + a);
    }
}