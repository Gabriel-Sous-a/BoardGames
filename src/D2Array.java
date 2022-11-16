import java.util.Arrays;

public class D2Array {
    private static int[][] d2 = new int[][]{{1,2,3}, {4,5,6}};

    public static void print () {
        for (int i = 0; i < d2.length; i++) {
            System.out.println(Arrays.toString(d2[i]));
        }
    }
}
