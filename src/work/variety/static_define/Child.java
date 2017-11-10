package work.variety.static_define;

public class Child extends Super{

    static {
        System.out.println("this is child static code");
    }

    public Child() {
        System.out.println("this is child constructor");
    }

    public static void main(String[] args) {
        System.out.println("super param==>" + super_param);

        ArrayChild[] array = new ArrayChild[10];
        System.out.println(array.length);

        try {
            System.out.println(Class.forName("work.variety.static_define.ArrayChild").getClassLoader());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
