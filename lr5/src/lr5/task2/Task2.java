package lr5.task2;

import java.util.*;

public class Task2 {
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
    public static void main(String[] args) {
        List<Students> students = new ArrayList<>();
        students.add(new Students("фамилия1","группа1",3,new int[]{2,2,2,2,4,3,2,3,4,2,2}));
        students.add(new Students("фамилия2","группа2",3,new int[]{9,8,10,7,8,6,6,8,9,9,0,7}));
        students.add(new Students("фамилия3","группа3",3,new int[]{5,8,7,2,6,3,10,9,4,6,3}));
        System.out.println("Отчислен: ");
        udalit(students);
        /*System.out.println("3 курс\n");
        printStudents(students,3);*/
        System.out.println("\n4 курс\n");
        printStudents(students,4);
    }
}
