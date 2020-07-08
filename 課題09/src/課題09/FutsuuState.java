package 課題09;

public class FutsuuState extends DogState {
	
	private static FutsuuState s = new FutsuuState();
	
	private FutsuuState() {}
	
	public static DogState getInstance() {
		return s;
	}

	@Override
	public void tukareta(Dog yobidashimoto) {
		yobidashimoto.changeState(IrairaState.getInstance());		
	}

	@Override
	public void tabeta(Dog yobidashimoto) {
		yobidashimoto.changeState(TanoshiiState.getInstance());
	}
	
	public String toString() {
		return "普通状態";
	}

}
