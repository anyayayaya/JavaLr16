package lr6.task3;

public class Task3 {
    public static void main(String[] args){
        Employee[] emp = new Employee[3];
        emp[0]=new Employee("фамилия1", 234.83456);
        emp[1]=new Employee("фамилия2", 289.74765);
        emp[2]=new Employee("фамилия3", 567.5678);
        Report bjct = new Report(emp);
        bjct.generateReport();

    }
}
