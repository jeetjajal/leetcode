class Solution {
    public int searchInsert(int[] n, int tar) {
        int st=0,end=n.length-1;
        while(st<=end){
            int mid=st+(end-st)/2;

            if(n[mid]==tar){
                return mid;
            }
           else if(n[mid]<tar){
                st=mid+1;  
            }
            else {
                 end=mid-1;
                   
            }
        }
        return st;
    }
}