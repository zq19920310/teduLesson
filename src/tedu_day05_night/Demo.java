package tedu_day05_night;
//如果需要将代码交给计算机去执行，必须要写上一行固定的代码
public class Demo {
    public static void main(String[] args){//运行代码
        //    (char)  将后面小数数字转换成char类型的整数数字，显示中文
        char a =  (char)( Math.random()*20902+19968 );
        char b =  (char)( Math.random()*20902+19968 );
        char c =  (char)( Math.random()*20902+19968 );
        char d =  (char)( Math.random()*20902+19968 );
        System.out.println( a );
        System.out.println( b );
        System.out.println( c );
        System.out.println( d );
    }
}
