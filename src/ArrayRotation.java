public class ArrayRotation {
    public int[] solution(int[] A, int K) {
        int len = A.length;
        int[] res = new int[len];
        for (int i = 0; i < len; i++) {
            res[(i+K)%len] = A[i];
        }
        return res;
    }
}
