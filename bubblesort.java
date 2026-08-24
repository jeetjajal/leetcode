public class bubblesort{
    public static void Bubble(int[]arr,int n){
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
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
        int arr[]={4,1,5,2,3};
        int n=5;
        Bubble(arr,n);
        print(arr,n);
    }
}