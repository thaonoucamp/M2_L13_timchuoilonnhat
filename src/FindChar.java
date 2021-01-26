import java.util.LinkedList;
import java.util.Scanner;

public class FindChar {
    public static LinkedList<Character> LIS() {
        Scanner sc = new Scanner(System.in);

        LinkedList<Character> list = new LinkedList<>();
        System.out.println("Enter a string: ");

        String str = sc.nextLine();
        list.add(str.charAt(0));

        for (int i = 1; i < str.length(); i++) {
            if ((int) str.charAt(i) > (int) list.getLast()) {
                list.add(str.charAt(i));
            }
        }

        sc.close();
        return list;
    }

    public static void main(String[] args) {

        System.out.println(LIS());
    }
}
