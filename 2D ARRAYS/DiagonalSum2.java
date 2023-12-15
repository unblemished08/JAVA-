public class DiagonalSum2 //O(n)
{
    public static int diagonalsum(int matrix[][])
    {
        int sum = 0;

        for (int i = 0; i < matrix.length; i++)
        {
            //primary diagonal
            sum+=matrix[i][i];
            //secondary diagonal
            if(i!=matrix.length-1-i) //j=matrix.length-1-i
            //if to avoid middle element added twice 
            sum+=matrix[i][matrix.length-1-i];
        }
        return sum;
    }

    public static void main(String[] args)
    {
        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println(diagonalsum(matrix));
    }
}