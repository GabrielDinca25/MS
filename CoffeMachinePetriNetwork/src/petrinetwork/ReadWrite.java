package petrinetwork;

import java.util.ArrayList;

public class ReadWrite extends PetriNetwork 
{
	ReadWrite()
	{
		Location location0 = new Location("0", 1);
		Location location1 = new Location("1", 0);
		Location location2 = new Location("2", 0);
		
		Transition transition1 = new Transition("read", new ArrayList<Arc>() {{ 
			add(new Arc(1, "TL", location1));
			add(new Arc(1, "LT", location0));
			}}		
		);
		transitionList.add(transition1);
		
		
		Transition transition2 = new Transition("endread", new ArrayList<Arc>() {{ 
			add(new Arc(1, "TL", location0));
			add(new Arc(1, "LT", location1));
			}}		
		);
		transitionList.add(transition2);
		
		Transition transition3 = new Transition("write", new ArrayList<Arc>() {{ 
			add(new Arc(1, "TL", location2));
			add(new Arc(1, "LT", location0));
			}}		
		);
		transitionList.add(transition3);
		
		Transition transition4 = new Transition("endwrite", new ArrayList<Arc>() {{ 
			add(new Arc(1, "TL", location0));
			add(new Arc(1, "LT", location2));
			}}		
		);
		transitionList.add(transition4);
	}
	
	
}
