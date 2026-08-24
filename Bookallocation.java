public class Bookallocation {   
    // Helper method to check if a valid allocation is possible with maxAllowedPages
    public static boolean isValid(int[] arr, int n, int m, int maxAllowedPages) {
        int students = 1;
        int pages = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > maxAllowedPages) {
                return false;
            }
            if (pages + arr[i] <= maxAllowedPages) {
                pages += arr[i]; // addition of pages
            } else {
                students++;
                pages = arr[i];
            }
        }

        return students <= m;
    }

    // Function to find the minimum possible maximum pages allocated to a student
    public static int allocateBooks(int[] arr, int n, int m) {
        if (m > n) {
            return -1;
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        int ans = -1;
        int st = 0, end = sum; // range of possible answer

        while (st <= end) {
            int mid = st + (end - st) / 2;

            if (isValid(arr, n, m, mid)) { // left
                ans = mid;
                end = mid - 1;
            } else { // right
                st = mid + 1;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {15, 17, 20}; // 2,1,3,4
        int n = 3, m = 2;
        System.out.println(allocateBooks(arr, n, m));
    }
}