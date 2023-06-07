package lr5.task1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class Product {
    public String name;

    public Product() {
    }

    public Product(String name) {
        this.name = name;
    }

    public static void entrySet(HashMap<String, Goods> m) {
        Collection c = m.keySet();
        var a = c.toArray();
        for (int i = 0; i < m.size(); i++) {
            System.out.println(a[i].toString() + "\n");
            m.get(a[i]).info();
            System.out.println();
        }
    }

    public static void keySet(HashMap<String, Goods> m) {
        Collection c = m.keySet();
        var a = c.toArray();
        for (int i = 0; i < m.size(); i++) {
            System.out.println(a[i].toString());
        }
    }

    public static void values(HashMap<String, Goods> m) {
        Collection c = m.keySet();
        var a = c.toArray();
        for (int i = 0; i < m.size(); i++) {
            m.get(a[i]).info();
            System.out.println();
        }
    }
    public static void main(String[] args){
        HashMap<String, Goods> map = new HashMap<>();
        Goods p1 = new Goods("конкретная игрушка1", 234);
        map.put("игрушка1", p1);
        Goods p2 = new Goods("конкретная игрушка2", 345);
        map.put("игрушка2", p2);
        Goods p3 = new Goods("конкретная игрушка3", 3456);
        map.put("игрушка3",p3);
        System.out.println("ENTYSET: ");
        entrySet(map);
        System.out.println("KEYSET: ");
        keySet(map);
        System.out.println("VALUES: ");
        values(map);
    }
}

