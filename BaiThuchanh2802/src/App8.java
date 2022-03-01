import java.util.Scanner;

public class App8 {
    public static void main(String[] args) {
        int n = 1;
        Scanner scanner = new Scanner(System.in);

        int max = 0;
        while (n != 0) {
            System.out.println(" nhap so nguyen duong");
            n = scanner.nextInt();
            if (max < n) {
                max = n;
            }
        }
        if (max % 5 == 0) {
            System.out.println("gia tri lon nhat chia het cho 5 la: " + max);
        } else {
            System.out.println("khong co gia tri thoa man de bai");
        }
    }
}