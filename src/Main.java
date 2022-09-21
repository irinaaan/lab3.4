import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String str = in.nextLine();
        System.out.println("Слова в строке: ");
        checkStr(str);
    }

    public static void checkStr(String str) {
        String[] words = str.split("\\s+");
        System.out.println(Arrays.toString(words));
    }
}
