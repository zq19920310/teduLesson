package tedu_Demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class PokerGame   {
    public static void main(String[] args) {         //程序的入口,计算机执行命令的区域
        String[] color    ={"红心","方片","黑桃","梅花"};
        //  0       1     2     3
        String[] number   ={"2","A","3","4","5","6","7","8","9","10","J","Q","K"};
        //  0   1   2   3   4   5   6   7   8    9   10  11  12
        ArrayList<String> poker=new ArrayList(); //必须要创建出一个可以变化大小的容器-----54张牌
        //获取color数组中的某一个位置上的颜色 、number数组上某一个位置的数字
        for (int i = 0; i < 13; i++) {
            poker.add(color[0]+number[i]); //往poker集合中放数据   红心      13
            poker.add(color[1]+number[i]); //往poker集合中放数据   方片      13
            poker.add(color[2]+number[i]); //往poker集合中放数据   黑桃      13
            poker.add(color[3]+number[i]); //往poker集合中放数据   梅花      13
        }
        poker.add("大王");
        poker.add("小王");
        //打乱集合里数据----公式----Collections.shuffle(集合的名称)
        Collections.shuffle(poker);

        ArrayList<String> player01 =new ArrayList();        //17张
        ArrayList<String> player02 =new ArrayList();        //17张
        ArrayList<String> player03 =new ArrayList();        //17张
        ArrayList<String> dipai =new ArrayList();           //3张
        for (int i = 0; i < poker.size() ; i++) {
            if(i>50){  //剩下来的3张牌当成底牌53  52  51 底牌下标为
                dipai.add(   poker.get(i)   ); //添加底牌
            }else if(i%3==0){
                player01.add( poker.get(i));
            }else if(i%3==1){
                player02.add( poker.get(i));
            }else if(i%3==2){
                player03.add( poker.get(i));
            }
        }
        System.out.print("周润发:");
        for (int i = 0; i < player01.size(); i++) {
            System.out.print( player01.get(i) + "  ");
        }
        System.out.println();//回车
        System.out.print("梁朝伟:");
        for (int i = 0; i < player02.size(); i++) {
            System.out.print( player02.get(i) + "  ");
        }
        System.out.println();//回车
        System.out.print("周星驰:");
        for (int i = 0; i < player03.size(); i++) {
            System.out.print( player03.get(i) + "  ");
        }
    }

}






