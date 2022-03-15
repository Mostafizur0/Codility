import java.util.Arrays;

public class TestClass {
    public static void main(String []args) {
        int N = 10;
        int[] A = {1,2,3,4};
        ArrayRotation arrayRotation = new ArrayRotation();
        int[] res = arrayRotation.solution(A, N);
        System.out.println(Arrays.toString(res));
        int[] ans = {3, 4, 1, 2};
        assert res == ans;
    }
}
