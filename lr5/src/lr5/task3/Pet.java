package lr5.task3;

public class Pet {
    protected String name;
    public String getName(){return name;}
    public Pet(String name){
        this.name=name;
    }
    public void info(){
        System.out.println("\nЖивотное: "+name);
    }
}
