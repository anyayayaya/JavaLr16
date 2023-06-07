package lr6.task2;

public class Task2 {
    public static void main(String[] args) {
        String[] str1 = new String[]{"string","code","Practice"};
        for(int i =0; i <str1.length; i++)
        {
            if(str1.length%2==0)
            {
                String str2=str1[i].substring(str1[i].length()/2-1,str1[i].length()/2+1);
                System.out.println("изначально: "+str1[i]+"   получившееся: "+str2);
            }
            else {System.out.println("сторока нечетная");}
        }
    }
}
