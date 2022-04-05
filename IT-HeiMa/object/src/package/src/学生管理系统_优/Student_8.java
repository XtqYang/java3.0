package 学生管理系统_优;
/*
    快捷键
    alt+ins 构造方法
*/
    /* 学生类 */
    public class Student_8 {
        //学号
        private String sid;
        //姓名
        private String name;
        //年龄
        private String age;
        //居住地
        private String address;
        //无参构造方法

        public Student_8() {
        }

        public Student_8(String sid, String name, String age, String address) {
            this.sid = sid;
            this.name = name;
            this.age = age;
            this.address = address;
        }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
