
/**
 * @author ravinsardal
 *
 */
public class PlayerModel {
	public static enum Color{RED, BLACK, EMPTY};
	private String name;

	private Color discColor;
	
	public PlayerModel(String name, Color discColor){
		this.name = name;
		this.discColor = discColor;
	}
	
	public Color getDiscColor() {
		return discColor;
	}
	
	public String getName() {
		return name;
	}
}
