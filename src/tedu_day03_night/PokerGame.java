package tedu_day03_night;

import java.util.ArrayList;
import java.util.Collections;

//如果需要将代码交给计算机去执行，必须要写上一行固定的代码
public class PokerGame{
    public static void main(String[] args){//运行代码
        String[] colors = {"红桃","黑桃","梅花","方片"};
                        //   0     1     2      3
        String[]  nums  = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
                        //  0   1   2   3   4   5   6   7    8   9   10  11  12
        ArrayList poker = new ArrayList();//准备使用ArrayList集合来存储拼接好的扑克
        //自定义名称.方法名称()

        for(int i = 0 ;i<13 ;i++ ){   //外层循环13次
            for(int j = 0 ; j < 4 ; j++ ){//内层循环4次
                poker.add( colors[j] + nums[i]);  //  13  *  4= 52次
            }
        }
        poker.add("大王");
        poker.add("小王");
        //打乱poker集合里的顺序
        Collections.shuffle(poker);
        //从集合里获取数据看看  从0开始  到 53结束  每次自增1
        for (int i = 0; i < 54; i++) {
            System.out.println(poker.get(i));
        }
    }
}
