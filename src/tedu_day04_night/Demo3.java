package tedu_day04_night;

public class Demo3 {
    /**
     * main方法，是一个系统级别的方法，归jvm(java核心系统)直接调用
     * 所有方法的爸爸，计算机在执行代码的时候只看main方法里有没有代码，其他不管
     */
    public static void main(String[] args) {
        nongmin();
        shangfan();
        chushi();
        kehu();
        //API的使用方法
        Demo3 demo = new Demo3();
        demo.health();
    }

    public  void health(){//为什么
        System.out.println("收拾");
        System.out.println("洗碗");
        System.out.println("擦干");
        System.out.println("放好");

    }
    public static void shangfan(){
        System.out.println("收菜 ");
        System.out.println("叫卖 ");
        System.out.println("讨价还价 ");
        System.out.println("打包 ");
    }

    public static void kehu(){
        System.out.println("点菜 ");
        System.out.println("等菜 ");
        System.out.println("吃菜 ");
        System.out.println("结账 ");
    }
    public static void nongmin(){//方法执行的入口
        System.out.println("播种 ");
        System.out.println("浇水 ");
        System.out.println("施肥 ");
        System.out.println("收割 ");
    }
    public static void chushi(){
        System.out.println("买菜 ");
        System.out.println("洗菜 ");
        System.out.println("切菜 ");
        System.out.println("炒菜 ");
    }

}
