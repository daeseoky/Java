package ch07;

public class Cable implements Socket{
	
	private Bulb bulb;
	
	public Cable(Bulb bulb) {
	
		this.bulb = bulb;
	
	}
	@Override
	public void swithOn() {
		bulb.lightOn();
	}

	@Override
	public void swithOff() {
		bulb.lightOff();
	}

}
