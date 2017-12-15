public class Board 
{
    private Room[][] gaem;
    
    public Board(Room[][] gaem)
    {
        this.gaem = gaem;
    }

    public void printMap()
    {

        for(Room[] row : gaem)
        {
            for (Room room : row)
            {
                room.print();
            }
            System.out.println();
        }
    }
}
