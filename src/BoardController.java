public class BoardController {
	BoardView view;
	BoardModel boardModel;

	public void attachView(BoardView view) {
		this.view = view;
	}

	public BoardController(String player1Name, String player2Name,
			int boardHeight, int BoardWidth, PlayerModel.Color player1Color) {
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
		
		boardModel = new BoardModel(new DiscModel[BoardWidth][boardHeight],
				new PlayerModel(player1Name, player1Color), new PlayerModel(
						player2Name, player2Color));
	}
	
	public DiscModel[][] getBoard(){
		return this.boardModel.getBoard();
	}
}
