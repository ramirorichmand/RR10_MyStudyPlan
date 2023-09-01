class Solution {
    public int maximalSquare(char[][] matrix) {
        int m = matrix.length, n = matrix[0].length, min = Math.min(m, n);
        int[][] arrH = new int[m][n];
        for (int r = 0; r < m; r++) {
            int count = 0;
            for (int c = 0; c < n; c++) {
                if (matrix[r][c] == '1') arrH[r][c] = ++count;
                else count = 0;
            }
        }

        int[][] arrV = new int[m][n];
        for (int c = 0; c < n; c++) {
            int count = 0;
            for (int r = 0; r < m; r++) {
                if (matrix[r][c] == '1') arrV[r][c] = ++count;
                else count = 0;
            }
        }

        int max = 0;
        for (int c = 0; c < n; c++) {
            for (int r = 0; r < m; r++) {
                int minC = Math.min(arrH[r][c], arrV[r][c]);
                if (max < minC) {
                    while (minC > max) {
                        if (noZeros(r,c,matrix,minC)) {
                            max = minC;
                            break;
                        }
                        minC--;
                    }
                }
            }
        }
        return max * max;
    }

    private boolean noZeros(int row, int col, char[][] matrix, int minC) {
        for (int r = row - minC + 1; r < row; r++) {
            for (int c = col - minC + 1; c < col; c++) {
                if (matrix[r][c] == '0') return false;
            }
        }
        return true;
    }
}

// 2nd solution below

public int maximalSquare(char[][] a) {
  if (a == null || a.length == 0 || a[0].length == 0)
    return 0;
      
  int max = 0, n = a.length, m = a[0].length;
  
  // dp(i, j) represents the length of the square 
  // whose lower-right corner is located at (i, j)
  // dp(i, j) = min{ dp(i-1, j-1), dp(i-1, j), dp(i, j-1) }
  int[][] dp = new int[n + 1][m + 1];
  
  for (int i = 1; i <= n; i++) {
    for (int j = 1; j <= m; j++) {
      if (a[i - 1][j - 1] == '1') {
        dp[i][j] = Math.min(dp[i - 1][j - 1], Math.min(dp[i - 1][j], dp[i][j - 1])) + 1;
        max = Math.max(max, dp[i][j]);
      }
    }
  }
  
  // return the area
  return max * max;
}