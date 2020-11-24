import java.util.*;
public class Zhen extends GamePiece implements ControlActions
{
    Scanner input = new Scanner(System.in);
    public Zhen()
    {
        type = "zhen";
        symbol= 'z';
    }//Zhen constructor 
    public int findNewPos(int direction)
    {
        System.out.println("Please enter a number to move: \n 1 to move north \n 2 to move south \n 3 to move east \n 4 to move west \n 5 to move north-west \n 6 to move south-west \n 7 to move south-east \n 8 to move north-east");
        direction = input.nextInt();
        if(direction == 1)
        {
            colPos = colPos - 1;
            return direction;
        }
        else if(direction == 2)
        {
            colPos = colPos + 1;
            return direction;
        }
        else if (direction == 3)
        {
            rowPos = rowPos + 1;
            return direction;
        }
        else if (direction == 4)
        {
            rowPos = rowPos - 1;
            return direction;
        }
        else if (direction == 5)
        {
            colPos = colPos - 1;
            rowPos = rowPos - 1;
            return direction;
        }
        else if (direction == 6)
        {
            colPos = colPos + 1;
            rowPos = rowPos - 1;
            return direction;
        }
        else if (direction == 7)
        {
            colPos = colPos + 1;
            rowPos = rowPos + 1;
            return direction;
        }
        else if (direction == 8)
        {
            colPos = colPos - 1;
            rowPos = rowPos + 1;
            return direction;
        }
        return 0;
    }
    public boolean checkNewPos(int row,int col)
    {
        return true;
    }
    public void moveToNewPos(int direction)
    {
        
    }
}//Zhen class
