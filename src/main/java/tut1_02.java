import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class tut1_02 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] a1;
        String[] a2;
        sc.nextLine();  // to consider enter after reading int
        String input = sc.nextLine();
        String input2 = sc.nextLine();
        a1 = input.split(" ");
        a2 = input2.split(" ");

        int count=0,matchCount=0;
        ArrayList<Integer> indicees = new ArrayList<>();

        for(int i=0;i<n;i++)
        {
            if(!Objects.equals(a1[i], a2[i]))
            {
                count++;
                indicees.add(i);
            }
            else
            {
                matchCount++;
            }
        } if(count==2 && Objects.equals(a1[indicees.get(0)], a2[indicees.get(1)]) && Objects.equals(a2[indicees.get(0)], a1[indicees.get(1)]))
            System.out.println("YES");
        else if(matchCount==n)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
