public class Hello {
    public static void main(String[] args){
        Person myperson = new Person("Anya", "Solomennikova", 56, 17, 165);
        myperson.Char();
        myperson.eat();
        myperson.sleep();
        String say = myperson.speak("hi, hello");
        System.out.println(say);
        String profession = myperson.work("я работаю");
        System.out.println(profession);
        String cats = myperson.hobby("I really like ");
        System.out.println(cats);
    }
}
