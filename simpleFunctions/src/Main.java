import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {

    public static String FirstReverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }
    public static int FirstFactorial(int num) {
        int counter = num - 1;
        while (counter != 0) {
            num = num * counter;
            counter--;
        }
        return num;
    }


    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print(FirstReverse(s.nextLine()));

    }
}