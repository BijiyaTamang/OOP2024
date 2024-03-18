package week5;

public class Lights {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bulb bulb1=new Bulb(false);
		Bulb bulb2=new Bulb(false);
		
		bulb1.turnOn();
		bulb2.turnOn();
		
		System.out.println("Bulb 1 is on: " + bulb1.isOn());
        System.out.println("Bulb 2 is on: " + bulb2.isOn());
        
        bulb1.turnOff();
        bulb2.turnOff();
        
        System.out.println("Bulb 1 is on: " + bulb1.isOn());
        System.out.println("Bulb 2 is on: " + bulb2.isOn());
	}

}
