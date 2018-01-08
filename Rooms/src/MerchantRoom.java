import java.util.Random;

public class MerchantRoom extends Room
{

	public MerchantRoom(int poo, int loo)
	{
		super(poo, loo);
	}
	
//#yoloteleportz
	
	public void enterRoom(Person x) 
	{
		occupant = x;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
		System.out.println("\n" + getrando());
	}
	
	
	private static String getrando()
	{
		Random r = new Random();
		return random[r.nextInt(random.length)];	
	}
	
	private static String [] random= 
	{
		"Oh gosh. Where am I now, what's with the teleporting?",
		"*get le teleported*",
		"That darn teleportation messin up my flow."
	};
	
}
