package tedu_day05_night;

import com.sun.security.jgss.GSSUtil;

import java.util.Locale;

public class Demo2 {
    public static void main(String[] args) {
        //整体叫做字符串，单个都叫做字符
        String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";//位置既是下标,下标从0开始排序
                    //0 ~ 61                           62个字符
        //介绍String里一个api/公式    生成0~61之间的随机整数数字即可    0<=Math.random()*62<62
        //  charAt(下标)   根据字符串的下标来获取某个位置上的字符
        int a =  (int)(Math.random() * 62);
        int b =  (int)(Math.random() * 62);
        int c =  (int)(Math.random() * 62);
        int d =  (int)(Math.random() * 62);
        System.out.println( str.charAt(b) );
        System.out.println( str.charAt(b) );
        System.out.println( str.charAt(c) );
        System.out.println( str.charAt(d) );

    }
}
