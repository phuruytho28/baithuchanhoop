
import java.util.ArrayList;
import java.util.ListIterator;

public class App19 {

    public static void main(String[] args) {

        ArrayList<Character> arrListChar = new ArrayList<>();

        arrListChar.add('a');

        arrListChar.add('e');

        arrListChar.add('b');

        arrListChar.add('c');

        ListIterator<Character> listIterator = arrListChar.listIterator();

        System.out.println("Các phân tử có trong arrlistChar là:");

        while (listIterator.hasNext()) {
            System.out.print(listIterator.next() + "1");
        }
    }
};
