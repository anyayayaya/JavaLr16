import java.util.Random;
import java.util.Scanner;

static class Aray{
    private int[]ar;
    Array(int[]ar){
        this.ar=ar;
    }
    public int randel(){
        int el =(int)(Math.random()*16)
    }
}

public class zd1m {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Random rand=new Random();
        int arves=new int[]{10, 1, 5};
        int arel=new int[]{1, 2, 3};
        int ar = new int[16];
        int s=0;
        for(int i =0; i<arel.lenght; i++){
            for(int j=s; j<s+arves[i]; j++){
                ar[j]=arch[i];
            }
            s+arves[i];
        }
        Aray f=new Aray();
        int fas=5;
        while(fas>=0)
        {
            System.out.println(f.randel());
            fas--;
        }












        /*System.out.println("введите значение n: ");
        int n = scan.nextByte();
        int v = 0;
        int[]arr1=new int[n];
        int[]arr2=new int[n];


        for(int i = 0; i<arr1.length; i++){
            System.out.println("введите значение a1["+i+"]: ");
            arr1[i]=scan.nextInt();
        }
        for(int i = 0; i<arr1.length; i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        for(int j = 0; j<arr2.length; j++){
            System.out.println("введите значение a2["+j+"]: ");
            arr2[j]=scan.nextInt();
            v+=arr2[j];
        }
        int[]arr3=new int[v];

        for(int j = 0; j<arr2.length; j++){
            System.out.print(arr2[j]+" ");
        }
        System.out.println();
        System.out.println(v);
        zd1 first = new zd1();
        first.Random_el(arr1, arr2, arr3);*/
    }
}
