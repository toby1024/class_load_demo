package work.variety.static_define;

public class Super {

    public static int super_param = 1;

    static {
        System.out.println("this is super static code");
    }

    public Super() {
        System.out.println("this is super constructor");
    }
}
