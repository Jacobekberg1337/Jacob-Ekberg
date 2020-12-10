package rockPaperScissors;
import java.util.Scanner;
import java.util.Random;
public class RockPaperScissors {


	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		Random Rand = new Random();
		
		int compScore = 0; // Datorns Poäng
		int userScore = 0; // Mina poäng
		int counter = 0;   // ränkare 
		
		System.out.println("Enter your name: ");
		String name = Scan.nextLine(); // här får man skriva i sitt namn så spelet kommer ihåg
		
		while (counter == 0) {
			//Väljer ett random nummer mellan 1-3 
			int compChoice = 1 + Rand.nextInt(3);
			
			
			System.out.println("Enter Number:");
			System.out.println("1 = Rock");
			System.out.println("2 = paper");
			System.out.println("3 = Scissors");
			
			int playerChoice = Scan.nextInt();
			// om playerChoice == compChoice får ingen poäng och det blir lika 
			if (playerChoice == compChoice) {
				System.out.println("Its a draw");
				
					
			}
			
			else if (playerChoice == 1) {	//om spelaren väljer 1 som är rock och datorn väljer 2 som är paper förlorar spelaren
				if(compChoice == 2) {
					System.out.println("Computer chose paper");
					System.out.println("You lost this round "+ name );
					compScore ++; //här lägger spelet till ett poäng till datorn
					System.out.println("computer: " + compScore);
					System.out.println(name + ":" +userScore);
				}else if(compChoice == 3) { // om datorn väljer 3 som är sicssors vinner spelaren och det skrivs ut under 
					System.out.println("Computer chose scissors");
					System.out.println("You won this round"+ name);
					userScore++; // här lägger spelet till ett poäng till spelaren
					System.out.println("Computer:" + compScore);
					System.out.println(name + ":" +userScore);
					
					
				}
			}
			else if (playerChoice == 2) { //kommade code är samma som den övre men siffrorna är utbytta så att om man väljer 2 tex och datorn 1 vinner man och om datorn väljer 3 förlorar man
				if (compChoice == 1) {
					System.out.println("Computer chose rock");
					System.out.println("You won this round" + name);
					userScore++;
					System.out.println("Computer: " + compScore);
					System.out.println(name + ":" +userScore);
				} else if (playerChoice == 3) {
					System.out.println("Computer chose Scissors");
					System.out.println("You lost this round");
					compScore++;
					System.out.println("Computer: " + compScore);
					System.out.println(name + ":" +userScore);
				}
			}
			else if (playerChoice == 3) {
				if (compChoice == 1) {
					System.out.println("Computer chose rock");
					System.out.println("You lost this round");
					compScore++;
					System.out.println("computer: " + compScore);
					System.out.println(name + ":" +userScore);
					
				}else if (compChoice == 2 ) {
					
					System.out.println("Computer chose paper");
					System.out.println("You won this round" + name);
					userScore++;
					System.out.println("Computer: " + compScore);
					System.out.println(name + ":" +userScore);
				}	
					
					
				}
				
				//om spelaren får 5 poäng är spelet över och då stoppas loopen och avslutar spelet 
				if (userScore == 5) {
					System.out.println("You won the game");
					counter++; 
					
				}
				// här är om datorn vinner då stoppas loopen och spelet är över 
				if (compScore == 5) {
					System.out.println("You lost the game");
					counter++;
				}
				
				
				
				
				
			
			
			}
		}
		
		
		
		

	}


