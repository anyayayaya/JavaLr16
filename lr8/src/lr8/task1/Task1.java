package lr8.task1;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.FileNameMap;
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        File file= new File("about");
        try(FileReader reader = new FileReader("about.txt"))
        {
            System.out.println(file.getName());
            char[] buf = new char[256];
            int c;
            while((c = reader.read(buf))>0){

                if(c < 256){
                    buf = Arrays.copyOf(buf, c);
                }
                System.out.print(buf);
            }
            reader.close();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}
