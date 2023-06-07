package lr6.task3;

import java.text.DecimalFormat;

public class Report extends Employee{
    static Employee[] emp;
    public Report(Employee[] emp){
        this.emp=emp;

    }
    public static void generateReport()
    {
        for(int i =0; i< emp.length; i++)
        {
            format(i);
        }
    }
    public static void format(int i ){
        String form = new DecimalFormat("#0.00").format(emp[i].salary);
        System.out.printf("%-15s %15s %n",emp[i].fullname,form);
    }
}