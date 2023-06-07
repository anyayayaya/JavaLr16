public class Hello {
    public static void main (String[] args){
        Person mypeeson = new Person();
        mypeeson.eat();
        mypeeson.sleep();
        String say = mypeeson.speak("Hi hello ");
        System.out.print(say);
        String doit = mypeeson.work("My profession is a ");
        System.out.print(doit);
        String interest = mypeeson.hobby("I really like ");
        System.out.print(interest);
    }
}
