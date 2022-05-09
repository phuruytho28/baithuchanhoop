import java.util.ArrayList;

public class App16 {
    public static void main(String[] args) throws Exception {
        ArrayList<String> arrListString = new ArrayList<>();

        arrListString.add("JAVA");
        arrListString.add("PHP");
        arrListString.add("C#");
        arrListString.add("C++");

        System.out.println("cac phan tu co trong arrListString la: ");
        for (int i = 0; i < arrListString.size(); i++) {
            System.out.println(arrListString.get(i) + "\t");
        }

        arrListString.add("HTML+CSS");
        arrListString.set(2, "JAVASCRIP");
        arrListString.remove("C++");

        System.out.println("cac phan tu sau khi duoc sua: ");
        for (int i = 0; i < arrListString.size(); i++) {
            System.out.println(arrListString.get(i) + "\t");
        }
    }
}
