import java.util.Arrays;//for sort array with help of arrays
public class aggressivecows{
    public static boolean isPossible(int[] arr, int N, int C, int minAllowedDist) {
        int cows = 1;
        int lastStallPos = arr[0];

        for (int i = 1; i < N; i++) {
            if (arr[i] - lastStallPos >= minAllowedDist) {
                cows++;
                lastStallPos = arr[i];
            }

            if (cows == C) {
                return true;
            }
        }
        return false;
    }
    public static int getDistance(int[] arr, int N, int C) {
        Arrays.sort(arr);

        int st = 1;
        int end = arr[N - 1] - arr[0];//maxvalinarr-minvalinarray
        int ans = -1;

        while (st <= end) {
            int mid = st + (end - st) / 2;

            if (isPossible(arr, N, C, mid)) { // right search space
                ans = mid;
                st = mid + 1;
            } else { // left search space
                end = mid - 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int N = 5, C = 3;
        int[] arr = {1, 2, 8, 4, 9};

        System.out.println(getDistance(arr, N, C));
    }

}