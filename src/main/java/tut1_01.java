import java.util.Scanner;

public class tut1_01 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] inputs = input.split(" ");
        int result = 0;
        int idx1=0;
        int idx2=0;
        int size = inputs[0].length();
        boolean isMatch=false;
        int count=0;
        while(count<size)
        {
            if(inputs[0].charAt(idx1)==inputs[1].charAt(idx2))
            {
                idx1++;
                idx2++;
                isMatch=true;
                count++;
            } else if (isMatch) {
                result=-1;
                break;
            }
            else
            {
                idx1++;
                result++;
            }
            if(idx1==size && idx2==0)
                break;
            idx1=idx1 % size;
            idx2=idx2 % size;
        }
        if(count==size)
            System.out.println(result);
        else
            System.out.println(-1);

    }
}
