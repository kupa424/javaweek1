package Week2;

public class Task1 {

       public static void main(String[] args) {
       Solution s=new Solution();
       int[][]matrix1 = new int[][]{
               {1,2,3},
               {4,5,6},
               {7,8,9}};
       s.rotate(matrix1);
           int[][]matrix2 = new int[][]{
                   {5,1,9,11},
                   {2,4,8,10},
                   {13,3,6,7},
                   {15,14,12,16}};
           s.rotate(matrix2);
       }

   static class Solution {
       public void rotate(int[][] matrix)
       {
           if(matrix==null){
               return;
           }
           int n=matrix.length;
           for(int i=0;i<n/2;i++){
               for(int j=i;j<n-1-i;j++){
                   int temp = matrix[i][j];
                   matrix[i][j]=matrix[n-1-j][i];
                   matrix[n-1-j][i]=matrix[n-1-i][n-1-j];
                   matrix[n-1-i][n-1-j]=matrix[j][n-1-i];
                   matrix[j][n-1-i]=temp;
               }
           }

           for (int i = 0; i < n; i++) {
               System.out.print("[");
               for (int j = 0; j < n; j++) {
                   System.out.print(matrix[i][j]+" ");
               }
               System.out.print("]");
               System.out.println("");
           }
           System.out.println("--------------");
       }

   }
}
