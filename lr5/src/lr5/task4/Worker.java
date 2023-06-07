package lr5.task4;

public abstract class Worker {
    protected String name;
    public String getName(){return name;}
    protected double stavka;
    public Worker(String name,double stavka){
        this.name=name;
        this.stavka=stavka;
    }
    abstract public void info();
    abstract public double zp();
}
