package petrinetwork;
import java.util.List;
import java.util.ArrayList;

public class Transition {
	public String tag;
	public List<Arc> arcList = new ArrayList<>();
	
	Transition(String tag, List<Arc> arcList)
	{
		this.tag = tag; 
		this.arcList = arcList;
	}
	
	public boolean isValid()
	{
		for(Arc arc : arcList)
		{
			if(arc.isValid() == false)
			{
				return false;
			}
		}
		return true;
	}
	
	public ArrayList<Location> GetArcsLocation()
	{
		ArrayList<Location> locationList = new ArrayList<>();
		for(Arc arc : arcList)
		{
			locationList.add(arc.location);
		}
		return locationList;
	}
	
	public void Update() 
	{
		for(Arc arc : arcList)
		{
			arc.Update();
		}
	}
	
	
}
