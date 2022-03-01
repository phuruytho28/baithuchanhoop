import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhap vao so do canh thu nhat: ");
        a = scanner.nextInt();
        System.out.println("nhap vao so do canh thu hai: ");
        b = scanner.nextInt();
        System.out.println("nhap vao so do canh thu ba: ");
        c = scanner.nextInt();

        if (a + b > c || a + c > b || c + b > a) {
            if (a == b && b == c) {
                System.out.println("day la tam giac đều");
            } else if (a * a > b * b + c * c && b == c || b * b > a * a + c * c && a == c
                    || c * c > a * a + b * b && a == b) {
                System.out.println("day la tam giac vuong can");
            } else if (a == b || b == c || c == a) {
                System.out.println("day la tam giac cân");
            } else if (a * a == b * b + c * c || b * b == a * a + c * c || c * c == a * a + b * b) {
                System.out.println("day la tam giac vuông");
            } else {
                System.out.println("day là tam giác thường");
            }
        } else {
            System.out.println("3 canh ban nhap khong phai tam giac !!");
        }
    }
}