public class insertionsort{
    public static void insertion(int arr[],int n){
        for(int i=1;i<n;i++){
            int curr=arr[i];
            int prev=i-1;
            
            while(prev>=0&&arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
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
        insertion(arr,n);
        print(arr,n);
    }
}