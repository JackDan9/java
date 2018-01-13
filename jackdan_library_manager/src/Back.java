//import javax.swing.*;

import java.awt.*;

/**
 * Created by JackDan9 on 2017/7/12.
 */
public class Back extends Frame{
    private static final long serialVersionUID = 1993050319950917L;
    Label bookidlb = new Label("图书编号"), readeridlb = new Label("读者编号");
    TextField bookidtxt = new TextField(), readeridtxt = new TextField();
    Button querybtn = new Button("查询"), borrowbtn = new Button("还书"),closebtn = new Button("清除");

    String SeqLine = "----------------------------------------------";
    String[] seq = {"图书信息", "读者信息", "借阅信息"};
    Label[] seqlabel = new Label[3];

    String[] optionname = { "书名：", "作者：", "出版社：", "出版时间：", "定价：", "存量：", "姓名：","类型：", "可借数：", "可借天数：", "借阅日期：","阅读天数：","还书日期" };
    Label[] alloption = new Label[13];
    Label[] showoption = new Label[13];

    public Back() {
        setTitle("图书归还");
        setLayout(null);
        setSize(500, 470);
        setResizable(false);
        this.setForeground(Color.black);
        bookidlb.setBounds(50,50,50,20);
        bookidtxt.setBounds(110, 50, 100, 20);
    }
}
