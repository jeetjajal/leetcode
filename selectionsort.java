 public class selectionsort{
    public static void select(int[]arr,int n){
        for(int i=0;i<n-1;i++){
            int smallest=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[smallest]){
                    smallest=j;
                }
            }
            if (smallest != i) {
                int temp = arr[smallest]; 
                arr[smallest] = arr[i]; 
                arr[i] = temp; 
            }
        }
    }
 public static void print(int []arr,int n){
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[]args){
        int arr[]={1,5,40,3,2};
        int n=5;
        select(arr,n);
        print(arr,n);
    }
}