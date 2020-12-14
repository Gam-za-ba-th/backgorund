package background;

import javax.swing.*;
import java.awt.*;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class background extends JFrame {
	public background() {
		setTitle("Infant Games for Children");
		setSize(500,500);
		
		Container c=getContentPane();
		c.setLayout(new GridLayout(1,10));
		
		for (int i = 0; i <10; i++)
		{
			Color[] col = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.CYAN, Color.BLUE, Color.MAGENTA, Color.GRAY, Color.PINK, Color.BLACK};
			JLabel label=new JLabel();
			label.setBackground(col[i]);
			label.setOpaque(true);
			c.add(label);
		}
			int x = (int) (Math.random() * 300);
			int y = (int) (Math.random() * 300);
			
			ImageIcon leaf = new ImageIcon("leaf.jpg");
		
			JLabel imageLabel = new JLabel(leaf);
			imageLabel.setBounds(x, y, 100, 100);
			c.add(imageLabel);
        setVisible(true);
		}
	public static void main(String[] args) {
		background frame = new background();
	}
}