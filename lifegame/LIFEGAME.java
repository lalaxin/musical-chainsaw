//package LifeGame;
import  javax.swing.*;
import java.awt.*;
public class LIFEGAME extends JFrame {
	
	LIFEGAME()//构造函数
	{
		this.setSize(1000,820);  //设置游戏区域大小
        this.setTitle("生命游戏——细微差别的对比");  
        this.setBackground(new Color(0,0,0));//设置背景色为黑色
        this.add(new MAP());  
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        this.setLocationRelativeTo(null);  
        this.setResizable(false);
	}
	public static void main(String[] args){  
        LIFEGAME game = new LIFEGAME();  
        game.setVisible(true);  
    }  
}
