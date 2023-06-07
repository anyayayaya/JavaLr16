package lr5.task3;

public class Parrot extends Pet{
    private String ves;
    public Parrot(String name,String ves) {
        super(name);
        this.ves=ves;
    }
    public void info(){
        System.out.println("Хомяк: "+name+" вес: "+ves);
    }
}
