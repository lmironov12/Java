import java.util.Arrays;

public class SimpleDigits2 {
    public static void main(String[] args) {
        int lenght = 100;
        int[] simple = new int[lenght];
        int n = 0;
        for (int i = 2; n < lenght; i++) {
            if (checkSimple(i)) {
                simple[n] = i;
                n++;
            }
        }
        System.out.print(Arrays.toString(simple));
    }
    public static boolean checkSimple(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
