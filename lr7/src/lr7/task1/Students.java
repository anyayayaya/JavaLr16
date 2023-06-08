package lr7.task1;

public class Students {
    private String name;
    private String gruppa;
    private int kurs;
    public int getKurs(){return kurs;}
    public void setKurs(int n){kurs = n;}
    private int[] ocenki;
    public Students(String name,String gruppa,int kurs,int[] ocenki){
        this.name=name;
        this.gruppa = gruppa;
        this.kurs=kurs;
        this.ocenki=ocenki;
    }
    public void info(){
        System.out.println("\nИмя: "+name+"\nГруппа: "+gruppa+"\nКурс: "+kurs+"\nСр былл: "+SrBal()+"\n");
    }
    public double SrBal() {
        double sr=0;
        for (int i = 0; i < ocenki.length; i++) {
            sr+=ocenki[i];
        }
        sr=sr/ocenki.length;
        return sr;
    }
}
