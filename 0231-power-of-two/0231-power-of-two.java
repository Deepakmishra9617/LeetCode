class Solution {
    public static boolean first(int n) {
        if (n < 2) return n == 1;

        if (n % 2 != 0) return false;

        return first(n / 2);
    }

    public boolean isPowerOfTwo(int n) {
        return first(n);
    }
}