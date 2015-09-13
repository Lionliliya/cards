package coloredNumbers;

public class Numbers {

	public static void main(String[] args) {
		int red=0;
		int blue=100;
		int yellow=0;
		int green=0;
		
		for (int i = 1; i<=100; i++) {
			if(((i%3)==0)&&((i%5)==0)) {
				green++;
			} else if ((i%3)==0) {
				red++;
			} else if((i%2)==0) {
				yellow++;
			} 
			
			}
			blue -=red+yellow+green;
			System.out.println("red = "+red);
			System.out.println("yellow = "+yellow);
			System.out.println("green = "+green);
			System.out.println("blue = "+blue);
		}
		
		
	
	}


