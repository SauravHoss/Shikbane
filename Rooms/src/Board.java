public class Board 
{
    private static Room[][] game;
    
    @SuppressWarnings("static-access")
	public Board(Room[][] game)
    {
        this.game = game;
    }

    public static void printMap()
    {

        for(Room[] row : game)
        {
            for (Room room : row)
            {
                room.print();
            }
            System.out.println();
        }
    }
}
