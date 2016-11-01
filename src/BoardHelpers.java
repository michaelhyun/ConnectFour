
public class BoardHelpers {

	private static boolean checkHorizontal(DiscModel[][] board, int length) {
		int count = 1;

		// just check to see if length is valid
		int horizontalMax = board[0].length;
		if (length > horizontalMax) {
			System.err.print("Length is invalid: Unable to make horizontal match");
			return false;
		}

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length - 1; j++) {
				if (board[i][j].equals(board[i][j + 1]) && !board[i][j].getState().name().equals("EMPTY")) {
					count++;
				}
				else{
					count =1;
				}
			}
			if (count >= length) {
				return true;
			}
			count = 1;
		}
		return false;
	}

	private static boolean checkVertical(DiscModel[][] board, int length) {
		int count = 1;

		// just check to see if length is valid
		int verticalMax = board.length;
		if (length > verticalMax) {
			System.err.print("Length is invalid: Unable to make vertical match");
			return false;
		}

		for (int j = 0; j < board[0].length; j++) {
			for (int i = 0; i < board.length - 1; i++) {
				if (board[i][j].equals(board[i + 1][j]) && !board[i][j].getState().name().equals("EMPTY")) {
					count++;
				}
				else{
					count =1;
				}
			}

			if (count >= length) {
				return true;
			}
			count = 1;
		}
		return false;
	}

	
	
	private static boolean checkDiagonal(DiscModel[][] board, int length) {

		// check if diagonal length is valid (smaller of the two: length or
		// width)
		int diagonalMax = Math.min(board[0].length, board.length);
		if (length > diagonalMax) {
			System.err.println("Length is invalid: Unable to make diagonal match");
			return false;
		}

		 int count = 1;

		// Top Left to Bottom Right
		for (int i = 0; i < board[0].length; i++) {
			for (int j = 0; j < board.length; j++) {
				for (int x = i, y = j; x < board[0].length-1 && y < board.length-1; x++, y++)
				{
					DiscModel disc = board[x][y];
					if (disc.equals(board[x+1][y+1]) && !board[x][y].getState().name().equals("EMPTY"))
						count++;
					else
						count = 1;
					if (count == length)
						return true;
				}
				count = 1;
			}
			count = 1;
		}
		
		
		//Top Right to Bottom Left
		count = 1;
		for (int i = board[0].length-1; i > 0; i--) {
			for (int j = 0; j < board.length; j++) {
				for (int x = i, y = j; x > 0  && y < board.length-1 ; x--, y++) 
				{
					DiscModel disc = board[x][y];
					if (disc.equals(board[x-1][y+1]) && !board[x][y].getState().name().equals("EMPTY"))
						count++;
					else
						count = 1;
					if (count == length)
						return true;
				}
				count = 1;
			}
			count = 1;
		}

		return false;
	}

	public static boolean checkWin(DiscModel[][] board, int length) {

		if (checkVertical(board, length)) {
			return true;
		} else if (checkHorizontal(board, length)) {
			return true;
		}
		else if(checkDiagonal(board, length)){
		 return true;
		 }
		else {
			return false;
		}
	}
}
