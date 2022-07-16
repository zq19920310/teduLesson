package tedu_day02_night;
//如果需要将代码交给计算机去执行，必须要写上一行固定的代码
public class WeChatMoney {
    public static void main(String[] args){ //运行代码——会抄
   //变量类型  变量名称 = 变量值;
        double total = 88.88;//总金额
        int     nums = 5;    //总个数
        double  max  = total / nums * 2;//最大值
        double[] red = new double[nums];//数组容器
        //数组的名称[下标]
        int j = 0;// j就是数组的下标 从0 开始
        while(j<nums){
            double random= Math.random() * max;//确定了范围之后的随机数字
            double  money= Math.round( random * 100  )  / 100.0;//保留小数点后两位的数字
            red[j]= money;//将随机红包放到数组里
            j+=1;   // 让j数字在原来数字的基础之上自增1
        }
        //输出数组里每个位置上的数据来看看数字
        int i = 0;
        while(i<nums){
            System.out.println( red[i] );
            i+=1;    //+=  累加 在原来数字的基础之上自增1
        }

    }
}
