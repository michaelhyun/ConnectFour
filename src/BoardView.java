import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class BoardView extends JFrame{
	BoardController controller;
	JFrame frame;
	
	public BoardView(BoardController controller){
		this.controller = controller;
		controller.attachView(this);
		displayView();
	}
	
	private void displayView(){
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setupBoard();
        frame.pack();
        frame.setVisible(true);	
	}
	
	private void setupBoard(){
		
		
		JPanel buttonPanel = new JPanel();
        JPanel containerPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(controller.getBoardModel().getBoardHeight(),controller.getBoardModel().getBoardWidth()));

        frame.getContentPane().add(containerPanel);
		
		DiscModel[][] board = controller.getBoard();
		for (int i = 0; i < board[0].length; i++) {
			for (int j = 0; j < board.length; j++) {
				System.out.print(board[i][j].getState().name() + " ");
				buttonPanel.add(new JButton(board[i][j].getState().name()));
			}
			System.out.println();
		}
		buttonPanel.setPreferredSize(new Dimension(300, 400));
        containerPanel.add(buttonPanel);
	}
}
