import java.util.Scanner;

public class App10 {
    public static void main(String[] args) {
        int dem = 0, n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so nguyen duong n: ");
        n = scanner.nextInt();
        while (n > 0) {
            n = n / 10;
            dem++;
        }
        System.out.println("so luong chu so ban nhap la: " + dem);
    }
}