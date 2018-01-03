
public class Person {
	String firstName;
	String familyName;
	int xLoc, yLoc;
	int loves = 3;
	
	public int getxLoc() {
		return xLoc;
	}

	public void setxLoc(int xLoc) {
		this.xLoc = xLoc;
	}

	public int getyLoc() {
		return yLoc;
	}

	public void setyLoc(int yLoc) {
		this.yLoc = yLoc;
	}

	public Person (String firstName, String familyName, int xLoc, int yLoc)
	{
		this.firstName = firstName;
		this.familyName = familyName;
		this.xLoc = xLoc;
		this.yLoc = yLoc;
	}
	
	public void deder(Person x) 
	{
		if (loves !=0)
		{
		loves--;
		}
		else 
		{
			Runner.gameOff();
		}
	}

	public void print() 
	{
		// TODO Auto-generated method stub
		
	}


}
