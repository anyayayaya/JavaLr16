package lr5.task4;

public class HourWorker extends Worker{
    public HourWorker(String name,double stavka){
        super(name,stavka);
    }

    @Override
    public void info() {
        System.out.println("Часовой "+name+" ЗП: "+zp());
    }
    public double zp(){
        return 20.8*8*stavka;
    }
}
