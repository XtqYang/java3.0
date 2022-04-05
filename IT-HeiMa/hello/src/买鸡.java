public class 买鸡 {
    public static void main(String[] args) {
        int a;//公鸡
        int b;//母鸡
        int c;//小鸡
        int i = 0;//只数
        for (a = 0; a < 30; a++) {
            c = 0;
            for (b = 0; b < 50; b++) {
                c++;
                if (5 * a + 3 * b + c == 100) {
                    i++;
                    System.out.println("第" + i + "种方案" + "公鸡 " + a + " 只 " + "母鸡 " + b + " 只 " + "小鸡 " + c + " 只 ");
                }
            }
        }
    }
}
