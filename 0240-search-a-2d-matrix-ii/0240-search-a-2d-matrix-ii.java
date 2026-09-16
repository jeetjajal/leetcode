class Solution {
    public boolean searchMatrix(int[][] mat, int tar) {
        int m=mat.length;
        int n=mat[0].length;

        int r=0,c=n-1;
        while(r<m && c>=0){
            if(tar==mat[r][c]){
                return true;
            }else if(tar<mat[r][c]){
                c--;
            }else{
                r++;
            }
        }
        return false;
    }
}