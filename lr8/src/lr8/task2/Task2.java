package lr8.task2;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        File f = new File("task2.txt");
        try(OutputStream put = new FileOutputStream(f.getPath()))
        {
            for(int i=0;i<10;i++){
                System.out.print("Введите цифру "+i+": ");
                String n = in.next();
                put.write(n.getBytes());
                put.write(" ".getBytes());
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
        /*File f = new File("task2.txt");
        f.createNewFile();
        OutputStream put = new FileOutputStream(f.getPath());
        for(int i=0;i<10;i++){
            System.out.print("Введите цифру "+i+": ");
            String n = in.next();
            put.write(n.getBytes());
            put.write(" ".getBytes());
        }*/
        //put.close();
        InputStream output = new FileInputStream(f.getPath());
        byte[] b = output.readAllBytes();
        String s="";
        for(int i=0;i<b.length;i++){
            s+=(char)b[i];
            System.out.print((char)b[i]);
        }
        var s1 = s.split(" ");
        double sum = 0;
        for(int i=0;i<s1.length;i++){
            sum = sum + Integer.parseInt(s1[i]);
        }
        System.out.print("\nсреднее: "+sum/s1.length);
        output.close();
    }
}
