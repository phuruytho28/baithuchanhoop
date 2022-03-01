import java.util.Scanner;

public class App7 {
    public static void main(String[] args) {
        float n = 1;
        Scanner scanner = new Scanner(System.in);

        float max = 0;
        while (n != 0) {
            System.out.println("nhap vao so thuc");
            n = scanner.nextFloat();
            if (max < n) {
                max = n;
            }
        }
        System.out.println("so lon nhat la:" + max);

    }
}