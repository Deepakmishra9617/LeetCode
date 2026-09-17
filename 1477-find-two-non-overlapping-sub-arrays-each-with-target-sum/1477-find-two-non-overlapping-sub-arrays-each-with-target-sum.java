import java.util.*;

class Solution {
    public int minSumOfLengths(int[] arr, int target) {
        int n = arr.length;
        int INF = n + 1;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 0);
        int prefix = 0;
        int[] best = new int[n + 1];
        Arrays.fill(best, INF);
        int ans = INF;
        for (int i = 1; i <= n; i++) {
            prefix += arr[i - 1];
            if (map.containsKey(prefix - target)) {
                int l = map.get(prefix - target);
                int len = i - l;
                if (best[l]!= INF) {
                    ans = Math.min(ans, best[l] + len);
                }
                best[i] = Math.min(best[i - 1], len);
            } else {
                best[i] = best[i - 1];
            }

            map.put(prefix, i);
        }
        return ans == INF? -1 : ans;
    }
}