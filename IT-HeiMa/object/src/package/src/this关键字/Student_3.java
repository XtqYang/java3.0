package this关键字;

// 学生类
public class Student_3 {
    //成员变量
    private String name;
    private int age;

    //get/set方法
//    public void setName(String n) {
//        name = n;
//    }
    public void setName(String name) {
//        name = name;
        //局部变量 指代 成员变量用this修饰
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public void setAge(int age) {
       this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void show() {
        System.out.println(name + "," + age);
    }

}
