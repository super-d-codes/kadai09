package 課題09;

public class TanoshiiState extends DogState {
	
	private static TanoshiiState s = new TanoshiiState();
	
	private TanoshiiState() {}
	
	public static DogState getInstance() {
		return s;
	}

	@Override
	public void tukareta(Dog yobidashimoto) {
		yobidashimoto.changeState(FutsuuState.getInstance());
	}

	@Override
	public void tabeta(Dog yobidashimoto) {
		// none
	}
	
	public String toString() {
		return "楽しい状態";
	}

}
