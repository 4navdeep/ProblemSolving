import java.util.Scanner;

public class tut3_3 {
    static int min=Integer.MAX_VALUE;
    private  static void isDest(boolean[][] arr, int i,int j,int d0,int d1, int count, int direction)
    {
        if(i<0 || j<0 || i>=arr.length || j>=arr[0].length)
        {
            return;
        }
        if(arr[i][j])
            return;
        if(i==d0 && j==d1) {
            if (count < min) {
                min = count;
            }
            return;
        }
        System.out.println(i + " " +j + " " + count + " " + direction);
        arr[i][j]=true;
        int c1=0;
        int d2=0;

        if(direction==0) {
            c1 = 1;
            d2 = 1;
            isDest(arr,i+1,j+1,d0,d1,count+c1,1);
            isDest(arr,i-1,j+1,d0,d1,count+d2,2);
            isDest(arr,i-1,j-1,d0,d1,count+c1,1);
            isDest(arr,i+1,j-1,d0,d1,count+d2,2);
            return;
        }
        else if(direction==1) {
            c1=1;
        }
        else {
            d2 = 1;
        }
        isDest(arr,i+1,j+1,d0,d1,count+d2,(direction+d2)%2);
        isDest(arr,i-1,j+1,d0,d1,count+c1,(direction+c1)%2);
        isDest(arr,i-1,j-1,d0,d1,count+d2,(direction+d2)%2);
        isDest(arr,i+1,j-1,d0,d1,count+c1,(direction+c1)%2);
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        sc.nextLine();
        String source = sc.nextLine();
        String dest = sc.nextLine();
        int s0 = source.charAt(0) - 'A';
        int s1 = Integer.parseInt(String.valueOf(source.charAt(1)));
        int d0 = dest.charAt(0) - 'A';
        int d1 = Integer.parseInt(String.valueOf(dest.charAt(1)));
        isDest(new boolean[size][size], s0,s1,d0,d1,0,0);
        if(min!=Integer.MAX_VALUE)
        {
            System.out.println(min);
        }
        else
        {
            System.out.println(-1);
        }
    }
}
