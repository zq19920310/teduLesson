package tedu_day04_afternoon;
//如果需要将代码交给计算机去执行，必须要写上一行固定的代码
public class Majiang {
    public static void main(String[] args){ //运行代码
        String[] types = {"条","饼","万"};    //类型
                        // 0    1    2
        int[]     nums = {1,2,3,4,5,6,7,8,9};//号码
                        //0 1 2 3 4 5 6 7 8
        String[]  feng = {"东","西","南","北","中","白板","发财"};
                    //      0   1    2    3   4    5      6
        for(int i = 0 ; i < 9;i++ ){ //外层循环1次      9次
            for(int j = 0 ; j < 3 ; j++ ){//内层需要循环全部    3次
                for (int k = 0; k < 4 ; k++) { //     4次             9 * 3 * 4 =108次
                    System.out.println( nums[i] + types[j] );
                }
            }
        }
        for(int i = 0;i<7;i++){// 7次
            for (int j = 0; j <4 ; j++) { //4次    7 * 4 = 28次
                System.out.println(feng[i]);
            }
        }
    }
}
