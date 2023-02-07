package nivi.org.demo.current_load;

import java.util.Scanner;

public class HomeAppliance {
	private int fan = 1;
	private int light = 2; 
	private int tv = 3;

	private int nofan = 0;
	private int nolight = 0; 
	private int notv = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		new HomeAppliance().getAction(sc);

		sc.close();
	}
	private void getAction(Scanner sc) {
		int action = -1;
		while( action != 0) {
			System.out.println("Switch on / off ");
			System.out.println("1. Switch ON FAN \n 2. Switch ON LIGHT \n 3. Switch ON TV");
			System.out.println("11. Switch OFF FAN \n 22. Switch OFF LIGHT \n 33. Switch OFF TV");
			System.out.println("Switch OFF all press 0");
			action = sc.nextInt();
			if(action == 0) {
				break;
			}
			this.onOrOff(action);
			System.out.println(this.currentLoad());	
		}
	}
	private int currentLoad() {
		int fanVol = this.fan * this.nofan;
		int lightVol = this.light * this.nolight;
		int tvVol = this.tv * this.notv;
		return fanVol + lightVol+ tvVol;
	}
	private void onOrOff(int act) {
		switch( act) {
		case 1: 
			this.nofan++;
			break;
		case 2: 
			this.nolight++;
			break;
		case 3: 
			this.notv++;
			break;
		case 11: 
			if(nofan > 0) {
				this.nofan--;
			}
			break;
		case 22: 
			if(nolight > 0) {
				this.nolight--;
			}
			break;
		case 33: 
			if(notv > 0) {
				this.notv--;
			}
			break;
		}
	}


}
