public class BoardController {
	BoardView view;
	BoardModel boardModel;
	public static enum PlayerTurn{Player1, Player2};
//	PlayerTurn

	public void attachView(BoardView view) {
		this.view = view;
	}

	public BoardController(String player1Name, String player2Name,
			int boardHeight, int boardWidth, PlayerModel.Color player1Color) {
		PlayerModel.Color player2Color = null;
		
		switch (player1Color) {
		case RED:
			player2Color = PlayerModel.Color.BLACK;
			break;
		case BLACK:
			player2Color = PlayerModel.Color.RED;
			break;
		default:
			break;
		}
		
		boardModel = new BoardModel(new DiscModel[boardHeight][boardWidth],
				new PlayerModel(player1Name, player1Color), new PlayerModel(
						player2Name, player2Color));
	}
	
	public DiscModel[][] getBoard(){
		return this.boardModel.getBoard();
	}
	
	public BoardModel getBoardModel() {
		return boardModel;
	}
}
