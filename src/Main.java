import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] v = new int[5];
        for (int i = 0; i < v.length; i++) {
            System.out.print("v[" + i + "]: ");
            v[i] = sc.nextInt();
        }
        System.out.println("Array: " + Arrays.toString(v));
        sc.close();
    }
}