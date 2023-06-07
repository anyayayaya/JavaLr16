package lr5.task1;

public class Goods {
    private String  name;
    public String getName( ){
        return name;
    }
    private int price;
    public int getPrice( ){
        return price;
    }
    public Goods(String name,int price){
        this.name=name;
        this.price=price;
    }
    public void info(){
        System.out.println("Name - "+name+"\nPrice - "+price);
    }
}
