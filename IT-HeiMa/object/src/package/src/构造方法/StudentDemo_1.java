package 构造方法;
//测试类
public class StudentDemo_1 {
    public static void main(String[] args) {
        //创建对象
        Student_1 s = new Student_1();
        s.show();

        Student_1 s2 = new Student_1("黄洋");
        s2.show();

        Student_1 s3 = new Student_1(19);
        s3.show();

        Student_1 s4 = new Student_1("黄洋",19);
        s4.show();


    }
}
