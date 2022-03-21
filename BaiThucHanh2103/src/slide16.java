import java.util.Scanner;

public class App {
    public static void main(String[] args) {
    }

    class hinhtron {
        final float pi = 3.14f;
        float r;
        float cv;
        float dt;

        void nhapBanKinh() {
            system.out.println("hay nhap vao ban kinh hinh tron:");
            Scanner scanner = new Scanner(System.in);
            r = scanner.nextFloat();
        }

        void tinhChuVi() {
            cv = 2 * pi * r;
        }

        void DienTich() {
            dt = pi * r * r;
        }

        void InChuVi() {
            system.out.println("chu vi hinh tron:" + cv);
        }

        void InDienTich() {
            system.out.println("dien tich hinh tron:" + dt);
        }
    }
}
