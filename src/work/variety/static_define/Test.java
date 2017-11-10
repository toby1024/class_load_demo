package work.variety.static_define;

public class Test {

    static {
        System.out.println("this is a test");
//        a = 456;
//        System.out.println(a);
    }

    static int a = 123;

    public static void main(String[] args) {
        System.out.println("a---->" + a);
    }
}
