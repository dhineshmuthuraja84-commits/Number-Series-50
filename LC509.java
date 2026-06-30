class Solution {
    public int fib(int n) {
        if (n <= 1) {
            return n;
        }

        int f = 0;
        int l = 1;

        for (int i = 2; i <= n; i++) {
            int t = f + l;
            f = l;
            l = t;
        }

        return l;
    }
}
