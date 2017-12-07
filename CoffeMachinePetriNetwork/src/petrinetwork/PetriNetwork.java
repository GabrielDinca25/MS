package petrinetwork;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class PetriNetwork {
	List<Transition> transitionList = new ArrayList<>();
	
	String getCurrentState()
	{
		if(transitionList.isEmpty())
		{
			System.out.println("Transition List is empty");
		}
		for(Transition transition : transitionList)
		{	
			ArrayList<Location> locationList = new ArrayList<>();
			locationList = transition.GetArcsLocation();
			if(locationList.isEmpty())
			{
				System.out.println("Location List is empty");
			}
			for(Location location : locationList)
			{
				if(location.tokens == 1)
				{
					return location.tag;
				}
			}
		}
		return "404";
	}
	
	void execute(String tag) 
	{	
		System.out.println("Current State: " + getCurrentState());
		List<Transition> validTransitions = new ArrayList<>();

		for(Transition transition : transitionList)
		{
			if(transition.tag == tag && transition.isValid())
			{
				validTransitions.add(transition);
			}
		}
		
		for(Transition transition : validTransitions)
		{
			transition.Update();
		}
	}
	
}
