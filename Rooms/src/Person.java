
public class Person {
	String firstName;
	String familyName;
	int xLoc, yLoc;
	int lives = 3;
	
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
	
	//Basically kills the person by limiting lives (or "loves")  
	public void deder(Person x) 
	{
		if (lives !=0)
		{
		lives--;
		}
		else 
		{
			System.out.print("I can love no more.");
			Runner.gameOff();
		}
	}

	public void print() 
	{
		
	}


}
