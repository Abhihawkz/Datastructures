public class SmallestString {

    static boolean isValid(String s, String p, int mid,
            int[] start) {

        int[] count = new int[256];
        Arrays.fill(count, 0);

        int distinct = 0;

        for (char x : p.toCharArray()) {
            if (count[x] == 0)
                distinct++;
            count[x]++;
        }

        int curr_count = 0;
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i)]--;
            if (count[s.charAt(i)] == 0) {
                curr_count++;
            }

            if (i >= mid) {
                count[s.charAt(i - mid)]++;
                if (count[s.charAt(i - mid)] == 1) {
                    curr_count--;
                }
            }

            if (i >= mid - 1) {
                if (curr_count == distinct) {
                    start[0] = (i - mid) + 1;
                    return true;
                }
            }
        }

        return false;
    }

    static String smallestWindow(String s, String p) {
        int m = s.length();
        int n = p.length();
        if (m < n)
            return "-1";

        int minLength = Integer.MAX_VALUE;

        int low = n, high = m;

        int idx = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int[] start = new int[1];

            if (isValid(s, p, mid, start)) {
                if (mid < minLength) {
                    minLength = mid;
                    idx = start[0];
                }
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        if (idx == -1)
            return "-1";

        return s.substring(idx, idx + minLength);
    }

    public static void main(String[] args) {
        String s = "timetopractice";
        String p = "toc";

        System.out.println(smallestWindow(s, p));
    }
}