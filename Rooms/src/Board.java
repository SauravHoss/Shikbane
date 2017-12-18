public class Board 
{
    private static Room[][] gaem;
    
    public Board(Room[][] gaem)
    {
        this.gaem = gaem;
    }

    public static void printMap()
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
