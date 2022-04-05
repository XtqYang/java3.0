package API练习.基本类型包装类;

public class int和String的互换 {
    public static void main(String[] args) {
        //int -- String
        int number = 100;
        //方式1
/*      String s1 = "" + number;
        System.out.println(s1);*/
        //方式2--专业
        String s2 = String.valueOf(number);
        System.out.println(s2);

        //String --- int
        String s = "100";
        //方式1
/*      Integer i = Integer.valueOf(s);
        int x = i.intValue();
        System.out.println(x);*/
        //方式2 -- 专业
        int y = Integer.parseInt(s);
        System.out.println(y);


    }
}
