class Solution {
    public int search(int[] n, int tar) {
        int st=0;
        int end=n.length-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(tar==n[mid]){
                return mid;
            }
            else if(tar<n[mid]){
                end=mid-1;
            }
            else{
                st=mid+1;
            }
        }
        return -1;
    }
}