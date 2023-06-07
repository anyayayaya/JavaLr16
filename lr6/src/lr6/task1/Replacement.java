package lr6.task1;

public class Replacement {
    Replacement(){}
    public void print(int a, int b){
        StringBuilder builder = new StringBuilder();
        builder.append(String.format("%d + %d = %d\n", a, b, a + b));
        builder.append(String.format("%d - %d = %d\n", a, b, a - b));
        builder.append(String.format("%d * %d = %d\n", a, b, a * b));
        System.out.println(builder.toString());
        System.out.println(builder.toString().replaceAll("=", "равно"));
    }
}
