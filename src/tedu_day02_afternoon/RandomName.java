package tedu_day02_afternoon;
//如果需要将代码交给计算机去执行，必须要写上一行固定的代码
public class RandomName {
    public static void main(String[] args){//运行代码
        String[] names = {"王同学","吴同学","夏同学","李同学","傅同学","周同学","张同学","冯同学","倪同学","邓同学"};
                        //   0       1       2       3       4      5       6        7      8        9
        int[] arrs = new int[3]; //下标存储区域
        //如何往数组里存储数据呢？
        int i = 0;
        while(i<3){  //当i小于3时 就可以执行循环代码
            int index = (int)(Math.random()*10);//1.先从名单生成区域当中随机生成index
            if(index == arrs[0]  ||  index == arrs[1]  ||  index == arrs[2]) {
                continue; //结束当前循环，跳过后续的所有的代码直接进入到下一次循环
            }
            arrs[i] = index;//3.index放到名单存储区域里
            i++; // 让i数字自增1
        }

        System.out.println(names[ arrs[0]  ]);
        System.out.println(names[ arrs[1]  ]);
        System.out.println(names[ arrs[2]  ]);


    }
}
