
public class BoardHelpers {
	
	
	private static boolean checkHorizontal(DiscModel[][] board, int length){
		int count = 1;
		
		
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length-1; j++) {
				
				if (board[i][j].equals(board[i][j+1])){
					count++;
				}
				else{
					count = 1;
				}
			}
			if(count >= length){
				return true;
			}
			count = 1;
		}
		return false;
	}
	
	
	private static boolean checkVertical(DiscModel[][] board, int length){
		int count = 1;
		
		for (int j = 0; j < board[0].length; j++) {
			for (int i = 0; i < board.length - 1; i++) {
				
				if (board[i][j].equals(board[i+1][j])){
					count++;
				}
				else{
					count = 1;
				}
			}
			
			if(count >= length){
				return true;
			}
			count = 1;
		}
		return false;
	}
	
//	private static boolean checkDiagonal(int length){
//		int count = 0;
//		for (int j = 0; j < board[0].length; j++) {
//			for (int i = 0; i < board.length; i++) {
//				
//			}
//		}
//		
//		
//		return false;
//	}
	
	
	public static boolean checkWin(DiscModel[][] board, int length){

		if(checkVertical(board, length)){
			return true;
		}
		else if(checkHorizontal(board, length)){
			return true;
		}
//		else if(checkDiagonal(board, length)){
//			return true;
//		}
		else{
			return false;
		}
	}
}
