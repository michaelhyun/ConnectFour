
public class BoardHelpers {

	private static boolean checkHorizontal(DiscModel[][] board, int length) throws InvalidLengthException {
		int count = 1;

		// just check to see if length is valid
		int horizontalMax = board[0].length;
		if (length > horizontalMax) {
			throw new InvalidLengthException("Length is invalid: Unable to make horizontal match");
		}

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length - 1; j++) {
				if (board[i][j].equals(board[i][j + 1]) && !board[i][j].getState().name().equals("EMPTY")) {
					count++;
				}
				else{
					count =1;
				}
				if (count >= length) {
					return true;
				}
			}

			count = 1;
		}
		return false;
	}

	private static boolean checkVertical(DiscModel[][] board, int length) throws InvalidLengthException {
		int count = 1;

		// just check to see if length is valid
		int verticalMax = board.length;
		if (length > verticalMax) {
			throw new InvalidLengthException("Length is invalid: Unable to make vertical match");
		}

		for (int j = 0; j < board[0].length; j++) {
			for (int i = 0; i < board.length - 1; i++) {
				if (board[i][j].equals(board[i + 1][j]) && !board[i][j].getState().name().equals("EMPTY")) {
					count++;
				}
				else{
					count =1;
				}
				if (count >= length) {
					return true;
				}
			}
			count = 1;
		}
		return false;
	}

	
	
	private static boolean checkDiagonal(DiscModel[][] board, int length) throws InvalidLengthException {

		// check if diagonal length is valid (smaller of the two: length or
		// width)
		int diagonalMax = Math.min(board[0].length, board.length);
		if (length > diagonalMax) {
			throw new InvalidLengthException("Length is invalid: Unable to make diagonal match");
		}

		 int count = 1;
		 		 
		// Top Left to Bottom Right
		for (int i = 0; i < board[0].length-1; i++) {
			for (int j = 0; j < board.length-1; j++) {
				for (int x = i, y = j; x < board[0].length && y < board.length; x++, y++){
					
					DiscModel disc = board[y][x];
					try{
						if (disc.equals(board[y+1][x+1]) && !board[y][x].getState().name().equals("EMPTY")){
							count++;
						}
						else{
							count = 1;
						}
					}
					catch (Exception e){
						break;
					}
					if (count == length){
						return true;
					}
				}
				count = 1;
			}
			count = 1;
		}
		
		
		//Top Right to Bottom Left
		count = 1;
		for (int i = board[0].length-1; i > 0; i--) {
			for (int j = 0; j < board.length-1; j++) {
				for (int x = i, y = j; x > 0  && y < board.length-1; x--, y++) 
				{
					DiscModel disc = board[y][x];
					try{
						if (disc.equals(board[y + 1][x - 1]) && !board[y][x].getState().name().equals("EMPTY")){
							count++;
						}
						else{
							count = 1;
						}
					}
					catch (Exception e){
						break;
					}
					
					if (count == length)
						return true;
				}
				count = 1;
			}
			count = 1;
		}

		return false;
	}

	public static boolean checkWin(DiscModel[][] board, int length) throws InvalidLengthException {

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
