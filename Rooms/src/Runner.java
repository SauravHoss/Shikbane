import java.util.Scanner;

public class Runner {
	
	private static boolean gameOn = true;
	
	public static void main(String[] args)
	{
		Room[][] building = new Room[11][11];
		
		//Fill the building with empty rooms
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
		building[0][1] = new CollegeApps(3,3);

		//Create get a life rooms.
		building[1][3] = new BRoom(0,0);
		
		//Create teleporters.
		building[2][0] = new MerchantRoom(10,10);
		building[10][0] = new MerchantRoom(6,10);
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
			System.out.println("Which way should I go? (Choose N, S, E, W)" + "\n");
			String move = in.nextLine();
			if(validMove(move, player1, building))
			{
				System.out.println("My Coordinates: Row = " + player1.getxLoc() + " Col = " + player1.getyLoc() + "					Lives:" + player1.lives);
				game.printMap();
			}
			else 
			{
				System.out.println("I can't go that way.");
				game.printMap();
			}
				
		}
		in.close();
	}
	
	public static boolean validMove(String move, Person p, Room[][] map)
	{
		move = move.toLowerCase().trim();
		switch (move) {
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
}
