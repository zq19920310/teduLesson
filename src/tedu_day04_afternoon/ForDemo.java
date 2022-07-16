package tedu_day04_afternoon;

public class ForDemo {
    public static void main(String[] args) {
        //外层循环一次，内存循环全部   9次
        for(int i = 0; i < 3 ; i++ ){ //  3次
            for (int j = 2; j < 5; j++) {// 3次
                System.out.println(i);
            }
            // i = 000 111 222
            // J = 234 234 234
        }
    }
}
