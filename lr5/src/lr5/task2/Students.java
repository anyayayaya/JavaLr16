package lr5.task2;

public class Students {
    private String name;
    private String gruppa;
    private int kurs;
    public int getKurs(){return kurs;}
    public void setKurs(int n){kurs = n;}
    private int[] marks;
    public Students(String name,String gruppa,int kurs,int[] ocenki){
        this.name=name;
        this.gruppa = gruppa;
        this.kurs=kurs;
        this.marks=ocenki;
    }
    public void info(){
        System.out.println("\nФмилия: "+name+"\nГруппа: "+gruppa+"\nКурс: "+kurs+"\nСр балл: "+SrBal()+"\n");
    }
    public double SrBal() {
        double sr=0;
        for (int i = 0; i < marks.length; i++) {
            sr+=marks[i];
        }
        sr=sr/marks.length;
        return sr;
    }

}
