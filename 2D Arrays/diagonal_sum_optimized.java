public class diagonal_sum_optimized 
{
    public static int diagonalSum(int[][] matrix)
    {
        int sum = 0;
        int n = matrix.length;
        for(int i = 0; i < n; i++)
        {
            // Primary diagonal
            sum += matrix[i][i];
            // Secondary diagonal
            if (i != n - 1 - i) 
            {
                sum += matrix[i][n - 1 - i];    
            }
        }
        return sum;
    }
    
    public static void main(String[] args)
    {
        int[][] matrix1 = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        System.out.println("Diagonal sum: " + diagonalSum(matrix1));
    }
}