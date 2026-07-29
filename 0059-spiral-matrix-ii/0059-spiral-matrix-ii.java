class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int stRow=0, endRow=n-1, stCol=0, endCol=n-1;
        int num = 1;

        while (stRow <= endRow && stCol <= endCol) {
            // TOP -> left to right
            for (int i = stCol; i <= endCol; i++)
                matrix[stRow][i] = num++;
            stRow++;

            // RIGHT -> top to bottom
            for (int i = stRow; i <= endRow; i++)
                matrix[i][endCol] = num++;
            endCol--;

            // BOTTOM -> right to left
            for (int i = endCol; i >= stCol; i--)
                matrix[endRow][i] = num++;
            endRow--;

            // LEFT -> bottom to top
            for (int i = endRow; i >= stRow; i--)
                matrix[i][stCol] = num++;
            stCol++;
        }
        return matrix;
    }
}