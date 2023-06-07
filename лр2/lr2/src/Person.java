public class Person {
    private double weight;
    private double age;
    private double hight;
    private String name;
    private String Surname;

    Person(String name1, String Surname1, double weight1, double age1, double hight1)
    {
        name = name1;
        Surname = Surname1;
        weight= weight1;
        age =age1;
        hight= hight1;
    }

    public void Char(){
        System.out.println(name);
        System.out.println(Surname);
        System.out.println(weight+" кг");
        System.out.println(age+" лет");
        System.out.println(hight+" см");
    }
    public void eat(){
        System.out.println("лублу покушать");
    }
    public void sleep(){
        System.out.println("люблю спать, а спать любит меня");
    }
    public String speak(String word){
        String pharse = word+" everybody";
        return pharse;
    }
    public String work(String action){
        String activity = action+" веб-дезигнер";
        return activity;
    }
    public String hobby(String interests){
        String passion = interests+" cats";
        return passion;
    }
}
