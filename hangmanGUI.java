package ref;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * this is the main class to run the project
 */

public class hangmanGUI extends JFrame {
	/**
	 * in my GUI, i created 1 frame which contains 2 panels,layout left and
	 * right. The left panel contains 3 labels 1 text field and 2 buttons.
	 * label1 shows the mystery word(likes"------"). label2 shows the missed
	 * letters label3 to reminds user to enter letter into the text field below
	 * textfield to obtain the user's guess letters the submit button to obtain
	 * the guess letter and compare to the mystery word the restart button to
	 * restart the game
	 */
	public static void main(String[] args) {
		System.out.println();
		System.out.println("Welcome to Hangman: ");
		System.out.println();

		hangmanGUI gui = new hangmanGUI();
		gui.go();
		Play obj = new Play();
		obj.Start();

	}

	public void go() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		panel.setBackground(Color.white);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 600);
		frame.setVisible(true);
	}

	public void paint(Graphics g) {
		g.setColor(Color.white);
		g.fillRect(0, 0, 500, 500); // background
		g.setColor(Color.red);
		g.fillRect(100, 50, 100, 5); // hengxian
		g.setColor(Color.red);
		g.fillRect(100, 50, 5, 350); // shuxian
		g.setColor(Color.red);
		g.drawLine(100, 400, 50, 450); // left chazi
		g.setColor(Color.red);
		g.drawLine(100, 400, 150, 450); // right chazi
	}

}
