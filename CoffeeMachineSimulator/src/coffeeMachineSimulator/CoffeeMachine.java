package coffeeMachineSimulator;

import java.util.HashMap;
import java.util.Scanner;

public class CoffeeMachine extends StateMachine {

	CoffeeMachine()
	{		
		transitionTable = new HashMap<Integer, HashMap<Integer, Integer>>();
		
		HashMap<Integer, Integer> state0 = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> state5 = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> state10 = new HashMap<Integer, Integer>();
		
		state0.put(5,5);
		state0.put(10, 10);
		
		state5.put(5, 10);
		state5.put(10, 15);
		
		state10.put(5, 15);
		state10.put(10, 20);

		transitionTable.put(0, state0);
		transitionTable.put(5, state5);
		transitionTable.put(10, state10);
		
		currentState=0;
	}
	
	@Override
	public void run()
	{
		Scanner scanner = new Scanner(System.in);
		int action;

		while(true)
		{
			System.out.println("Credit: $" + currentState);
			System.out.println("Enter a bill: ");
			action = scanner.nextInt();
			if(action == 5 || action == 10)
			{
				if(transitionTable.get(currentState).get(action)!=null)
				{
					currentState = transitionTable.get(currentState).get(action);
				}
				else
				{
					System.out.println("\nInvalid option");
				}
				if(currentState >= 15)
				{
					currentState -=15;
					System.out.println("\nYou have enough credit for a cofee(price $15). \nYou have bought a coffee ");
					//break;
				}
			}
			else
			{
				System.out.println("\n Enter only $5 and $10 bills");
			}
			
		}
	}
}
