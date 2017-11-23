package coffeeMachineSimulator;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public abstract class StateMachine {
	int currentState;
	public HashMap<Integer, HashMap<Integer, Integer>> transitionTable;
	
	StateMachine()
	{

	}
	
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
					Transition(transitionTable.get(currentState).get(action));
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
	
	
	
	public void Transition(int action)
	{
		currentState = action;
	}
	
} 
