package www.douyou.shanghai.www.douyou.shanghai.Demo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LambdaMonitor extends JFrame {
    /**
     * @author Goerage
     * progess 使用Lambda表达式实现监听器
     * 分别使用传统方式和Lambda表达式对按钮btn1和btn2添加监听器，
     * 其实现的效果是等价的，且使用Lambda表达式后语句更加简洁
     */
    JPanel p;
    JTextArea ta;
    JButton btn1, btn2;
    public LambdaMonitor(){
        super("Lambda测试");
       p = new JPanel();
       ta = new JTextArea();
       btn1 = new JButton("传统方法");
       btn2 = new JButton("Lambda方式");
       //添加监听器
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ta.append("您单击了按钮1\n");
            }
        });
        //Lambda表达式
        btn2.addActionListener(e -> ta.append("您单击了按钮2\n"));
        this.add(ta);
        p.add(btn1);
        p.add(btn2);
        this.add(p, BorderLayout.SOUTH);
        this.setSize(400, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args){
        new LambdaMonitor().setVisible(true);
    }
}
