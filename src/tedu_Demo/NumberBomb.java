package tedu_Demo;

import java.util.Scanner;

public class NumberBomb {
    public static void main(String[] args) {
        int start = 1;
        int end = 100;
        int boom  = (int)(Math.random()*100+1);
        Scanner sc= new Scanner(System.in);//找到了sc来帮我们获取系统的输入权限
        System.out.println("是否想要进行数字炸弹游戏,请输入Y/N..");
        String input = sc.next();//可以输入字母    String 限制等号右边的数据必须是字符(文字+符号)
        int num = 0;    //记录已经输入过的数字
        while(input.equalsIgnoreCase("y") ){ //input 跟 "y" 相等时 ,就进行数字炸弹游戏(进入循环)
            System.out.println("请在" + start + "~" + end + " 之间猜测数字...");
            System.out.println("请输入您想要猜测的数字:");
            int guess = sc.nextInt(); //让sc帮我在控制台当中手动输入数字
            //需要对输入数字做限制
            if(guess>end || guess<start){ //只要满足其中一个条件就重新输入数字       ||或者
                System.out.println("您输入的数字不符合要求,请重新输入....");
                continue;// 重新开始   从当前代码行数立即回到循环最开始的第一行重新执行
            }
            num = guess;
            if(boom  ==  guess){
                System.out.println("恭喜恭喜你中奖了");
                System.out.println("是否还想继续玩? 请输入Y/N...");
                input=sc.next();//重新输入一次字母,重新判断一次
                //所有的数据需要重置
                start = 1;
                end = 100;
                boom  = (int)(Math.random()*100+1);
            }else if(boom  >  guess){
                start = guess;
                System.out.println("抱歉,猜小了,请重新猜");
            }else if(boom  <  guess){
                end = guess;
                System.out.println("抱歉,猜大了,请重新猜");
            }
        }
        if(input.equalsIgnoreCase("n")){
            System.out.println("游戏结束,欢迎下次光临");
        }else{
            System.out.println("程序错误,请重启游戏...");
        }
    }
}
