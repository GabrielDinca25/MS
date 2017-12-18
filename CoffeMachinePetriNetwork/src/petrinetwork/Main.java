package petrinetwork;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			
		PetriNetwork coffeeMachine = new CoffeMachinePetriNetwork();
		ReadWrite readerWriter = new ReadWrite();
		ProdCons prodCons = new ProdCons();
		String option;
		Scanner scanner = new Scanner(System.in);
		while(true)
		{
			System.out.println("Your option: ");
			option = scanner.nextLine();
			//coffeeMachine.execute(option);
			//readerWriter.execute(option);
			prodCons.execute(option);
			//System.out.println("Current State: " + prodCons.getCurrentState());
		}

	}

}
