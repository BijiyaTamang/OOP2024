package week5;

public class Bulb {
	private boolean isOn;

	public Bulb(boolean isOn) {
		this.isOn = isOn;
	}
	public void turnOn()
	{
		isOn=true;
		System.out.println("Bulb is now on.");
	}
	public void turnOff() {
		isOn=false;
		System.out.println("Bulb is now off.");
	}
	public boolean isOn() {
		return isOn;
	}
}
