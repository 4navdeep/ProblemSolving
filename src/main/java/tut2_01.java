import java.util.Arrays;
import java.util.Scanner;
enum map{
    a('a'),b('b'),c('c'),d('d'),e('e');

    public char asChar() {
        return asChar;
    }
    private final char asChar;
    map(char asChar) {
        this.asChar = asChar;
    }
}
public class tut2_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int length = sc.nextInt();
        sc.nextLine();
        String[] inputs = new String[count];
        for(int i=0;i<count;i++)
        {
            inputs[i]=sc.nextLine();
        }
        int min=0;
        String result="";
        for(int i=0;i<length;i++)
        {
            int[] letterCount = new int[5];
            Arrays.fill(letterCount,0);
            for(String input:inputs)
            {
                for(map m : map.values())
                {
                    if(input.charAt(i)==m.asChar())
                    {
                        letterCount[m.ordinal()]++;
                    }
                }
            }
            int idx=0;
            for(int j=0;j<5;j++)
            {
                if(letterCount[j]>letterCount[idx]){
                    idx=j;
                }
            }
            result = result + map.values()[idx].toString();
            min+= count - letterCount[idx];
        }
        System.out.println(result);
        System.out.println(min);
    }
}
