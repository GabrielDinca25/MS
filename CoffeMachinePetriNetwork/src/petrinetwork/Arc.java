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
		if(direction.equals("1"))
		{
			return true;
		}
		else
		{
			return (capacity <= location.tokens);
		}
	}
	
	public void Update() 
	{
		if(direction.equals("1"))
		{
			location.tokens -= capacity;
		}
		else
		{
			location.tokens += capacity;
		}
	}
	
}
