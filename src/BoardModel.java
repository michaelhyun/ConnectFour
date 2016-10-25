
public class BoardModel {
	private DiscModel[][] board;
	private PlayerModel player1;
	private PlayerModel player2;
	
	public BoardModel(DiscModel[][] board, PlayerModel player1, PlayerModel player2){
		this.board = board;
		this.player1 = player1;
		this.player2 = player2;
		populateEmptyBoard();
	}
	
	public DiscModel[][] getBoard(){
		return this.board;
	}
	
	public PlayerModel getPlayer1(){
		return this.player1;
	}
	
	public PlayerModel getPlayer2(){
		return this.player2;
	}
	
	private void populateEmptyBoard(){
		for (int i = 0; i < board[0].length; i++) {
			for (int j = 0; j < board.length; j++) {
				board[i][j] = new DiscModel(DiscModel.State.EMPTY);
			}
			
		}
	}
}
