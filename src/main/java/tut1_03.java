import java.util.Scanner;

public class tut1_03 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] a1;
        sc.nextLine();  // to consider enter after reading int
        String input = sc.nextLine();
        String input2 = sc.nextLine();
        a1 = input.split(" ");
        int lbound = Integer.parseInt(input2.split(" ")[0]);
        int ubound = Integer.parseInt(input2.split(" ")[1]);
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int sum =(Integer.parseInt(a1[i])+Integer.parseInt(a1[j]));
                if(sum<=ubound && sum>=lbound)
                {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
