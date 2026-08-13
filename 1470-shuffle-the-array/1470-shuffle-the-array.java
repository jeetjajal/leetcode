class Solution {
    public int[] shuffle(int[] nums, int n) {
        int [] ans =new int [2*n];
        int count=0;
        for(int i=0;i<n;i++){
            ans[count]=nums[i];
            ans[count+1]=nums[i+n];
            count+=2; 
            }
            return ans;
        }
}