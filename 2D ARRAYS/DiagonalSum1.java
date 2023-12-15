public class DiagonalSum1 //O(n^2)
{
    public static int diagonalsum(int matrix[][])
    {
        int sum = 0;

        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[0].length; j++)
            {
                if(i==j)
                sum+=matrix[i][j];
                else if(i+j==matrix.length-1) 
                //else if to avoid middle element added twice 
                sum+=matrix[i][j];
            }
        }

        return sum;
    }

    public static void main(String[] args)
    {
        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println(diagonalsum(matrix));
    }
}