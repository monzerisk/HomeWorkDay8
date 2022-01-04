package loops;

public class Question1 {
	
	public static void main(String[] args) {

		for (int i = 1; i <= 36; i++) {

			if (i % 3 == 0 && i % 5 == 0) {

				System.out.println("COzaLoza");

			} else if (i % 3 == 0) {
				System.out.println("Coza");

			} else if (i % 5 == 0) {
				System.out.println("Loza");

			} else if (i % 7 == 0) {
				System.out.println("Woza");

			} else {

				System.out.println(i);
			}
		}
	}
}


