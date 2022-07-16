package tedu_day04_night;
//如果需要将代码交给计算机去执行，必须要写上一行固定的代码
public class Demo {
    public static void main(String[] args){//运行代码
        int a = (int) (Math.random()*100000);
        int b = (int) (Math.random()*100000);
        int c = (int) (Math.random()*100000);
        int t;
        //执行比较的逻辑
        if(a>b){
            t = a;
            a = b;
            b = t;
        }
        if(a>c){
            t = a;
            a = c;
            c = t;
        }
        if(b>c){
            t = b;
            b = c;
            c = t;
        }
        System.out.println( a );//输出语句
        System.out.println( b );//输出语句
        System.out.println( c );//输出语句



    }
}
