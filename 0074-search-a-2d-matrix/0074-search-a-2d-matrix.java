class Solution {
    public boolean searchinrow(int[][] mat, int tar,int row){
        int n=mat[0].length;
        int st=0,end=n-1;

        while(st<=end){
            int mid=st+(end-st)/2;

            if(tar==mat[row][mid]){
                return true;
            }
            else if(tar>mat[row][mid]){
                st=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return false;
    }
    public boolean searchMatrix(int[][] mat, int tar) {
        int m=mat.length;
        int n=mat[0].length;//columns

        int startrow=0,endrow=m-1;
        while(startrow<=endrow){
            int midrow=startrow+(endrow-startrow)/2;
            //midrow=target
            if(tar>=mat[midrow][0] && tar<=mat[midrow][n-1])
            {
                return searchinrow(mat, tar, midrow);
            }
            else if(tar>mat[midrow][n-1])
            {
                startrow=midrow+1;
            }
            else
            {
                endrow=midrow-1;
            }
        }
        return false;
    }
}