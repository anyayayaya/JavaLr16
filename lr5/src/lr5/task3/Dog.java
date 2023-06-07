package lr5.task3;

public class Dog extends Pet{
    private String poroda;
    public Dog(String name,String poroda) {
        super(name);
        this.poroda=poroda;
    }
    public void info(){
        System.out.println("Собака: "+name+" "+poroda);
    }
}
