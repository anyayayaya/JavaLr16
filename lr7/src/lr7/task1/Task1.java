package lr7.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void udalit( List<Students> students){
        for(int i=0;i<students.size();i++){
            if(students.get(i).SrBal()<3){

                students.get(i).info();
                students.remove(i);
                i--;
            }else{
                students.get(i).setKurs((students.get(i).getKurs())+1);
            }
        }
    }
    public static void printStudents(List<Students> students, int course){
        for(int i=0;i<students.size();i++){
            if(students.get(i).getKurs()==course){
                students.get(i).info();
            }
        }
    }
    public static int[] massiv() throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите оценоку");
        int n = in.nextInt();
        if(n<=0){
            throw new Exception("что-то пошло не так, возможно оценка меньше нуля");
        }
        int[] n1 = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Индекс: "+i);
            n1[i]=in.nextInt();
        }
        return n1;
    }
    public static void main(String[] args) {
        try{
            List<Students> students = new ArrayList<>();
            System.out.println("Оценки 1-го студента");
            int[] s1 = massiv();
            System.out.println("Оценки 2-го студента");
            int[] s2 = massiv();
            System.out.println("Оценки 3-го студента");
            int[] s3 = massiv();
            students.add(new Students("фамилия1","T-093",3,s1));
            students.add(new Students("фамилия2","T-093",3,s2));
            students.add(new Students("фамилия3","T-093",3,s3));
            students.add(new Students("фамилия4","T-093",3,new int[]{9,10,7,6,6,6,4,4,6,5}));
            students.add(new Students("фамилия5","T-192",2,new int[]{3,3,3,3,3,3,3,3,3,3,3}));
            System.out.println("Отчислен: ");
            udalit(students);
            System.out.println("3 курс\n");
            printStudents(students,3);
            System.out.println("\n4 курс\n");
            printStudents(students,4);
        }catch(Exception e){
            System.out.println("Error: "+e);

        }
    }
}
