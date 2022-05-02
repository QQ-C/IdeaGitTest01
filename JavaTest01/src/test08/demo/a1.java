package test08.demo;

import java.sql.SQLOutput;
import java.util.Scanner;
//n行m列的矩阵 对其中的数字进行操作
public class a1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        while(scan.hasNextInt()){
            int n = scan.nextInt();
            int m=scan.nextInt();

            int[][] mat=new int[n][m];  //创建二维数组 n*m
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    mat[i][j]=scan.nextInt();
                }
            }
//            for(int i=0; i<mat.length; i++){
//                for(int j=0; j<mat[0].length; j++){
//                    System.out.print(mat[i][j]+"\t");
//                }
//                System.out.println();
//            }
            int q=scan.nextInt();   //操作次数
            int[] x=new int[q];
            int count=0;
            for(int k=0;k<q;k++){
                x[k]=scan.nextInt();  //操作的数字
                for(int i=0;i<n;i++){
                     for(int j=0;j<m;j++){
                          if(mat[i][j]==x[k]){
                              dfs(mat,i,j);
                              count++;
                          }
                     }
                }
                System.out.print(count+" ");
            }
        }
    }

    private static void dfs(int[][] mat, int row, int col){
        int x='*';
        if(row<0||row>=mat.length||col<0||col>=mat[0].length||mat[row][col]==x){
            return;
        }
        mat[row][col] = x;      //起到将数字标红的作用
//        for(int i=-1;i<=1;++i){
//            for(int j=-1;j<=1;++j){
//                if(i==0&j==0){
//                    continue;
//                }
//                dfs(mat,row+1,col+1,x);
//            }
//        }
        dfs(mat,row+1,col);   //上下左右
        dfs(mat,row-1,col);
        dfs(mat,row,col+1);
        dfs(mat,row,col-1);
    }
}
