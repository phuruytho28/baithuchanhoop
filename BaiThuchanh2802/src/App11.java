import java.util.Scanner;

public class App11 {
    public static void main(String[] args) {

        int i, j, k, sl = 0;
        for (i = 0; i <= 20; ++i)
            for (j = 0; j <= 10; ++j)
                for (k = 0; k <= 4; ++k)
                    if (i * 10000 + j * 20000 + k * 50000 == 200000) {
                        System.out.println(i + "to 10000  " + j + "to 20000  " + k + "to 50000  ");

                        sl++;
                    }
        System.out.println("có" + sl + "cach chon");
    }
}