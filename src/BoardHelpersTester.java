import static org.junit.Assert.*;

import org.junit.Test;

public class BoardHelpersTester {

	@Test
	public void test() {
		
		
		DiscModel[][] board = { { new DiscModel(DiscModel.State.BLACK), new DiscModel(DiscModel.State.EMPTY),
				new DiscModel(DiscModel.State.EMPTY), new DiscModel(DiscModel.State.EMPTY) },

				{ new DiscModel(DiscModel.State.BLACK), new DiscModel(DiscModel.State.RED),
						new DiscModel(DiscModel.State.RED), new DiscModel(DiscModel.State.RED) },
				{ new DiscModel(DiscModel.State.BLACK), new DiscModel(DiscModel.State.RED),
						new DiscModel(DiscModel.State.RED), new DiscModel(DiscModel.State.RED) },
				{ new DiscModel(DiscModel.State.BLACK), new DiscModel(DiscModel.State.RED),
						new DiscModel(DiscModel.State.RED), new DiscModel(DiscModel.State.RED) } };
		
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				System.out.print(board[i][j].getState().name() + " ");;
			}
			System.out.println(" ");
		}
		
		assertTrue(BoardHelpers.checkWin(board, 4));
	}
	
	
	@Test
	public void test2() {
		
		
		DiscModel[][] board = { { new DiscModel(DiscModel.State.BLACK), new DiscModel(DiscModel.State.EMPTY),
				new DiscModel(DiscModel.State.EMPTY), new DiscModel(DiscModel.State.EMPTY) },

				{ new DiscModel(DiscModel.State.BLACK), new DiscModel(DiscModel.State.RED),
						new DiscModel(DiscModel.State.RED), new DiscModel(DiscModel.State.RED) },
				{ new DiscModel(DiscModel.State.BLACK), new DiscModel(DiscModel.State.RED),
						new DiscModel(DiscModel.State.RED), new DiscModel(DiscModel.State.RED) },
				{ new DiscModel(DiscModel.State.BLACK), new DiscModel(DiscModel.State.RED),
						new DiscModel(DiscModel.State.RED), new DiscModel(DiscModel.State.RED) } };
		
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				System.out.print(board[i][j].getState().name() + " ");;
			}
			System.out.println(" ");
		}
		
		assertTrue(BoardHelpers.checkWin(board, 4));
	}
		
	
	@Test
	public void test3() {
		
		
		DiscModel[][] board = { { new DiscModel(DiscModel.State.BLACK), new DiscModel(DiscModel.State.EMPTY),
				new DiscModel(DiscModel.State.EMPTY), new DiscModel(DiscModel.State.EMPTY) },

				{ new DiscModel(DiscModel.State.BLACK), new DiscModel(DiscModel.State.RED),
						new DiscModel(DiscModel.State.RED), new DiscModel(DiscModel.State.RED) },
				{ new DiscModel(DiscModel.State.BLACK), new DiscModel(DiscModel.State.RED),
						new DiscModel(DiscModel.State.RED), new DiscModel(DiscModel.State.RED) },
				{ new DiscModel(DiscModel.State.BLACK), new DiscModel(DiscModel.State.RED),
						new DiscModel(DiscModel.State.RED), new DiscModel(DiscModel.State.RED) } };
		
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				System.out.print(board[i][j].getState().name() + " ");;
			}
			System.out.println(" ");
		}
		
		assertTrue(BoardHelpers.checkWin(board, 4));
	}
	
	
	@Test
	public void test4() {
		
		
		DiscModel[][] board = { { new DiscModel(DiscModel.State.BLACK), new DiscModel(DiscModel.State.EMPTY),
				new DiscModel(DiscModel.State.EMPTY), new DiscModel(DiscModel.State.EMPTY) },

				{ new DiscModel(DiscModel.State.BLACK), new DiscModel(DiscModel.State.RED),
						new DiscModel(DiscModel.State.RED), new DiscModel(DiscModel.State.RED) },
				{ new DiscModel(DiscModel.State.BLACK), new DiscModel(DiscModel.State.RED),
						new DiscModel(DiscModel.State.RED), new DiscModel(DiscModel.State.RED) },
				{ new DiscModel(DiscModel.State.BLACK), new DiscModel(DiscModel.State.RED),
						new DiscModel(DiscModel.State.RED), new DiscModel(DiscModel.State.RED) } };
		
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				System.out.print(board[i][j].getState().name() + " ");;
			}
			System.out.println(" ");
		}
		
		assertTrue(BoardHelpers.checkWin(board, 4));
	}

}
