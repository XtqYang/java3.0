package 状态修饰符.static修饰符.static访问特点;

public class student {
    //非静态成员变量
    public String name = "林青霞";
    //静态成员变量
    private static String university = "共同大学";


    //非静态成员方法
    public void show1() {
    }

    //非静态成员方法  可以访问所有的静态和非静态成员
    public void show2() {
        System.out.println(name);
        System.out.println(university);
        show1();
        show3();
    }

    //静态成员方法
    public static void show3() {
    }

    //静态成员方法  只能访问静态的成员变量和静态的成员方法
    public static void show4() {
//        System.out.println(name);
        System.out.println(university);
//        show1();
        show3();
    }

}

//总结
//静态成员方法只能访问静态成员