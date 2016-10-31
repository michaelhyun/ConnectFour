
/**
 * @author ravinsardal
 *
 */
public class DiscModel {
	public static enum State{RED, BLACK, EMPTY};
	private State state;
	
	public DiscModel(State state){
		this.state = state;
	}
	
	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	
	

}
