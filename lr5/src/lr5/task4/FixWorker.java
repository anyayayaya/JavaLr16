package lr5.task4;

public class FixWorker extends Worker{
    public FixWorker(String name,double stavka){
        super(name,stavka);
    }

    @Override
    public void info() {
        System.out.println("С Фиксированной ЗП "+name+" ЗП: "+stavka);
    }
    public double zp(){
        return stavka;
    }
}
