import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class BoardView extends JFrame implements MouseListener {
	BoardController controller;
	private int WINDOW_WIDTH, WINDOW_HEIGHT;
	private final int DISC_SIZE = 50;
	
	public BoardView(BoardController controller) {
		this.controller = controller;
		controller.attachView(this);
		
		WINDOW_WIDTH = (controller.getBoard()[0].length *DISC_SIZE) + (10*controller.getBoard()[0].length);
		WINDOW_HEIGHT = (controller.getBoard().length * DISC_SIZE) + (10*controller.getBoard().length) + (DISC_SIZE/2);
		
		setBackground(Color.YELLOW);
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setLocation(0, 0);
		addMouseListener(this);
		setVisible(true);
	}

	public void paint(Graphics g) {
		DiscModel[][] board = controller.getBoard();
		int x=0, y=DISC_SIZE/2;
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				g.setColor(Color.WHITE);
				g.fillOval(x, y, DISC_SIZE, DISC_SIZE);
//				System.out.print(board[i][j].getState().name() + " ");
				x+=DISC_SIZE + 10;
			}
			x=0;
			y+=DISC_SIZE + 10;
//			System.out.println();
		} 
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
		System.out.println("x: " + e.getX() + " y: "+ e.getY()); 
		repaint(); 		
	}

}
