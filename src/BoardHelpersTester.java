import static org.junit.Assert.*;

import org.junit.Test;

public class BoardHelpersTester {

	@Test
	public void test() throws InvalidLengthException {
		//Horizontal
		
		
		DiscModel[][] board = { { new DiscModel(DiscModel.State.EMPTY), new DiscModel(DiscModel.State.EMPTY),
				new DiscModel(DiscModel.State.EMPTY), new DiscModel(DiscModel.State.EMPTY) },

				{ new DiscModel(DiscModel.State.RED), new DiscModel(DiscModel.State.RED),
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
	public void test2() throws InvalidLengthException {
		
		//Diagonal Top left to Bottom Right
		DiscModel[][] board = { { new DiscModel(DiscModel.State.BLACK), new DiscModel(DiscModel.State.EMPTY),
				new DiscModel(DiscModel.State.EMPTY), new DiscModel(DiscModel.State.EMPTY) },

				{ new DiscModel(DiscModel.State.BLACK), new DiscModel(DiscModel.State.BLACK),
						new DiscModel(DiscModel.State.RED), new DiscModel(DiscModel.State.RED) },
				{ new DiscModel(DiscModel.State.BLACK), new DiscModel(DiscModel.State.RED),
						new DiscModel(DiscModel.State.BLACK), new DiscModel(DiscModel.State.RED) },
				{ new DiscModel(DiscModel.State.RED), new DiscModel(DiscModel.State.RED),
						new DiscModel(DiscModel.State.RED), new DiscModel(DiscModel.State.BLACK) } };
		
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				System.out.print(board[i][j].getState().name() + " ");;
			}
			System.out.println(" ");
		}
		
		assertTrue(BoardHelpers.checkWin(board, 4));
	}
		
	
	@Test
	public void test3() throws InvalidLengthException {
		//Diagonal Right Top to Bottom Left
		
		DiscModel[][] board = { { new DiscModel(DiscModel.State.BLACK), new DiscModel(DiscModel.State.EMPTY),
				new DiscModel(DiscModel.State.EMPTY), new DiscModel(DiscModel.State.BLACK) },

				{ new DiscModel(DiscModel.State.RED), new DiscModel(DiscModel.State.RED),
						new DiscModel(DiscModel.State.BLACK), new DiscModel(DiscModel.State.RED) },
				{ new DiscModel(DiscModel.State.BLACK), new DiscModel(DiscModel.State.BLACK),
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
	public void test4() throws InvalidLengthException {
		//Vertical
		
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
	public void test5() throws InvalidLengthException {
		//Vertical
		
		DiscModel[][] board = { { new DiscModel(DiscModel.State.RED), new DiscModel(DiscModel.State.EMPTY),
				new DiscModel(DiscModel.State.EMPTY), new DiscModel(DiscModel.State.EMPTY) },

				{ new DiscModel(DiscModel.State.BLACK), new DiscModel(DiscModel.State.RED),
						new DiscModel(DiscModel.State.RED), new DiscModel(DiscModel.State.RED) },
				{ new DiscModel(DiscModel.State.BLACK), new DiscModel(DiscModel.State.RED),
						new DiscModel(DiscModel.State.RED), new DiscModel(DiscModel.State.RED) },
				{ new DiscModel(DiscModel.State.BLACK), new DiscModel(DiscModel.State.RED),
						new DiscModel(DiscModel.State.RED), new DiscModel(DiscModel.State.EMPTY) } };
		
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				System.out.print(board[i][j].getState().name() + " ");;
			}
			System.out.println(" ");
		}
		
		assertTrue(BoardHelpers.checkWin(board, 3));
	}
	@Test
	public void test6() throws InvalidLengthException {
		//Vertical
		
		DiscModel[][] board = { { new DiscModel(DiscModel.State.EMPTY), new DiscModel(DiscModel.State.EMPTY),
				new DiscModel(DiscModel.State.EMPTY), new DiscModel(DiscModel.State.EMPTY) },

				{ new DiscModel(DiscModel.State.EMPTY), new DiscModel(DiscModel.State.EMPTY),
						new DiscModel(DiscModel.State.EMPTY), new DiscModel(DiscModel.State.EMPTY) },
				{ new DiscModel(DiscModel.State.EMPTY), new DiscModel(DiscModel.State.EMPTY),
							new DiscModel(DiscModel.State.EMPTY), new DiscModel(DiscModel.State.EMPTY) },
				{ new DiscModel(DiscModel.State.EMPTY), new DiscModel(DiscModel.State.EMPTY),
								new DiscModel(DiscModel.State.EMPTY), new DiscModel(DiscModel.State.EMPTY)} };
		
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				System.out.print(board[i][j].getState().name() + " ");;
			}
			System.out.println(" ");
		}
		
		assertFalse(BoardHelpers.checkWin(board, 3));
	
	}
	
	
	@Test
	public void test7() throws InvalidLengthException {
		//Vertical
		
		DiscModel[][] board = { { new DiscModel(DiscModel.State.EMPTY), new DiscModel(DiscModel.State.EMPTY),
				new DiscModel(DiscModel.State.EMPTY), new DiscModel(DiscModel.State.RED) },

				{ new DiscModel(DiscModel.State.EMPTY), new DiscModel(DiscModel.State.EMPTY),
						new DiscModel(DiscModel.State.EMPTY), new DiscModel(DiscModel.State.RED) },
				{ new DiscModel(DiscModel.State.EMPTY), new DiscModel(DiscModel.State.EMPTY),
							new DiscModel(DiscModel.State.EMPTY), new DiscModel(DiscModel.State.EMPTY) },
				{ new DiscModel(DiscModel.State.EMPTY), new DiscModel(DiscModel.State.RED),
								new DiscModel(DiscModel.State.EMPTY), new DiscModel(DiscModel.State.RED)} };
		
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				System.out.print(board[i][j].getState().name() + " ");;
			}
			System.out.println(" ");
		}
		
		assertFalse(BoardHelpers.checkWin(board, 3));
	}

}
