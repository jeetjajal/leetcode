class Solution {
    public static boolean ispossible(int[] arr, int k,int workload) {
        int n=arr.length;
        int count=1,currentwork=0;
        for(int i=0;i<n;i++){
            if(currentwork+arr[i]<=workload){
                currentwork+=arr[i];
            }
            else{
                count++;
                currentwork=arr[i];
            }
        }
        return count<=k;
    }
    public int splitArray(int arr[],int k){
        int n=arr.length;
        if(k>n){
            return -1;
        }       
        int sum=0, maxval=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            maxval=Math.max(maxval,arr[i]);
        }
        int st=maxval,end=sum,ans=-1;
        while(st<=end){
            int   mid=st+(end-st)/2;
            if(ispossible(arr,k,mid)){
                ans=mid;
                end=mid-1;
            }
            else{
                st=mid+1;
            }
        }
        return ans;
    }
}