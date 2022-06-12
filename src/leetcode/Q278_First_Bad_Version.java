package leetcode;

public class Q278_First_Bad_Version {
    boolean isBadVersion(int version) {
        return false;
    }

    public int firstBadVersion(int n) {
        int start = 1, end = n, mid = 1;

        while (end > start) {
            mid = start + (end - start) / 2;

            if (isBadVersion(mid)) {
                end = mid;
            }
            else {
                start = mid + 1;
            }
        }
        return start;
    }
}
