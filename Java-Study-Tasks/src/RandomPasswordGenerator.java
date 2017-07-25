import java.util.Random;

public class RandomPasswordGenerator {

	/* Create random password generator
	1. Starting with a blank password. We create a random number generator.
	2. We generate twice a random capital letter and place it on
	random password position.
	3. Then we generate twice a random letter and put it randomly..
	4. We generate a random number and place it in a random position.
	5. We generate three times a random special symbol and place it at random .
	6. Until now, the password is 8 characters long. To complete it we set
	Up to 15 completely random characters at random places.
	 */
	
	private static final String CAPITAL_LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private static final String SMALL_LETTERS = "abcdefghijklmnopqrstuvwxyz";
	private static final String DIGITS = "0123456789";
	private static final String SPECIAL_CHARS = "~!@#$%^&*()_+=`{}[]\\|':;.,/?<>";
	private static final String ALL_CHARS = CAPITAL_LETTERS + SMALL_LETTERS + DIGITS + SPECIAL_CHARS;
	
	private static Random rand = new Random();
	
	public static void main(String[] args) {
		StringBuilder password = new StringBuilder();
		
		//Generate two random capital letters
		for (int i = 1; i<=2; i++){
			char capitalLetter = generateChar(CAPITAL_LETTERS);
			insertAtRandomPosition(password, capitalLetter);
		}
		//Generate two random small letters
		for (int i = 1; i<=2; i++){
			char smallLetter = generateChar(SMALL_LETTERS);
			insertAtRandomPosition(password, smallLetter);
		}
		// Generate one random digit
		char digit = generateChar(DIGITS);
		insertAtRandomPosition(password, digit);
		
		// Generate 3 special characters
		for(int i=1; i<=3; i++){
			char specialChar = generateChar(SPECIAL_CHARS);
			insertAtRandomPosition(password, specialChar);
		}
		// Generate few random characters (between 0 and 7)
		{
			int count = rand.nextInt(8);
			for (int i=1; i <=count; i++){
				char specialChar = generateChar(ALL_CHARS);
				insertAtRandomPosition(password, specialChar);
			}
		}
		System.out.println(password);
	}
	
	private static void insertAtRandomPosition( StringBuilder password, char character) {
		
		int randomPosition = rand.nextInt(password.length()+1);
		password.insert(randomPosition, character);
	}
	
	private static char generateChar(String availableChars) {
		int randomIndex = rand.nextInt(availableChars.length());
		char randomChar = availableChars.charAt(randomIndex);
		return randomChar;
	}
}
