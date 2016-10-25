import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class BoardView extends JFrame{
	BoardController controller;
	
	public BoardView(BoardController controller){
		this.controller = controller;
		controller.attachView(this);
		displayView();
	}
	
	private void displayView(){
		DiscModel[][] board = controller.getBoard();
		for (int i = 0; i < board[0].length; i++) {
			for (int j = 0; j < board.length; j++) {
				System.out.print(board[i][j].getState().name() + " ");
			}
			System.out.println();
		}
	}
}
