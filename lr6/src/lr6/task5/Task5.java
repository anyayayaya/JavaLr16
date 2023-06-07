package lr6.task5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task5 {
    public static void main(String[] args){
        String str = "Если есть хвосты по дз, начните с 1 не сданного задания. 123 324 111 4554 12321";
        Pattern pattern = Pattern.compile("\\d+");
        Matcher match = pattern.matcher(str);
        while(match.find()){
            char[]k=str.substring(match.start(),match.end()).toCharArray();
            boolean t =true;
            for(int i =0 ; i <k.length; i++)
            {
                if(k[i]!=k[k.length-1-i])
                {
                    t = false;
                    break;
                }
            }
            if(t){System.out.println(k);}
        }
    }
}
