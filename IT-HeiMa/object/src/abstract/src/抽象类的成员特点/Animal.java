package 抽象类的成员特点;

public abstract class Animal {
    private  int age = 20;//变量
    private final String city = "北京";//常量

    public Animal(){}
    public Animal(int age) {
        this.age = age;
    }

    public void show(){
        age = 40;
        System.out.println(age);
//        city = "成都";被final修饰不能再更改
        System.out.println(city);
    }
    public abstract void eat();//限定子类必须做某些事情
}
