package lr5.task3;

public class Cat extends Pet{
    private String color;
    public Cat(String name,String color) {
        super(name);
        this.color=color;
    }

    public void info(){
        System.out.println("Кот: "+name+" "+color);
    }
}
