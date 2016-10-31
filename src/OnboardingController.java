import javax.swing.JOptionPane;

/**
 * @author ravinsardal
 *
 */
public class OnboardingController {
	public OnboardingController() {
		showOnboardingViews();
	}

	private void showOnboardingViews() {

		String player1Name = JOptionPane
				.showInputDialog("Please enter the name of player 1:");
		String player2Name = JOptionPane
				.showInputDialog("Please enter the name of player 2:");
		String boardDimensionsStr[] = JOptionPane
				.showInputDialog(
						"Please enter the board dimensions.\nFormat: numDiscsVertical x numDiscsHorizontal\neg: 5 x 4")
				.split("x");
		String[] colorOptions = new String[] { "Red", "Black" };

		PlayerModel.Color player1Color = (JOptionPane.showOptionDialog(null,
				"Choose Player 1 color", "Color", JOptionPane.DEFAULT_OPTION,
				JOptionPane.PLAIN_MESSAGE, null, colorOptions, colorOptions[0]) == 0 ? PlayerModel.Color.RED
				: PlayerModel.Color.BLACK);

		BoardView gui = new BoardView(new BoardController(player1Name,
				player2Name, Integer.parseInt(boardDimensionsStr[0]),
				Integer.parseInt(boardDimensionsStr[1]), player1Color));
	}
}
