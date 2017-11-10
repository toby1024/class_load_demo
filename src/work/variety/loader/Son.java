package work.variety.loader;

public class Son extends Father implements IFather{
//    public static final String flag = "son";

    static {
        System.out.println("this is child class");
    }

    public static void main(String[] args) {
        System.out.println(flag);
        System.out.println("this is son main method");
    }
}
