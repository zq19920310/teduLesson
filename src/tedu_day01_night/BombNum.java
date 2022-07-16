package tedu_day01_night;

import java.util.Random;
import java.util.Scanner;

//如果需要将代码交给计算机去执行，必须要写上一行固定的代码
public class BombNum {
    public static void main(String[] args){ //运行代码
        int start  = 0;      //起始数字
        int end    = 100;    //结束数字
        //准备使用Random和Scanner这个两个API来分别解决随机数字和控制台输入数字的问题
        Random rd = new Random();
        Scanner sc= new Scanner(System.in);
        // 自定义名称.方法名称();
        int bombNum = rd.nextInt(101) ; // 应该等于某一种特殊的代码,该代码的功能可以生成0~100之间的随机整数数字
        int guessNum = -1;//只要不等于0~100之间的随机炸弹数字就可以
        while(bombNum != guessNum){//什么情况下会不停地去猜测数字?—— 不相等的时候
            System.out.println( "请在" + start + "~" + end + "之间猜测数字..." );  //输出语句  可以将小括号里的结果输出在控制台当中显示
            System.out.println(bombNum);
            guessNum  = sc.nextInt()  ;//应该等于某一种特殊的代码，该代码的代码功能可以在控制台当中输入整数数字
            if(bombNum>guessNum){
                System.out.println("您猜小了，请重新猜...");
                start = guessNum;
            }else if(bombNum < guessNum){
                System.out.println("您猜大了，请重新猜...");
                end = guessNum;
            }else if(bombNum == guessNum){
                System.out.println( "恭喜恭喜,您中奖了！！！");
            }
        }

    }
}
