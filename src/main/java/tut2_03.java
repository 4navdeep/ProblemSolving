import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class tut2_03 {
    private static double getDistance(String a, String b)
    {
        double a1 = Double.parseDouble(a.split(" ")[0]);
        double a2 = Double.parseDouble(a.split(" ")[1]);
        double b1 = Double.parseDouble(b.split(" ")[0]);
        double b2 = Double.parseDouble(b.split(" ")[1]);
        return Math.sqrt(((b1-a1)*(b1-a1))+((b2-a2)*(b2-a2)));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] corners = new String[4];
        for(int i=0;i<4;i++)
        {
            corners[i]=sc.nextLine();
        }
        double[] dist = new double[6];
        int idx=0;
        for (int i=0;i<4;i++)
        {
            for(int j=i+1;j<4;j++)
            {
                dist[idx++]= getDistance(corners[i],corners[j]);
            }
        }
        Arrays.sort(dist);
        if(
                Objects.equals(dist[0], dist[1]) &&
                Objects.equals(dist[1], dist[2]) &&
                Objects.equals(dist[2], dist[3]) &&
                Objects.equals(dist[4], dist[5]))
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
}
