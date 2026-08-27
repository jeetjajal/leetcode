class Solution {
    public void nextPermutation(int[] a) {
       int piv=-1;
       int n=a.length;
        //find pivot
       for(int i=n-2;i>=0;i--){
            if(a[i]<a[i+1]){
                piv=i;
                break;
            }
       } 
       if(piv==-1){
            int i=0,j=n-1;
            while (i < j) {
                int temp = a[i];
                a[i++] = a[j];
                a[j--] = temp;
            }
            return;
       }
       //swap numbers
       for(int i=n-1;i>piv;i--){
            if(a[i]>a[piv]){
                int temp=a[i];
                a[i]=a[piv];
                a[piv]=temp;
                break;
            }
       }
       //reverse array
       int i=piv+1,j=n-1;
       while(i<j){
            int temp = a[i];
            a[i++] = a[j];
            a[j--] = temp;
            
       }   
    }
}