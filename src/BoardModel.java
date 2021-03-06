/**
 * @author ravinsardal
 *
 */
public class BoardModel {
	private DiscModel[][] board;
	private PlayerModel player1;
	private PlayerModel player2;
	private int boardWidth, boardHeight;
	private int sequenceLength;

	public BoardModel(DiscModel[][] board, PlayerModel player1,
			PlayerModel player2, int sequenceLength) {
		this.board = board;
		this.player1 = player1;
		this.player2 = player2;
		boardHeight = board.length;
		boardWidth = board[0].length;
		this.sequenceLength = sequenceLength;
		populateEmptyBoard();
	}

	public int getBoardWidth() {
		return boardWidth;
	}

	public int getBoardHeight() {
		return boardHeight;
	}
	
	public void setBoard(DiscModel[][] board, Object o) {
		if (o instanceof BoardController) {
			this.board = board;
		}
	}

	public DiscModel[][] getBoard() {
		return this.board;
	}

	public PlayerModel getPlayer1() {
		return this.player1;
	}

	public PlayerModel getPlayer2() {
		return this.player2;
	}
	
	public int getSequenceLength() {
		return sequenceLength;
	}

	private void populateEmptyBoard() {

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				board[i][j] = new DiscModel(DiscModel.State.EMPTY);
			}
		}
	}
}
