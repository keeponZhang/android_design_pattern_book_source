package zhushen.com.shejimoshi.leetcode;

import java.util.Arrays;

/**
 * Created by Zhushen on 2018/10/10.
 */
public class minEatingSpeed {

    public int minEatingSpeed(int[] piles, int H) {
        Arrays.sort(piles);
        if (H == piles.length) {
            return piles[piles.length - 1];
        }
        int left = 0;
        int right = piles.length - 1;
        int mid = (left + right) / 2;
        int midK = fun(piles, piles[mid]);
        while (right - left > 1) {
            if (midK < H) {
                right = mid;
            } else {
                left = mid;
            }
            mid = (left + right) / 2;
            midK = fun(piles, piles[mid]);
        }
        int ans = piles[left];
        if (left == 0) {
            ans = 1;
        }

        int ansLeft = ans;
        int ansRight = piles[right];
        int ansMid = (ansLeft + ansRight) / 2;
        while (ansLeft < ansRight) {
            if (!ok(piles, ansMid, H)) {
                ansLeft = ansMid + 1;
            } else {
                ansRight = ansMid;
            }
            ansMid = (ansLeft + ansRight) / 2;
        }
        return ansLeft;
    }

    int fun(int[] piles, int k) {
        int ans = 0;
        for (int pile : piles) {
            ans += pile / k;
            if (pile % k > 0) {
                ans++;
            }
        }
        return ans;
    }

    boolean ok(int[] piles, int k, int H) {
        long ans = 0;
        for (int pile : piles) {
            ans += pile / k;
            if (pile % k > 0) {
                ans++;
            }
            if (ans > H) {
                return false;
            }
            if (ans < 0) {
                return false;
            }
        }
        return true;
    }

}
