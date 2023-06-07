import java.util.Random;
import java.util.Scanner;

public class Zdzd {
    Scanner scan = new Scanner(System.in);
    public int[] Zad1_MakeArr(int n)
    {
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            System.out.println("Введите число:");
            arr[i] = scan.nextInt();
        }
        return arr;
    }

    public void Zad1_PrintArr(int[] arr){
        System.out.println("Ваш массив:");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public void Zad1_Rand(int[] arr, int[] brr){
        Random rand = new Random();
        int k = 0;
        System.out.println("\nРандомное число массива:");
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < brr[i]; j++){
                k++;
            }
        }
        int[] crr = new int[k];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < brr[i]; j++){
                crr[j] = arr[i];
                System.out.print(crr[j] + " ");
            }
        }
        int randomIndex = rand.nextInt(crr.length);
        System.out.println("\nРандомное число: " + crr[randomIndex]);
    }
}
