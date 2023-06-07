package lr5.task4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void sort(List<Worker> workers){
        boolean b = true;
        while(b==true) {
            b=false;
            for(int i = 0;i<workers.size()-1;i++){
                if(workers.get(i).zp()<workers.get(i+1).zp()){
                    Worker buf = workers.get(i);
                    workers.set(i, workers.get(i+1));
                    workers.set(i+1, buf);
                    b=true;
                }else if((workers.get(i).zp()==workers.get(i+1).zp()) && (workers.get(i).getName()).compareTo(workers.get(i+1).getName()) > 0){
                    Worker buf = workers.get(i);
                    workers.set(i, workers.get(i+1));
                    workers.set(i+1, buf);
                    b=true;
                }
            }
        }
    }
    public static int identificator(Worker w){
        return (int) (w.zp()+ (int)w.getName().charAt(0)+(int)w.getName().charAt(1));
    }
    public static void main(String[] args) {
        Worker p = new FixWorker("имя1",5);
        Worker f = new HourWorker("имя2",800);
        Worker f2 = new FixWorker("имя3",800);
        Worker p2 = new HourWorker("имя4",6);
        Worker f3 = new FixWorker("имя5",900);
        Worker p3 = new HourWorker("имя6",6);
        List<Worker> workers = new ArrayList<>();
        workers.add(p);
        workers.add(f);
        workers.add(f2);
        workers.add(p2);
        workers.add(f3);
        workers.add(p3);
        sort(workers);
        for(int i = 0;i<6;i++){
            System.out.println(workers.get(i).getName()+" ЗП: "+workers.get(i).zp());
        }
        System.out.println();
        for(int i = workers.size()-1;i> workers.size()-4;i--){
            System.out.println(workers.get(i).getName()+" ID: "+identificator(workers.get(i)));
        }
    }
}
