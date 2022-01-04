package loops1;

public class Question2 {
	
	public static void main (String[] args) {
		// for (init; boolean exp; increment) ( some code
		for (int windspeed = 20; windspeed <= 200; windspeed++) {
		// category 1
		if (windspeed >= 74 && windspeed <= 95) {
			System.out.println("Category 1 Hurricane:" + windspeed);
		} else if (windspeed >= 105 && windspeed <= 110) {
			System.out.println("Category 2 Hurricane:" + windspeed);
		} else if (windspeed >= 120 && windspeed <= 130) {
			System.out.println("Category 3 Hurricane:" + windspeed);
		} else if (windspeed >= 140 && windspeed <= 155) {
			System.out.println("Category 4 Hurricane:" + windspeed);
		} else if (windspeed >= 165 && windspeed <= 200) {
			System.out.println("Category 5 Hurricane:" + windspeed);
		} else {
			System.out.println("no Hurricane:"+ windspeed);
		}
		}
	}

}
