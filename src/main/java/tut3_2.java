import java.util.Scanner;

public class tut3_2 {
    private  static boolean isPath(int[][] arr, int i,int j)
    {
        if(i<0 || j<0 || i>=arr.length || j>=arr[0].length || arr[i][j]==4 || arr[i][j]==-1)
        {
            return false;
        }
        if(arr[i][j]==2)
            return true;
        arr[i][j]=4;
        boolean result = (isPath(arr,i-1,j) || isPath(arr,i,j+1) || isPath(arr,i+1,j) || isPath(arr,i,j-1));

        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        sc.nextLine();
        int[][] arr = new int[rows][cols];
        for(int i = 0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                arr[i][j] = sc.nextInt();
            }
            if(i!= rows-1)
                sc.nextLine();
        }
        if(isPath(arr,0,0))
        {
            System.out.println("Found");
        }
        else
        {
            System.out.println("Not found");
        }
    }
}
