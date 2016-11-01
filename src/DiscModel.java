
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

	@Override
	public boolean equals(Object other){
		DiscModel disc = (DiscModel)other;
		if(this.state == disc.getState()){
			return true;
		}
		else{
			return false;
		}
	}
	

}
