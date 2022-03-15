public class TestClass {
    public static void main(String []args) {
        int N = 529;
        BinaryGap binaryGap = new BinaryGap();
        int ans = binaryGap.solution(N);
        System.out.println(ans);
        assert 4 == ans;
    }
}
