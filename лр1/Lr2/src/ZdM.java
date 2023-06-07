import java.util.Scanner;

public class ZdM {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        Zdzd zd = new Zdzd();
        System.out.println("Введите размер массива:");
        int n = in.nextInt();
        int[] arr = zd.Zad1_MakeArr(n);
        zd.Zad1_PrintArr(arr);
        System.out.println();
        int[] brr = zd.Zad1_MakeArr(n);
        zd.Zad1_PrintArr(brr);
    }
}
