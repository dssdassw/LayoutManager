import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class BorderPanelWindow extends JFrame {
	public BorderPanelWindow() {
		setTitle("BorderPanel Layout");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		//creates 5 panels
		JPanel npanel = new JPanel();
		JPanel epanel = new JPanel();
		JPanel spanel = new JPanel();
		JPanel wpanel = new JPanel();
		JPanel cpanel = new JPanel();
		
		//cuz fuck defining the buttons rn
		npanel.add(new JButton("North Button"));
		epanel.add(new JButton("East Button"));
		spanel.add(new JButton("South Button"));
		wpanel.add(new JButton("West Button"));
		cpanel.add(new JButton("Center Button"));
		
		add(npanel, BorderLayout.NORTH);
		add(epanel, BorderLayout.EAST);
		add(spanel, BorderLayout.SOUTH);
		add(wpanel, BorderLayout.WEST);
		add(cpanel, BorderLayout.CENTER);
		
		pack();
		setVisible(true);
	}
	public static void main(String[] args) {
		new BorderPanelWindow();
	}
}
