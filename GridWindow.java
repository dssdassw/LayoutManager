import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class GridWindow extends JFrame {
	private final int WIN_W = 400;
	private final int WIN_H = 200;
	public GridWindow() {
		setSize(WIN_W, WIN_H);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(2, 3));
		JButton b1 = new JButton("Button 1");
		JButton b2 = new JButton("Button 2");
		JButton b3 = new JButton("Button 3");
		JButton b4 = new JButton("Button 4");
		JButton b5 = new JButton("Button 5");
		JButton b6 = new JButton("Button 6");
		
		//add 6 buttons to the pane
		add(b1); //r1c1
		add(b2); //r1c2
		add(b3); //r1c3
		add(b4); //r2c1
		add(b5); //r2c2
		add(b6); //r2c3
		
		setVisible(true);
	}
	public static void main(String[] args) {
		new GridWindow();
	}
}
