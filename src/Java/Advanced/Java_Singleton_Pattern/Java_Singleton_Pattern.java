package Java.Advanced.Java_Singleton_Pattern;


public class Java_Singleton_Pattern {

}
class Singleton{
    public String str;
    private static Singleton instance = new Singleton();
    private Singleton(){

    }
    public static Singleton getSingleInstance(){
        return instance;
    }

}
