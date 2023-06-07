package lr5.task3;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Task3<T> {
    public static void entrySet(Map<String,Pet> pets){
        Collection c = pets.keySet();
        var a = c.toArray();
        for(int i=0;i<pets.size();i++){
            System.out.println(a[i].toString());
            pets.get(a[i]).info();}
    }
    public static void main(String[] args){
        Map pets = new HashMap<String,Pet>();
        Pet p1 = new Cat("имя1","какой-то");
        pets.put(p1.getName(),p1);
        Pet p2 = new Dog("имя2","порода какая-то");
        pets.put(p2.getName(),p2);
        Pet p3 = new Cat("имя3","какой-то2");
        pets.put(p3.getName(),p3);
        Pet p4 = new Parrot("имя4","очень маленький");
        pets.put(p4.getName(),p4);
        System.out.println(pets.keySet());
        entrySet(pets);
    }
}
