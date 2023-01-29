import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int a[] = {3,2,5,4,1};
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        Arrays.sort(b);
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(a));
    }
}