import java.util.Arrays;
import java.util.Scanner;
public class tut2_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        sc.nextLine();
        int[] nums = new int[count];

        for(int i=0;i<count;i++)
        {
            nums[i]=sc.nextInt();
        }
        Arrays.sort(nums);
        int result=0;
        for(int i=0;i<count;i=i+2)
        {
            result+=nums[i];
        }
        System.out.println("max_sum: "+result );
    }
}
