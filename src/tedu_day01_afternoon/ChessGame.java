package tedu_day01_afternoon;

import javax.swing.*;

//如果需要将代码交给计算机去执行，必须要写上一行固定的代码
public class ChessGame {
    public static void main(String[] args){ //运行代码
        //读取图片  ImageIcon
        ImageIcon bg = new ImageIcon("case06/back.png");
        ImageIcon cc = new ImageIcon("case06/close.png");
        ImageIcon mm = new ImageIcon("case06/min.png");
        ImageIcon ss = new ImageIcon("case06/start.png");
        ImageIcon hh = new ImageIcon("case06/huiqi.png");
        ImageIcon bb = new ImageIcon("case06/bar.png");
        //准备使用JLabel里的代码来解决图片容器的问题
        JLabel main = new JLabel(bg);// 主容器
        //准备使用JButton的代码来解决按钮容器的问题
        JButton min = new JButton(mm);
        JButton close = new JButton(cc);
        JButton start = new JButton(ss);
        JButton back = new JButton(hh);
        //windows去除按钮的底色
        min.setContentAreaFilled(false);
        close.setContentAreaFilled(false);
        start.setContentAreaFilled(false);
        back.setContentAreaFilled(false);
        //windows去除按钮的边框 —— mac可以直接去除底色
        min.setBorderPainted(false);
        close.setBorderPainted(false);
        start.setBorderPainted(false);
        back.setBorderPainted(false);
        //设置按钮所在容器的位置跟大小
        min.setBounds(850, 15, 14, 14);
        back.setBounds(30, 450, 100, 42);
        close.setBounds(880, 15, 14, 14);
        start.setBounds(400, 10, 34, 34);
        //将按钮放到主容器上
        main.add(min);
        main.add(back);
        main.add(close);
        main.add(start);
        //菜单三兄弟
        JMenuBar bar = new JMenuBar();
        //老大设置菜单所在的位置区域
        bar.setBounds(5,5,100,36);
        JMenu   game = new JMenu();
        //由老二来决定容器里的素材
        game.setIcon(bb);
        JMenuItem loadgame = new JMenuItem("加载游戏...");
        JMenuItem savegame = new JMenuItem("保存游戏...");
        JMenuItem restartgame = new JMenuItem("重启游戏...");
        //开始放容器  老三放到老二上
        game.add(loadgame);
        game.add(savegame);
        game.add(restartgame);
        //老二放到老大
        bar.add(game);
        //老大放到主容器上
        main.add(bar);
        //准备使用JFrame里的代码来解决窗口问题
        JFrame jf  =   new   JFrame();
        // 自定义名称.方法名称();记一些比较常用的即可
        jf.add(main);//将主容器添加到窗口容器上
        jf.setUndecorated(true);//隐藏窗口的边框
        jf.setLocation(300,160);//设置窗口的初始位置
        jf.setSize(900,700);//设置窗口的大小
        jf.setVisible(true);//让窗口显示出来
    }
}
