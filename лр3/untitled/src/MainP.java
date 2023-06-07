public class MainP {
    public static void main(String[] args) {
        Cfr person = new Cfr();
        person.setString("Anya");
        person.setSSn("Solomennikova");
        person.setA(17);
        person.setH(165.3);

        System.out.println("My name: "+person.getString());
        System.out.println("My surname: "+person.getSSn());
        System.out.println("My age: "+person.getA());
        System.out.println("My hight: "+person.getH());

        Activity personAct = new Activity();
        personAct.setString("Anya");
        personAct.setAct(" is a ux/ui designer");
        System.out.println(personAct.getString()+personAct.getAct());
    }
}
class Fio{
    private String name;
    public String surname;
    public Fio(){}
    public Fio(String name1, String surname1){
        name=name1;
        surname =surname1;
    }
    public String getString()
    {
        return name;
    }
    public void setString(String newValue)
    {
        name = newValue;
    }
    public String getSSn()
    {
        return surname;
    }
    public void setSSn(String newValue)
    {
        surname = newValue;
    }
    public void show(){
        System.out.print(name);
        System.out.print(surname);
    }
}

class Cfr extends Fio{
    public int age;
    public double hight;
    public Cfr(){}
    public Cfr(int age1, int hight1, String name, String surname)
    {
        super(name, surname);
        age=age1;
        hight=hight1;

    }
    public void show(){
        super.show();
    }
    public int getA()
    {
        return age;
    }
    public void setA(int newValue)
    {
        age = newValue;
    }
    public double getH()
    {
        return hight;
    }
    public void setH(double newValue)
    {
        hight = newValue;
    }

}

class Activity extends Fio{
    public String act;
    public Activity(){}
    public Activity(String act1, String name, String surname)
    {
        super(name, surname);
        act = act1;
    }

    public String getAct(){return act;}
    public void setAct(String newValue){act = newValue;}
}
