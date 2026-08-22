import java.util.Scanner;

public class TwoDArrayInput
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int rows, cols;
        System.out.print("Enter number of rows: ");
        rows = sc.nextInt();              // how many rows the grid has

        System.out.print("Enter number of columns: ");
        cols = sc.nextInt();              // how many columns the grid has

        int[][] arr = new int[rows][cols]; // create the grid: rows x cols boxes

        // OUTER loop walks down each row
        for (int i = 0; i < rows; i++)
        {
            // INNER loop walks across each column, within that row
            for (int j = 0; j < cols; j++)
            {
                System.out.print("Enter element [" + i + "][" + j + "]: ");
                arr[i][j] = sc.nextInt();  // store the number at row i, column j
            }
        }

        // Print the grid back out
        System.out.println("\nArray elements:");
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();          // move to next line after finishing a row
        }
    }
}