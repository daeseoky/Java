package ch07;

public interface RemoteControl {
	
	//추상메서드
	public abstract void powerOn(); // abstract는 생략 가능
	public abstract void powerOff();
	
	public void chUp();
	public void chDown();
	
	public void soundUp();
	public void soundDown();
	

}
