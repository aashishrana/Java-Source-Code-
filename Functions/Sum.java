public class Sum {
    public static int sum(int num1, int num2) {
        int result = num1 + num2;

        return result;
    }
    public static void main(String []args) {

        int num1 = 10;
        int num2 = 20;

        int num3 = sum(num1, num2);

        System.out.println(num3);

    }
}