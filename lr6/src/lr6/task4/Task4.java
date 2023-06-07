package lr6.task4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {
    public static void main(String[] args){
        String str="aeea aea axa axxa axxxa";
        Pattern p = Pattern.compile("a[e||x]+a");
        Matcher matcher = p.matcher(str);
        while(matcher.find()){
            System.out.println(str.substring(matcher.start(), matcher.end()));
        }
    }
}
