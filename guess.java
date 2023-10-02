import java.util.Scanner;
public class guess {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String correctAnswer = "Emma";
		String guess = " ";
		int attempts = 0;
		do {
			System.out.println("Guess my name (type stop to exit)");
			guess = in.nextLine();

			if (!guess.equals("stop")) {
				attempts++;
			}
			if (guess.equals(correctAnswer)) {
				System.out.println("Congratulations!");
				break;
				
			}
			if (guess.equals("stop")) 
				
			break;
		}while(true);
		System.out.println("You guessed "+ attempts + " times.");
		

	}
    
}