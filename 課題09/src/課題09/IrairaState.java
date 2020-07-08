package 課題09;

public class IrairaState extends DogState {
	
	private static IrairaState s = new IrairaState();
	
	private IrairaState() {}
	
	public static DogState getInstance() {
		return s;
	}

	@Override
	public void tukareta(Dog yobidashimoto) {
		// none
	}

	@Override
	public void tabeta(Dog yobidashimoto) {
		yobidashimoto.changeState(TanoshiiState.getInstance());
	}
	
	public String toString() {
		return "いらいら状態";
	}

}
