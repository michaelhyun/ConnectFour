import java.util.function.IntPredicate;

public class BoardController {
	BoardView view;
	BoardModel boardModel;

	public static enum PlayerTurn {
		Player1, Player2
	};

	// PlayerTurn

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

	public void userClickedAtPoint(int x, int y, int windowWidth,
			int windowHeight, int discSize) {
		int[] clickIndex = getIndexOfClick(x, y, windowWidth, windowHeight,
				discSize);
		// checks if the user has not clicked a circle that is already colored
		// in
		if (isValidClick(clickIndex)) {
			System.out.println("isValid");
		}

	}

	private int[] getIndexOfClick(int x, int y, int windowWidth,
			int windowHeight, int discSize) {
		int clickIndex[] = new int[2];
		int clickIndexX = 0, clickIndexY = 0;
		for (int i = discSize / 2; i < windowWidth; i += (discSize + 10)) {
			for (int j = ((discSize / 2) + (discSize / 2)); j < windowHeight; j += (discSize + 10)) {
				if (Math.pow((x - i), 2) + Math.pow((y - j), 2) < Math.pow(
						(discSize / 2), 2)) {
					clickIndex[0] = clickIndexX;
					clickIndex[1] = clickIndexY;
					System.out.println(clickIndexX + ", " + clickIndexY);
					return clickIndex;
				}
				clickIndexY++;
			}
			clickIndexY = 0;
			clickIndexX++;
		}
		return null;
	}

	private boolean isValidClick(int[] clickIndex) {
		if (clickIndex != null) {
			switch (boardModel.getBoard()[clickIndex[1]][clickIndex[0]]
					.getState()) {
			case BLACK:
				return false;
			case RED:
				return false;
			case EMPTY:
				return true;
			default:
				return false;
			}
		} else {
			return false;
		}

	}

	public DiscModel[][] getBoard() {
		return this.boardModel.getBoard();
	}

	public BoardModel getBoardModel() {
		return boardModel;
	}
}
