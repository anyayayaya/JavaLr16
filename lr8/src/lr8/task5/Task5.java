package lr8.task5;

import java.io.*;
import java.nio.file.FileVisitResult;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        File f = new File("task5.txt");
        f.createNewFile();
        OutputStream vvod = new FileOutputStream(f.getPath());
        for(int i=0;i<10;i++){
            System.out.print("Введите цифру: "+i+" ");
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
        int sum = 0;
        for(int i=0;i<s1.length;i++){
            if(Integer.parseInt(s1[i])>0){
                sum++;
            }
        }
        System.out.print("\nПоложительные: "+sum);
    }
}
