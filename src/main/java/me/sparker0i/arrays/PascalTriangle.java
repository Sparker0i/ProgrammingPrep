package me.sparker0i.arrays;

public class PascalTriangle {
    /**
     * Given a number n, return the first n rows of a Pascal triangle
     *
     * Example:
     * Input: 5
     * Output: [[1], [1,1], [1,2,1], [1,3,3,1], [1,4,6,4,1]]
     *
     * Example:
     * Input: 1
     * Output: [[1]]
     *
     * @param n Number of rows to print in the Pascal triangle
     * @return Generated Pascal Triangle
     */
    public int[][] runner(int n) {
        int[][] triangle = new int[n][n];
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j <= i; ++j) {
                if (j == 0 || j == i)
                    triangle[i][j] = 1;
                else triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
            }
        }
        return triangle;
    }
}
