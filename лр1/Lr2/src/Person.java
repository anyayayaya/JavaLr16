public class Person {
    private double weight; //вес
    private String name;
    private String surname;
    private double hight;
    private double age;
    public void eat(){
        System.out.print("Eating: num-num-num\n");
    }
    public void sleep() {
        System.out.print("Sleeping: Hsch-Hsch-Hsch\n");
    }
    public String speak(String words){
        String pharse=words+"everybody\n";
        return pharse;
    }
    public String work(String activity){
        String action=activity+"web-designer\n";
        return action;
    }
    public String hobby(String interest){
        String passion=interest+"cats\n";
        return passion;
    }
}
