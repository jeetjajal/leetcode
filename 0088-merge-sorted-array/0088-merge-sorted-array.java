class Solution {
    public void merge(int[] a, int m, int[] b, int n) {
        int idx=m+n-1,i=m-1,j=n-1;//start from backword

        while(i>=0 && j>=0){
            if(a[i]>b[j]){
                a[idx--]=a[i--];//idx--,i--
            }
            else{
                a[idx--]=b[j--];//j--
            }
        }
        while(j>=0){
            a[idx--]=b[j--];
        }
    }
}