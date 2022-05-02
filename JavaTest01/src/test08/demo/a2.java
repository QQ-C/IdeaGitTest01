package test08.demo;
import java.util.Scanner;


public class a2 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int M = sc.nextInt();
            int N = sc.nextInt();
            sc.nextLine();
            char[][] a = new char[M][N];
            for (int i = 0; i < M; ++i) {
                a[i] = sc.nextLine().toCharArray();
            }
            int cnt = 0;
            for (int i = 0; i < M; ++i) {
                for (int j = 0; j < N; ++j) {
                    if (a[i][j] == '@') {
                        dfs(a, i, j);
                        ++cnt;
                    }
                }
            }
            System.out.println(cnt);
        }

        private static void dfs(char[][] a, int row, int col) {
            if (row < 0 || row >= a.length || col < 0 || col >= a[0].length || a[row][col] == '*') {
                return;
            }
            a[row][col] = '*';
            for (int i = -1; i <= 1; ++i) {
                for (int j = -1; j <= 1; ++j) {
                    if (i == 0 && j == 0) {
                        continue;
                    }
                    dfs(a, row + i, col + j);
                }
            }
        }

}
