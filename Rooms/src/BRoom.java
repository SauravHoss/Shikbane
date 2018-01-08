import java.util.Random;

public class BRoom extends Room 
{
	public BRoom(int xp, int yp) 
	{
		super(xp, yp);
	}
	
	@Override
	public void enterRoom(Person x) 
	{
		occupant = x;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
		x.lives++;
		System.out.println("\n" + getrando());
		
	}
	
	private static String getrando()
	{
		Random r = new Random();
		return random[r.nextInt(random.length)];	
	}
	
	private static String [] random= 
	{
		"Sweet, a one up. Crap, I'm back at spawn.",
		"*gets teleported back to spawn again*",
		
	};
	
}
