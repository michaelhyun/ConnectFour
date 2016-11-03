/**
 * @author ravinsardal
 *
 */
public class BoardController {
	BoardView view;
	BoardModel boardModel;
	private boolean won;

	public static enum PlayerTurn {
		Player1, Player2
	};

	PlayerTurn turn;

	// PlayerTurn

	public void attachView(BoardView view) {
		this.view = view;
	}

	public BoardController(String player1Name, String player2Name,
			int boardHeight, int boardWidth, PlayerModel.Color player1Color,
			int sequenceLength) {
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
						player2Name, player2Color), sequenceLength);
		turn = PlayerTurn.Player1;
		won = false;
	}

	/**
	 * Responsible for notifying the Board Controller that a point was clicked
	 * 
	 * @param x
	 *            x-coordinate of user click
	 * @param y
	 *            y-coordinate of user click
	 * @param windowWidth
	 *            the width of the swing window frame
	 * @param windowHeight
	 *            the height of the swing window frame
	 * @param discSize
	 *            the size of the disc
	 */
	public void userClickedAtPoint(int x, int y, int windowWidth,
			int windowHeight, int discSize) {
		if (!won) {
			int[] clickIndex = getIndexOfClick(x, y, windowWidth, windowHeight,
					discSize);
			if (isValidClick(clickIndex)) {
				updateBoardModel(clickIndex);
				view.validate();
				view.repaint();
				if (BoardHelpers.checkWin(getBoard(), boardModel.getSequenceLength())) {
					won = true;
					switch (turn) {
					case Player1:
						view.displayGameWinPopup(boardModel.getPlayer1()
								.getName());
						break;
					case Player2:
						view.displayGameWinPopup(boardModel.getPlayer2()
								.getName());
					}
				}

				switch (turn) {
				case Player1:
					turn = PlayerTurn.Player2;
					break;
				case Player2:
					turn = PlayerTurn.Player1;
				default:
					break;
				}
			}
		}
	}

	/**
	 * Responsible for updating the model with the respective click index
	 * 
	 * @param clickIndex
	 *            the index of the click
	 */
	private void updateBoardModel(int[] clickIndex) {
		switch (turn) {
		case Player1:
			switch (boardModel.getPlayer1().getDiscColor()) {
			case RED:
				getBoard()[clickIndex[0]][clickIndex[1]]
						.setState(DiscModel.State.RED);
				break;
			case BLACK:
				getBoard()[clickIndex[0]][clickIndex[1]]
						.setState(DiscModel.State.BLACK);
				break;
			default:
				break;
			}
			break;
		case Player2:
			switch (boardModel.getPlayer2().getDiscColor()) {
			case RED:
				getBoard()[clickIndex[0]][clickIndex[1]]
						.setState(DiscModel.State.RED);
				break;
			case BLACK:
				getBoard()[clickIndex[0]][clickIndex[1]]
						.setState(DiscModel.State.BLACK);
				break;
			default:
				break;
			}
			break;
		default:
			break;
		}
	}

	/**
	 * Responsible for getting the array indices of the appropriate disc in the
	 * board
	 * 
	 * @param x
	 *            x-coordinate of user click
	 * @param y
	 *            y-coordinate of user click
	 * @param windowWidth
	 *            the width of the swing window frame
	 * @param windowHeight
	 *            the height of the swing window frame
	 * @param discSize
	 *            the size of the disc
	 * @return the indices of the disc in the respective model, returns null if
	 *         the click is not in a disc
	 */
	private int[] getIndexOfClick(int x, int y, int windowWidth,
			int windowHeight, int discSize) {
		int clickIndex[] = new int[2];
		int clickIndexX = 0, clickIndexY = 0;
		for (int i = discSize / 2; i < windowWidth; i += (discSize + 10)) {
			for (int j = ((discSize / 2) + (discSize / 2)); j < windowHeight; j += (discSize + 10)) {
				if (Math.pow((x - i), 2) + Math.pow((y - j), 2) < Math.pow(
						(discSize / 2), 2)) {
					clickIndex[0] = clickIndexY;
					clickIndex[1] = clickIndexX;
					return clickIndex;
				}
				clickIndexY++;
			}
			clickIndexY = 0;
			clickIndexX++;
		}
		return null;
	}

	/**
	 * Responsible for checking whether the click is on an empty space
	 * 
	 * @param clickIndex
	 *            the indices of the disc in the model
	 * @return the status of the click
	 */
	private boolean isValidClick(int[] clickIndex) {
		if (clickIndex != null) {
			// check if the clicked disc is empty
			switch (getBoard()[clickIndex[0]][clickIndex[1]].getState()) {
			case BLACK:
				return false;
			case RED:
				return false;
			case EMPTY:
				// check if click is at the bottom of the board
				if (getBoard().length - 1 == clickIndex[0]) {
					return true;
				}
				// check if there is one disc below
				switch (getBoard()[clickIndex[0] + 1][clickIndex[1]].getState()) {
				case BLACK:
					return true;
				case RED:
					return true;
				case EMPTY:
					return false;
				}
			}

		}
		return false;
	}

	public DiscModel[][] getBoard() {
		return this.boardModel.getBoard();
	}

	public BoardModel getBoardModel() {
		return boardModel;
	}
}
