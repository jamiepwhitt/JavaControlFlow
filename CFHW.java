import java.util.Scanner;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Collections;

class CFHW {
	//Ask question
	public static String askQuestion(Scanner scanner, String question) {
		System.out.print(question + " ");     // type a word and hit enter
		String userinput = scanner.next().toString();
		//int inputNum = Integer.parseInt(userinput);
		return userinput;
	}
	//lotto method
	public static void lotto(String favPetName, int favePetAge, int luckyNum, int modelYear, String actorName, int randoNum ) {
		Scanner lottoscanner = new Scanner(System.in);
		//int luckyJersey = lottoscanner.nextInt();
		//int random = ThreadLocalRandom.current().nextInt(75); 
		//int magicBall = random * luckyJersey;
		ArrayList<Integer> arrli = new ArrayList<Integer>(); 
		int lottoNum1;
		if (favPetName.length() >= 3) {
				lottoNum1 = Character.getNumericValue(favPetName.charAt(2));
		}else {
			lottoNum1 = 42; 
			
		}
		arrli.add(lottoNum1);
		int lottoNum2 = modelYear + luckyNum;
		arrli.add(lottoNum2);
		int random1 = ThreadLocalRandom.current().nextInt(75);
		int lottoNum3 = randoNum - random1;
		arrli.add(lottoNum3);
		int lottoNum4 = Character.getNumericValue(actorName.charAt(0));
		arrli.add(lottoNum4);
		int lottoNum5 = Character.getNumericValue(actorName.charAt(actorName.length()-1)); 
		arrli.add(lottoNum5);
		
		int random2 = ThreadLocalRandom.current().nextInt(75);
		int random3 = ThreadLocalRandom.current().nextInt(75);
		int magicBall = luckyNum * random2; 
		while(magicBall > 75) {
			magicBall -= 75;
		}
		Collections.sort(arrli);
		System.out.print("LOTTERY NUMBERS : " + arrli.get(0)+ ", "+ arrli.get(1)+ ", "+ arrli.get(2)+ ", "+ arrli.get(3)+ ", " + arrli.get(4)+" "); 
		System.out.print("MAGIC BALL : " + magicBall + " "); 
	}

	
	public static void main(String[] args) {
		Ascii.printNumbers();
		Ascii.printUpperCase();
		Ascii.printLowerCase(); 
		
		//Question Game
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter your name: ");     
		String username = scanner.next();
		System.out.println("Hello " + username);
		
		System.out.println("Do you wish to continue? Yes or No ");     
		String goon = scanner.next();
		if (goon.equals("Yes") || goon.equals("Y")) {
			boolean play = true;
			while(play) {
				 String redCar = askQuestion(scanner, "Do you have a red car? Yes or No" );
				 System.out.println(redCar);
				 
				 String favePet = askQuestion(scanner, "What is the name of your favorite pet?");
				 System.out.println(favePet);
				
				 String agePetS = askQuestion(scanner, "What is the age of your favorite pet?");
				 int agePet = Integer.parseInt(agePetS);
				 System.out.println(agePet);
				 
				 String luckyNum = askQuestion(scanner, "What is your lucky number?");
				 int luckyNumI = Integer.parseInt(luckyNum);
				 System.out.println(luckyNum);
				 
				 String faveQB = askQuestion(scanner, "Do you have a favorite quarterback? Yes or No");
				 System.out.println(faveQB);
				 int faveQBI;
				 if (faveQB.equals("Yes") || faveQB.equals("Y")) {
					 String faveQBNum = askQuestion(scanner, "What is his jersey number?");
					 faveQBI = Integer.parseInt(faveQBNum);
					 System.out.println(faveQBNum);
					 }
				 
				 String modelNum = askQuestion(scanner, "What is the two-digit number for the model year of your car?");
				 int modelNumI = Integer.parseInt(modelNum);
				 System.out.println(modelNum);
				 
				 String faveActor = askQuestion(scanner, "What is the first name of your favorite actor or actress?");
				 System.out.println(faveActor);
				 
				 String randomNum = askQuestion(scanner, "Pick a number between 1 and 50.");
				 int randomNumI = Integer.parseInt(randomNum);
				 System.out.println(randomNum);
				 
				 
				 
				 String keepPlaying = askQuestion(scanner, "Play the lotto?");
				 if (keepPlaying.equals("Yes") || keepPlaying.equals("Y")){
					//end of game
					
					 //Lotto Game
					 
					 lotto(favePet, agePet, luckyNumI, modelNumI, faveActor, randomNumI );
					  
					 //System.out.printf("%nWould you like to play again? 'Y' or 'N' %n" );
					 //Scanner sc = new Scanner(System.in);
					 String contNU = askQuestion(scanner, "\nWould you like to play again? 'Y' or 'N' \n" );//sc.nextLine();
					 if (!contNU.equals("Yes") && !contNU.equals("Y")) {
						 play = false;
						 System.out.println("Thank you for playing!");
					 }
						 


				 } else {
					 System.out.println("Thank you for playing!");
					 play = false;
					 //end of game system exit
				 }
				 
				 
				 
			}
		} else {
			System.out.println("Please return later to complete the survey.");
			System.exit(0);
		}
				
	}
 
}
