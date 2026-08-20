class Solution {
    public boolean search(int[] n, int tar) {
        int st=0;
        int end=n.length-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(n[mid]==tar){
                return true;
            }
            if(n[st]==n[mid] && n[mid]==n[end]){
                st++;
                end--;
            }
            else if(n[st]<=n[mid]){
                if(n[st]<=tar && tar<=n[mid]){
                    end=mid-1;
                }
                else
                {
                    st=mid+1;
                }
            }
            else{
                if(n[mid]<=tar && tar<=n[end]){
                    st=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
        }
        return false;
    }
}