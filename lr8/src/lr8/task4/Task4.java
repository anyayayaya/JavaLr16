package lr8.task4;

import java.io.*;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        File f = new File("task4.txt");
        f.createNewFile();
        OutputStream vvod = new FileOutputStream(f.getPath());
        for(int i=0;i<15;i++){
            System.out.print("Введите цифру  "+i+": ");
            String n = in.next();
            vvod.write(n.getBytes());
            vvod.write(" ".getBytes());
        }
        vvod.close();
        InputStream vivod = new FileInputStream(f.getPath());
        byte[] b = vivod.readAllBytes();
        String s="";
        for(int i=0;i<b.length;i++){
            s+=(char)b[i];
            System.out.print((char)b[i]);
        }
        var s1 = s.split(" ");
        double sum = 0;
        for(int i=0;i<s1.length;i++){
            sum = sum + Double.parseDouble(s1[i]);
        }
        System.out.print("\nсреднее: "+sum/s1.length);
    }
}
