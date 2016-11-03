import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

/**
 * @author ravinsardal
 *
 */
@SuppressWarnings("serial")
public class BoardView extends JFrame implements MouseListener {
	BoardController controller;
	private int WINDOW_WIDTH, WINDOW_HEIGHT;
	private final int DISC_SIZE = 50;

	public BoardView(BoardController controller) {
		this.controller = controller;
		controller.attachView(this);

		WINDOW_WIDTH = (controller.getBoard()[0].length * DISC_SIZE)
				+ (10 * controller.getBoard()[0].length);
		WINDOW_HEIGHT = (controller.getBoard().length * DISC_SIZE)
				+ (10 * controller.getBoard().length) + (DISC_SIZE / 2);

		setBackground(Color.YELLOW);
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setTitle(controller.getBoardModel().getPlayer1().getName() + " vs "
				+ controller.getBoardModel().getPlayer2().getName());
		setLocation(0, 0);
		addMouseListener(this);
		setVisible(true);	
	}

	public void paint(Graphics g) {
		DiscModel[][] board = controller.getBoard();
		int x = 0, y = DISC_SIZE / 2;
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				switch (board[i][j].getState()) {
				case EMPTY:
					g.setColor(Color.WHITE);
					break;
				case RED:
					g.setColor(Color.RED);
					break;
				case BLACK:
					g.setColor(Color.BLACK);
					break;
				default:
					break;
				}
				g.fillOval(x, y, DISC_SIZE, DISC_SIZE);
				x += DISC_SIZE + 10;
			}
			x = 0;
			y += DISC_SIZE + 10;
		}
	}
	
	public void displayGameWinPopup(String playerName){
		JOptionPane.showMessageDialog(this, playerName + " has won!");
		System.out.println(playerName + " has won!");
	}

	public void mouseReleased(MouseEvent e) {
	}

	public void mouseEntered(MouseEvent e) {
	}

	public void mouseExited(MouseEvent e) {
	}

	public void mousePressed(MouseEvent e) {
	}

	public void mouseClicked(MouseEvent e) {
		controller.userClickedAtPoint(e.getX(), e.getY(), WINDOW_WIDTH,
				WINDOW_HEIGHT, DISC_SIZE);
	}

}
