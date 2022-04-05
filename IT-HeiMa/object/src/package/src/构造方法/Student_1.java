package 构造方法;

//学生类
public class Student_1 {
    public int getAge;
    private String name;
    private int age;

    //    构造方法
//    public Student(){
//        System.out.println("无参构造方法");
//    }
    public Student_1() {
    }

    ;

    public Student_1(String name) {
        this.name = name;
    }

    public Student_1(int age) {
        this.age = age;
    }

    public Student_1(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public void show() {
        System.out.println(name + "," + age);
    }

    public String getName() {
        return name;
    }

}
