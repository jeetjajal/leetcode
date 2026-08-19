class Solution {
    public int findMin(int[] n) {
        int st=0;
        int end=n.length-1;
        while(st<end){
            int mid=st+(end-st)/2;
            if(n[mid]>n[end])
            {
              st=mid+1;      
            }
            else
            {
              end=mid;
            }
        }
        return n[st];
    }
}