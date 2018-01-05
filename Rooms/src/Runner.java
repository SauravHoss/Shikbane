import java.util.Random;
import java.util.Scanner;

public class Runner 
{
	private static boolean gameOn = true;
	
	public static void main(String[] args)
	{

		System.out.println("					   SQUARE ENIX \n");
		System.out.println("					     PRESENTS \n");
		System.out.println("			   An original by Daniel Li and Saurav Hossain.\n\n\n");
		System.out.println("					    SHIKABANE\n\n\n");
		System.out.println("			Welcome to a world of misery. Press 'Enter' to Begin.");
		
		Room[][] building = new Room[11][11];
		
		//Fill the building with rooms
		for (int x = 0; x<building.length; x++)
		{
			for (int y = 0; y < building[x].length; y++)
			{
				building[x][y] = new Room(x,y);
			}
		}
		
		//Create a winning room.
		building[5][6] = new WinningRoom(0, 0);
		
		//Create killer rooms.
		building[0][1] = new CollegeApps(0,0);
		building[1][1] = new CollegeApps(0,0);
		building[3][1] = new CollegeApps(0,0);
		building[4][1] = new CollegeApps(0,0);
		building[5][1] = new CollegeApps(0,0);
		building[6][1] = new CollegeApps(0,0);
		building[8][1] = new CollegeApps(0,0);
		building[4][2] = new CollegeApps(0,0);
		building[5][2] = new CollegeApps(0,0);		
		building[6][2] = new CollegeApps(0,0);
		building[9][2] = new CollegeApps(0,0);
		building[10][2] = new CollegeApps(0,0);
		building[1][3] = new CollegeApps(0,0);
		building[2][3] = new CollegeApps(0,0);
		building[4][3] = new CollegeApps(0,0);
		building[5][3] = new CollegeApps(0,0);
		building[10][3] = new CollegeApps(0,0);
		building[1][4] = new CollegeApps(0,0);
		building[2][4] = new CollegeApps(0,0);
		building[7][4] = new CollegeApps(0,0);
		building[8][4] = new CollegeApps(0,0);
		building[10][4] = new CollegeApps(0,0);
		building[4][5] = new CollegeApps(0,0);
		building[6][5] = new CollegeApps(0,0);
		building[7][5] = new CollegeApps(0,0);		
		building[8][5] = new CollegeApps(0,0);
		building[10][5] = new CollegeApps(0,0);
		building[0][6] = new CollegeApps(0,0);
		building[1][6] = new CollegeApps(0,0);		
		building[10][6] = new CollegeApps(0,0);
		building[1][7] = new CollegeApps(0,0);
		building[2][7] = new CollegeApps(0,0);		
		building[3][7] = new CollegeApps(0,0);
		building[4][7] = new CollegeApps(0,0);
		building[6][7] = new CollegeApps(0,0);
		building[8][7] = new CollegeApps(0,0);
		building[10][7] = new CollegeApps(0,0);
		building[1][8] = new CollegeApps(0,0);
		building[2][8] = new CollegeApps(0,0);		
		building[3][8] = new CollegeApps(0,0);
		building[5][8] = new CollegeApps(0,0);
		building[6][8] = new CollegeApps(0,0);
		building[8][8] = new CollegeApps(0,0);
		building[9][8] = new CollegeApps(0,0);
		building[10][8] = new CollegeApps(0,0);
		building[0][10] = new CollegeApps(0,0);
		building[3][10] = new CollegeApps(0,0);		
		building[4][10] = new CollegeApps(0,0);
		
		//Create get a life rooms.
		building[8][2] = new BRoom(0,0);
		building[3][5] = new BRoom(0,0);
		building[5][5] = new BRoom(0,0);
		building[6][6] = new BRoom(0,0);
		building[9][7] = new BRoom(0,0);
		building[8][10] = new BRoom(0,0);
		
		//Create teleporters.
		building[2][0] = new MerchantRoom(10,10);
		building[6][10] = new MerchantRoom(10,0);
		building[1][10] = new MerchantRoom(5,7);
		
		//Create a board.
		Board game = new Board(building);
		
		//Setup player 1 and the input scanner
		Scanner in1 = new Scanner(System.in);
		String FirstName = in1.nextLine();
		
		Person player1 = new Person("FirstName", "FamilyName", 0,0);
		building[0][0].enterRoom(player1);
		Scanner in = new Scanner(System.in);
		while(gameOn)
		{
			System.out.println("\nWhich way should I go? (Choose N, S, E, W)" +  "\n_______________________________________________"+  "\n\n\n\n");
			String move = in.nextLine();
			if(validMove(move, player1, building))
			{
				System.out.println("\nMy Coordinates: Row = " + player1.getxLoc() + " Col = " + player1.getyLoc() + "					Lives:" + player1.lives + "\n");
				game.printMap();
			}
			else 
			{
				System.out.println(getrandoz() + "\n");
				game.printMap();
			}
				
		}
		in.close();
	}
	
	public static boolean validMove(String move, Person p, Room[][] map)
	{
		move = move.toLowerCase().trim();
		switch (move) 
		{
			case "n":
				if (p.getxLoc() > 0)
				{
					map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
					map[p.getxLoc()-1][p.getyLoc()].enterRoom(p);
					return true;
				}
				else
				{
					return false;
				}
			case "e":
				if (p.getyLoc()< map[p.getyLoc()].length -1)
				{
					map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
					map[p.getxLoc()][p.getyLoc() + 1].enterRoom(p);
					return true;
				}
				else
				{
					return false;
				}

			case "s":
				if (p.getxLoc() < map.length - 1)
				{
					map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
					map[p.getxLoc()+1][p.getyLoc()].enterRoom(p);
					return true;
				}
				else
				{
					return false;
				}

			case "w":
				if (p.getyLoc() > 0)
				{
					map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
					map[p.getxLoc()][p.getyLoc()-1].enterRoom(p);
					return true;
				}
				else
				{
					return false;
				}
			default:
				break;
					
		}
		return true;
	}
	
	public static void gameOff()
	{
		gameOn = false;
	}
	
	private static String getrandoz()
	{
		Random r = new Random();
		return randomz[r.nextInt(randomz.length)];	
	}
	
	private static String [] randomz= 
	{
		"Nuh-uh.",
		"Can't go that way.",
		"I must say no.",
		"Not that way boss.",
		"Can't go that way.",
		"I ain't running face first into a wall.",
		"Ain't no door over there.",
		"Negative."
	};
}
