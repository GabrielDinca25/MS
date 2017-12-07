package petrinetwork;

public class Arc {
	public int capacity;
	public String direction;
	public Location location;
	
	Arc(int capacity, String direction, Location location)
	{
		this.capacity = capacity;
		this.direction = direction;
		this.location = location;
	}
	
	public boolean isValid()
	{
		if((direction == "LT" && capacity < location.tokens) || direction == "TL")
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public void Update() 
	{
		if(direction == "LT")
		{
			location.tokens -= capacity;
		}
		else
		{
			location.tokens += capacity;
		}
	}
	
}
