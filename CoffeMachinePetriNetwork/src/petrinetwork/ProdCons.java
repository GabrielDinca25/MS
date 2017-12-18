package petrinetwork;

import java.util.ArrayList;

public class ProdCons extends PetriNetwork {
	
	ProdCons()
	{
		Location location0 = new Location("0", 10);
		Location location1 = new Location("1", 0);
		Location location2 = new Location("2", 0);
		Location location3 = new Location("3", 1);
		Location location4 = new Location("4", 0);
		Location location5 = new Location("5", 10);
		Location location6 = new Location("6", 10);
		
		Transition transition1 = new Transition("1", new ArrayList<Arc>() {{ 
			add(new Arc(1, "0", location0));
			add(new Arc(1, "1", location1));
			}}		
		);
		transitionList.add(transition1);
		
		Transition transition2 = new Transition("2", new ArrayList<Arc>() {{ 
			add(new Arc(1, "0", location1));
			add(new Arc(1, "1", location0));
			add(new Arc(1, "1", location2));
			add(new Arc(1, "0", location5));
			add(new Arc(1, "1", location3));
			add(new Arc(1, "0", location4));
			}}		
		);
		transitionList.add(transition2);
		
		Transition transition3 = new Transition("3", new ArrayList<Arc>() {{ 
			add(new Arc(1, "0", location2));
			add(new Arc(1, "1", location5));
			add(new Arc(1, "0", location3));
			add(new Arc(1, "1", location3));
			add(new Arc(1, "0", location6));
			add(new Arc(1, "1", location4));
			}}		
		);
		transitionList.add(transition3);
		
		Transition transition4 = new Transition("4", new ArrayList<Arc>() {{ 
			add(new Arc(1, "0", location4));
			add(new Arc(1, "1", location6));
			}}		
		);
		transitionList.add(transition4);

	}
	
	
}
