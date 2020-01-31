
public class FrogJumps {
    public static void main(String[] args) {
        String str = "avinash";
        int[] arr = {0};
        int sumOfJumps = 0;
        for (int n : arr) {
            sumOfJumps += compute(n, false, 10, 1, 0);
        }
        System.out.println(sumOfJumps);

    }

    public static int compute(int n, boolean flag, int X, int Y, int jump) {
        if (n == 0) {
            return 1;
        } else if (!flag) {
            return n <= 0 ? jump : compute(n - X, true, X, Y, jump + 1);
        } else {
            return n <= 0 ? jump : compute(n + Y, false, X, Y, jump); // jump will not change as jump is not equal to slip
        }
    }
}
