package 储存学生对象;

import 面向对象基础.标准类制作_优.Student;

import java.util.ArrayList;

public class StudentDemo_7 {
    public static void main(String[] args) {
//        创建集合对象
        ArrayList<Student> array = new ArrayList<>();
//        创建学生对象
        Student s1 = new Student("林青霞", 19);
        Student s2 = new Student("黄洋", 19);
        Student s3 = new Student("罗德尼", 34);
//        添加学生对象到集合中
        array.add(s1);
        array.add(s2);
        array.add(s3);
//        遍历集合
        for (int i = 0; i < array.size(); i++) {
            final Student s = array.get(i);
            System.out.println(s.getName() + "," + s.getAge());
        }
    }
}
