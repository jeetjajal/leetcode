public class painterspartitionprblm {

    public static boolean isPossible(int[] arr, int n, int m, int maxAllowedTime) {
        int painters = 1, time = 0;

        for (int i = 0; i < n; i++) {
            if (time + arr[i] <= maxAllowedTime) {
                time += arr[i];
            } else {
                painters++;
                time = arr[i];
            }
        }

        return painters <= m;
    }

    public static int minTimeToPaint(int[] arr, int n, int m) {
        int sum = 0, maxVal = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
            maxVal = Math.max(maxVal, arr[i]);
        }

        int st = maxVal, end = sum, ans = -1;

        while (st <= end) {
            int mid = st + (end - st) / 2;

            if (isPossible(arr, n, m, mid)) {
                ans = mid;
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {40, 30, 10, 20};
        int n = arr.length;
        int m = 2;
        System.out.println(minTimeToPaint(arr, n, m));
    }
}