package repetition;

public class ExEvenSum {

    public static void main(String[] args) {

        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum += i % 2 == 0 ? i : 0;
        }

        System.out.println(sum);
    }
}
