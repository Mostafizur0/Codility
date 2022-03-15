public class BinaryGap {
    int[] binary = new int[33];
    public int solution(int N) {
        int ans = 0;
        int start = -1;
        for (int i = 30; i >= 0; i--) {
            int powerOf2 = (int) Math.pow(2, i);
            if (powerOf2 <= N) {
                N-= powerOf2;
                if (start == -1) {
                    start = i;
                } else {
                    if (start-1-i >= 0) {
                        if (start-1-i > ans) {
                            ans = start-1-i;
                        }
                        start = i;
                    }
                }
            }
        }
        return ans;
    }
}
