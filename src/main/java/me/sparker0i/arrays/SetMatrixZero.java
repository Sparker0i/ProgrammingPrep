package me.sparker0i.arrays;

import java.util.Arrays;

public class SetMatrixZero {
    /**
     * Given a 2D matrix, if an element in the matrix is 0,
     * then you will have to set its entire column and row to 0,
     * then return the matrix.
     *
     * Example:
     * Input:  [[1,1,1], [1,0,1], [1,1,1]]
     * Output: [[1,0,1], [0,0,0], [1,0,1]]
     *
     * Example:
     * Input:  [[0,1,2,0], [3,4,5,2], [1,3,1,5]]
     * Output: [[0,0,0,0], [0,4,5,0], [0,3,1,0]]
     *
     * @param input Input 2D Matrix
     * @return Modified Matrix
     */
    public int[][] runner(int[][] input) {
        //Row and Column Length
        int rows = input.length;
        int cols = input[0].length;

        //The below arrays will Store whether a particular row or column contains 0 or not
        int[] updateRows = new int[rows];
        int[] updateCols = new int[cols];

        //Filling the two arrays with -1 initially
        Arrays.fill(updateRows, -1);
        Arrays.fill(updateCols, -1);

        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j < cols; ++j) {
                //If the element in the matrix is 0, we set the respective updateRows and updateCols position value to 0
                if (input[i][j] == 0) {
                    updateRows[i] = 0;
                    updateCols[j] = 0;
                }
            }
        }

        //Update the input matrix by looping through the input matrix and checking for the positional values in updateRows and updateCols
        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j < cols; ++j) {
                if (updateRows[i] == 0 || updateCols[j] == 0) {
                    input[i][j] = 0;    //Modifies the element in Matrix to 0
                }
            }
        }

        //Returns modified matrix
        return input;
    }
}
