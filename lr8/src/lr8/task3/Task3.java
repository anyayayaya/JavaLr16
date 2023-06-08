package lr8.task3;

import java.io.*;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        File f = new File("f.txt");
        f.createNewFile();
        File f1 = new File("g.txt");
        f1.createNewFile();
        File f2 = new File("h.txt");
        f2.createNewFile();
        OutputStream vvod = new FileOutputStream(f.getPath());
        for(int i=0;i<10;i++){
            System.out.print("Введите цифру "+i+": ");
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
        vvod = new FileOutputStream(f1.getPath());
        OutputStream vvod2 = new FileOutputStream(f2.getPath());
        for(int i=0;i<s1.length;i++){
            if(Integer.parseInt(s1[i])%2==0){
                vvod.write(s1[i].getBytes());
                vvod.write(" ".getBytes());
            }else{
                vvod2.write(s1[i].getBytes());
                vvod2.write(" ".getBytes());
            }
        }
    }
}
