import java.util.ArrayList;
import java.util.List;
class Solution {
    public List<Integer> spiralOrder(int[][] mat) {
        List<Integer> ans = new ArrayList<>();

        //Edge Case:check if matrix NULL or EMPTY
        if(mat==null||mat.length==0||mat[0].length==0){
            return ans;
        }
        int m=mat.length,n=mat[0].length;
        int srow=0,scol=0,erow=m-1,ecol=n-1;
        
        while(srow<=erow && scol<=ecol){
            //TOP
            for(int j=scol;j<=ecol;j++){
                ans.add(mat[srow][j]);
            }
            //RIGHT
            for(int i=srow+1;i<=erow;i++){
                ans.add(mat[i][ecol]);
            }
            //BOTTOM
            for(int j=ecol-1;j>=scol;j--){
                if(srow==erow){
                    break;
                }
                ans.add(mat[erow][j]);
            }
            //LEFT
            for(int i=erow-1;i>=srow+1;i--){
                if(scol==ecol){
                    break;
                }
                ans.add(mat[i][scol]);
            }
            srow++;
            erow--;
            scol++;
            ecol--;
        }
        return ans;
    }
}