import java.util.Arrays;
import java.util.Scanner;

public class UnpredictableArray {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int i = Integer.parseInt(sc.nextLine());
        int[] arr = new int[i];
        System.out.println(Arrays.toString(arr));
        sc.close();

    }
}
