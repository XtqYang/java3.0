package API练习.字符串中数据排序;

import java.util.Arrays;

public class IntegerTest {
    public static void main(String[] args) {
        String s = "32 43 65 65 40";
        //把字符串中的数字数据储存到一个int类型的数组中
        String[] strArray = s.split("");
        for (int i = 0; i < strArray.length; i++) {
            System.out.print(strArray[i]);
        }
        System.out.println();
        int[] arr = new int[strArray.length];
        for (int i = 0; i < arr.length; i++) {
            System.out.print(strArray[i]);
        }
        Arrays.sort(arr);//排序
        //采用StringBuilder拼接字符串
        System.out.println();
        System.out.println(Arrays.toString(arr));
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (i==arr.length-1){
                sb.append(arr[i]);
            }else{
                sb.append(arr[i]).append(" ");
            }
        }
        System.out.println();
        String result = sb.toString();
        System.out.println("result:"+result);
    }
}

