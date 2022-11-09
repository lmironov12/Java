public class TryCatch {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
//            int num = 5;
//            int num2 = num / 0;
//            System.out.print(num2);
            System.out.print(numbers[3]);
        } catch (Exception e) {
            System.out.print(e);
        } finally {
            System.out.println("Hello");
            int num = 100;
            System.out.println(num);
        }
    }
}
