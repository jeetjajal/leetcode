class Solution {

    public boolean isPossible(int[] arr, int k, int workload) {
        int count = 1;
        int currentWork = 0;

        for (int i = 0; i < arr.length; i++) {
            if (currentWork + arr[i] <= workload) {
                currentWork += arr[i];
            } else {
                count++;
                currentWork = arr[i];
            }
        }

        return count <= k;
    }

    public int splitArray(int[] nums, int k) {
        int n = nums.length;
        int sum = 0;
        int maxVal = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            sum += nums[i];
            maxVal = Math.max(maxVal, nums[i]);
        }
        int st = maxVal, end = sum;
        int ans = -1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (isPossible(nums, k, mid)) {
                ans = mid;
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }
        return ans;
    }
}