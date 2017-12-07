package petrinetwork;
import java.util.List;
import java.util.ArrayList;

public class CoffeMachinePetriNetwork extends PetriNetwork{
	
	CoffeMachinePetriNetwork()
	{
		Location location0 = new Location("0", 1);
		Location location5 = new Location("5", 0);
		Location location10 = new Location("10", 0);
		Location location15 = new Location("15", 0);
	
		Transition transition1 = new Transition("5", new ArrayList<Arc>() {{ 
			add(new Arc(1, "LT", location5));
			add(new Arc(1, "TL", location0));
			}}		
		);
		transitionList.add(transition1);
		
		
		Transition transition2 = new Transition("5", new ArrayList<Arc>() {{ 
			add(new Arc(1, "LT", location10));
			add(new Arc(1, "TL", location5));
			}}		
		);
		transitionList.add(transition2);
		
		Transition transition3 = new Transition("5", new ArrayList<Arc>() {{ 
			add(new Arc(1, "LT", location15));
			add(new Arc(1, "TL", location10));
			}}		
		);
		transitionList.add(transition3);
		
		Transition transition4 = new Transition("10", new ArrayList<Arc>() {{ 
			add(new Arc(1, "LT", location10));
			add(new Arc(1, "TL", location0));
			}}		
		);
		transitionList.add(transition4);

		Transition transition5 = new Transition("10", new ArrayList<Arc>() {{ 
			add(new Arc(1, "LT", location15));
			add(new Arc(1, "TL", location5));
			}}		
		);
		transitionList.add(transition5);
		
		
	}
	
}
