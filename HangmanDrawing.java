package ref;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class HangmanDrawing extends JPanel {
	/**
	 * 
	 */
	int tt = 0;
	private static final long serialVersionUID = 1L;

	public void paintComponent(Graphics g) {

		super.paintComponent(g);

		if (tt == 1) {
			g.setColor(Color.white);
			g.fillRect(0, 0, 500, 500); // background
			g.setColor(Color.black);
			g.fillRect(100, 50, 100, 5); // hengxian
			g.setColor(Color.black);
			g.fillRect(100, 50, 5, 350); // shuxian
			g.setColor(Color.black);
			g.drawLine(100, 400, 50, 450); // left chazi
			g.setColor(Color.black);
			g.drawLine(100, 400, 150, 450); // right chazi

			g.setColor(Color.black);
			g.drawLine(200, 50, 200, 100); // step 1
		}
		if (tt == 2) {
			g.setColor(Color.white);
			g.fillRect(0, 0, 500, 500); // background
			g.setColor(Color.black);
			g.fillRect(100, 50, 100, 5); // hengxian
			g.setColor(Color.black);
			g.fillRect(100, 50, 5, 350); // shuxian
			g.setColor(Color.black);
			g.drawLine(100, 400, 50, 450); // left chazi
			g.setColor(Color.black);
			g.drawLine(100, 400, 150, 450); // right chazi

			g.setColor(Color.black);
			g.drawLine(200, 50, 200, 100); // step 1

			g.setColor(Color.black);
			g.drawOval(175, 100, 50, 50); // step 2

		}
		if (tt == 3) {
			g.setColor(Color.white);
			g.fillRect(0, 0, 500, 500); // background
			g.setColor(Color.black);
			g.fillRect(100, 50, 100, 5); // hengxian
			g.setColor(Color.black);
			g.fillRect(100, 50, 5, 350); // shuxian
			g.setColor(Color.black);
			g.drawLine(100, 400, 50, 450); // left chazi
			g.setColor(Color.black);
			g.drawLine(100, 400, 150, 450); // right chazi

			g.setColor(Color.black);
			g.drawLine(200, 50, 200, 100); // step 1

			g.setColor(Color.black);
			g.drawOval(175, 100, 50, 50); // step 2

			g.setColor(Color.black);
			g.drawLine(200, 150, 200, 250); // step 3
		}
		if (tt == 4) {
			g.setColor(Color.white);
			g.fillRect(0, 0, 500, 500); // background
			g.setColor(Color.black);
			g.fillRect(100, 50, 100, 5); // hengxian
			g.setColor(Color.black);
			g.fillRect(100, 50, 5, 350); // shuxian
			g.setColor(Color.black);
			g.drawLine(100, 400, 50, 450); // left chazi
			g.setColor(Color.black);
			g.drawLine(100, 400, 150, 450); // right chazi

			g.setColor(Color.black);
			g.drawLine(200, 50, 200, 100); // step 1

			g.setColor(Color.black);
			g.drawOval(175, 100, 50, 50); // step 2

			g.setColor(Color.black);
			g.drawLine(200, 150, 200, 250); // step 3

			g.setColor(Color.black);
			g.drawLine(200, 170, 160, 140); // step 4
		}
		if (tt == 5) {
			g.setColor(Color.white);
			g.fillRect(0, 0, 500, 500); // background
			g.setColor(Color.black);
			g.fillRect(100, 50, 100, 5); // hengxian
			g.setColor(Color.black);
			g.fillRect(100, 50, 5, 350); // shuxian
			g.setColor(Color.black);
			g.drawLine(100, 400, 50, 450); // left chazi
			g.setColor(Color.black);
			g.drawLine(100, 400, 150, 450); // right chazi

			g.setColor(Color.black);
			g.drawLine(200, 50, 200, 100); // step 1

			g.setColor(Color.black);
			g.drawOval(175, 100, 50, 50); // step 2

			g.setColor(Color.black);
			g.drawLine(200, 150, 200, 250); // step 3

			g.setColor(Color.black);
			g.drawLine(200, 170, 160, 140); // step 4

			g.setColor(Color.black);
			g.drawLine(200, 170, 240, 140); // step 5
		}
		if (tt == 6) {
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

			g.setColor(Color.black);
			g.drawLine(200, 50, 200, 100); // step 1

			g.setColor(Color.black);
			g.drawOval(175, 100, 50, 50); // step 2

			g.setColor(Color.black);
			g.drawLine(200, 150, 200, 250); // step 3

			g.setColor(Color.black);
			g.drawLine(200, 170, 160, 140); // step 4

			g.setColor(Color.black);
			g.drawLine(200, 170, 240, 140); // step 5

			g.setColor(Color.black);
			g.drawLine(200, 250, 160, 300); // step 6
		}
		if (tt == 7) {
			g.setColor(Color.white);
			g.fillRect(0, 0, 500, 500); // background
			g.setColor(Color.black);
			g.fillRect(100, 50, 100, 5); // hengxian
			g.setColor(Color.black);
			g.fillRect(100, 50, 5, 350); // shuxian
			g.setColor(Color.black);
			g.drawLine(100, 400, 50, 450); // left chazi
			g.setColor(Color.black);
			g.drawLine(100, 400, 150, 450); // right chazi

			g.setColor(Color.black);
			g.drawLine(200, 50, 200, 100); // step 1

			g.setColor(Color.black);
			g.drawOval(175, 100, 50, 50); // step 2

			g.setColor(Color.black);
			g.drawLine(200, 150, 200, 250); // step 3

			g.setColor(Color.black);
			g.drawLine(200, 170, 160, 140); // step 4

			g.setColor(Color.black);
			g.drawLine(200, 170, 240, 140); // step 5

			g.setColor(Color.black);
			g.drawLine(200, 250, 160, 300); // step 6

			g.setColor(Color.red);
			g.drawLine(200, 250, 240, 300);
			g.setColor(Color.blue);
			g.drawString("You have run out of guesses.", 110, 350);
			g.setColor(Color.blue);
			g.drawString("You die!!.", 110, 390); // step 7
		}

		if (tt == 88) {
			g.setColor(Color.black);
			g.drawOval(175, 100, 50, 50); // step 2

			g.setColor(Color.black);
			g.drawLine(200, 150, 200, 250); // step 3

			g.setColor(Color.black);
			g.drawLine(200, 170, 160, 140); // step 4

			g.setColor(Color.black);
			g.drawLine(200, 170, 240, 140); // step 5

			g.setColor(Color.black);
			g.drawLine(200, 250, 160, 300); // step 6

			g.setColor(Color.black);
			g.drawLine(200, 250, 240, 300);

			g.setColor(Color.red);
			g.drawArc(30, 30, 230, 230, 0, 180);
			g.setColor(Color.yellow);
			g.drawArc(35, 30, 220, 225, 0, 180);
			g.setColor(Color.blue);
			g.drawArc(40, 30, 210, 220, 0, 180);
			g.setColor(Color.green);
			g.drawArc(45, 30, 200, 215, 0, 180);
			g.setColor(Color.blue);
			g.drawString("Congratulations you win!", 110, 350);
			g.setColor(Color.blue);
			g.drawString("You have guessed the word!!.", 110, 390); // step 7
		}

		if (tt == 0) {
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

}
