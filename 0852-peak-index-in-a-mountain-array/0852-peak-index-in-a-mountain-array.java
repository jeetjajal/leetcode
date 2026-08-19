class Solution {
    public int peakIndexInMountainArray(int[] a) {
        int st=1;
        int end=a.length-2;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(a[mid-1]<a[mid] && a[mid]>a[mid+1]){
                return mid;
                }
                if(a[mid-1]<a[mid]){
                    st=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
        
        return -1;
    }
}