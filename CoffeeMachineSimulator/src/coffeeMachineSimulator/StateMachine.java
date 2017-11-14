package coffeeMachineSimulator;

import java.util.HashMap;
import java.util.Map;

public abstract class StateMachine {
	int currentState;
	public HashMap<Integer, HashMap<Integer, Integer>> transitionTable;
	
	StateMachine()
	{

	}
	
	public void run() 
	{}
	
	
	public void Transition(int action)
	{
		currentState = action;
	}
	
} 
