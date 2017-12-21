public class Board 
{
    private Room[][] game;
    
	public Board(Room[][] game)
    {
        this.game = game;
    }

    public void printMap()
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
