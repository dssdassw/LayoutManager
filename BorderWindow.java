import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class BorderWindow extends JFrame {
	private final int WIN_W = 400; //window width
	private final int WIN_H = 300; //window height (this is obvious)
	public BorderWindow() {
		setTitle("BorderWindow Layout");
		setSize(WIN_W, WIN_H);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		//create 5 buttons (duh)
		JButton nbutton = new JButton("North Button");
		JButton ebutton = new JButton("East Button");
		JButton sbutton = new JButton("South Button");
		JButton wbutton = new JButton("West Button");
		JButton cbutton = new JButton("Center Button");
		
		//add the 5 buttons (duh)
		add(nbutton, BorderLayout.NORTH);
		add(ebutton, BorderLayout.EAST);
		add(sbutton, BorderLayout.SOUTH);
		add(wbutton, BorderLayout.WEST);
		add(cbutton, BorderLayout.CENTER);
		
		//k what the fuck do you think this does
		setVisible(true);
	}
	public static void main(String[] args) {
		new BorderWindow();
	}
}
