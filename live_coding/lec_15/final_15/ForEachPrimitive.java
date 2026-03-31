import java.util.Arrays;

public class ForEachPrimitive {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3 };

        System.out.println(Arrays.toString(numbers));
        for (int i : numbers) {
            i += 1;
            System.out.println(i);
        }
        System.out.println(Arrays.toString(numbers));
    }
}
