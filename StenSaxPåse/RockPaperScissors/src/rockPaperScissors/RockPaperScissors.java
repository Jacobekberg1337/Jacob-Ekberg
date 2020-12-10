package rockPaperScissors;
import java.util.Scanner;
import java.util.Random;
public class RockPaperScissors {


	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		Random Rand = new Random();
		
		int compScore = 0; // Datorns Po�ng
		int userScore = 0; // Mina po�ng
		int counter = 0;   // r�nkare 
		
		System.out.println("Enter your name: ");
		String name = Scan.nextLine(); // h�r f�r man skriva i sitt namn s� spelet kommer ih�g
		
		while (counter == 0) {
			//V�ljer ett random nummer mellan 1-3 
			int compChoice = 1 + Rand.nextInt(3);
			
			
			System.out.println("Enter Number:");
			System.out.println("1 = Rock");
			System.out.println("2 = paper");
			System.out.println("3 = Scissors");
			
			int playerChoice = Scan.nextInt();
			// om playerChoice == compChoice f�r ingen po�ng och det blir lika 
			if (playerChoice == compChoice) {
				System.out.println("Its a draw");
				
					
			}
			
			else if (playerChoice == 1) {	//om spelaren v�ljer 1 som �r rock och datorn v�ljer 2 som �r paper f�rlorar spelaren
				if(compChoice == 2) {
					System.out.println("Computer chose paper");
					System.out.println("You lost this round "+ name );
					compScore ++; //h�r l�gger spelet till ett po�ng till datorn
					System.out.println("computer: " + compScore);
					System.out.println(name + ":" +userScore);
				}else if(compChoice == 3) { // om datorn v�ljer 3 som �r sicssors vinner spelaren och det skrivs ut under 
					System.out.println("Computer chose scissors");
					System.out.println("You won this round"+ name);
					userScore++; // h�r l�gger spelet till ett po�ng till spelaren
					System.out.println("Computer:" + compScore);
					System.out.println(name + ":" +userScore);
					
					
				}
			}
			else if (playerChoice == 2) { //kommade code �r samma som den �vre men siffrorna �r utbytta s� att om man v�ljer 2 tex och datorn 1 vinner man och om datorn v�ljer 3 f�rlorar man
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
				
				//om spelaren f�r 5 po�ng �r spelet �ver och d� stoppas loopen och avslutar spelet 
				if (userScore == 5) {
					System.out.println("You won the game");
					counter++; 
					
				}
				// h�r �r om datorn vinner d� stoppas loopen och spelet �r �ver 
				if (compScore == 5) {
					System.out.println("You lost the game");
					counter++;
				}
				
				
				
				
				
			
			
			}
		}
		
		
		
		

	}


