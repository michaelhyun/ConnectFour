import static org.junit.Assert.*;

import org.junit.Test;

public class BoardHelpersTester {

	@Test
	public void testHorizontal() throws InvalidLengthException {
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
	public void testDiagonal() throws InvalidLengthException {
		
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
	public void testDiagonal2() throws InvalidLengthException {
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
	public void testVertical() throws InvalidLengthException {
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
	public void testConnect3() throws InvalidLengthException {
		//3 in row
		
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
	public void testEmpty() throws InvalidLengthException {
		//Empty		
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
	public void testFalse() throws InvalidLengthException {
		//None
		
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
