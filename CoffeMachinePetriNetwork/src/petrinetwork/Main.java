package petrinetwork;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			
		PetriNetwork coffeeMachine = new CoffeMachinePetriNetwork();
		
		String option;
		Scanner scanner = new Scanner(System.in);
		while(true)
		{
			System.out.println("Your option: ");
			option = ""  + scanner.nextInt();
			coffeeMachine.execute(option);
		}

	}

}
