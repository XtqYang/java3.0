package 基础知识练习;

public class 逢七过 {
    public static void main(String[] args) {
        for (int i=1;i<=100;i++){
            if (i % 7 ==0||i % 10==7||i/10%10==7){
                System.out.println(i);
            }
        }
    }
}
