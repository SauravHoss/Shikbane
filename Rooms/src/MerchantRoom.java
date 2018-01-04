
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
		System.out.println("What happened? Where am I? How?");
	}
	
}
