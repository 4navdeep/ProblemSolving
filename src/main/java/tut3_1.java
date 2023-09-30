import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class tut3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] inputs = input.split(",");
        HashMap<String,Integer> map  = new HashMap<>();
        for(String inp:inputs)
        {
            String prefix="";
            for(int i=0;i<inp.length();i++)
            {
                prefix=prefix.concat(String.valueOf(inp.charAt(i)));
                if(map.containsKey(prefix))
                {
                    map.put(prefix, map.get(prefix)+1);
                }
                else
                {
                    map.put(prefix,1);
                }
            }
        }
        int result =0;
        for(Map.Entry<String,Integer> val: map.entrySet())
        {
            if(val.getValue()>1)
                result+= val.getValue();
        }
        for(String inp:inputs)
        {
            if(map.get(inp)==1)
                result++;
        }
        System.out.println(result);
    }
}
