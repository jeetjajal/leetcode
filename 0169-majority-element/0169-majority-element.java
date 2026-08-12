class Solution {
    public int majorityElement(int[] nums) {
        int frequcies=0;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(frequcies==0){
                ans=nums[i];
            }
            if(ans==nums[i]){
                frequcies++;
            }
            else{
                frequcies--;
            }
        }
         return ans;
    }
}