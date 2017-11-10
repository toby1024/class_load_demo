package work.variety.static_define;

import sun.reflect.Reflection;

import java.util.HashMap;

public class Test2 {
//    static int a = 1;

    static {
        System.out.println("this is test1");
    }

    public static void main(String[] args) {
        System.out.println("--->");
        System.out.println(Test3.b);

//        System.out.println(new Test3());

        System.out.println(Test3.b);


        System.out.println(Test3.class);
        try {
            System.out.println(Class.forName("work.variety.static_define.Test3", false, Test2.class.getClassLoader()).getMethods());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

class Test3 {
    static {
        System.out.println("this is test 3");
    }

    public final static int b = 4;

    public Test3() {
        System.out.println("this is test3 constructor");
    }
}