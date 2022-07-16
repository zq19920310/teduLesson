package tedu_day03_afternoon;
//如果需要将代码交给计算机去执行，必须要写上一行固定的代码
public class Game {
    public static void main(String[] args){ //运行代码
        int random = (int)(Math.random()*1000000);
        System.out.println(random);
        if(0<=random && random<250000){//珍稀
            System.out.println("莱恩");
        }else if(250000<=random && random<390000){//非常珍稀   二选一
            if(random % 2 == 0 ){//奇偶数
                System.out.println("伐木机金色");
            }else{
                System.out.println("露娜金色");
            }
        }else if(390000<=random && random<490000){//珍稀超凡
            System.out.println("火猫");
        }else if(490000<=random && random<490004){//珍稀绝伦
            System.out.println("不朽盾");
        }else {//收尾，表示如果上述的条件都不满足，就只能执行else里的代码——普通   多选一  随机数字上靠
            String[] awards ={"戴泽","伐木机","墨客","帕格纳","术士","露娜"};
                            //  0      1      2       3     4      5
            //生成0~5之间的随机整数数字即可
            int index = (int)(Math.random()*6);
            System.out.println( awards[index]);
        }
    }
}
