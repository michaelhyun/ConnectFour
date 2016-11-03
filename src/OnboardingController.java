import javax.swing.JOptionPane;

/**
 * @author ravinsardal
 *
 */
public class OnboardingController {

	private final String PLAYER_1_NAME = "Player 1";
	private final String PLAYER_2_NAME = "Player 2";

	public OnboardingController(String[] args) {
		showOnboardingViews(args);
	}

	private void showOnboardingViews(String[] args) {

		int boardDimensions = Integer.parseInt(args[0]);
		int sequenceLength = Integer.parseInt(args[1]);

		BoardView gui = new BoardView(new BoardController(PLAYER_1_NAME,
				PLAYER_2_NAME, boardDimensions, boardDimensions, PlayerModel.Color.RED,sequenceLength));
	}
}
