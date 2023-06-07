import java.awt.*;
import java.util.Random;

public class zd1 {
    public void Random_el(int[]value, int[]value_weight, int[]result){
        Random rand=new Random();
        int s=0;

        for(int i =0;i<value.length; i++)
        {

            while(value_weight[i]>0)
            {
                result[s]=value[i];
                System.out.println(value_weight[i]--);
                s++;
            }
        }

        int n=rand.nextInt(1, s);
        System.out.println("Weight of value: "+result[n]);
    }
}
