import java.util.*;
public class Zhen extends GamePiece implements ControlActions
{
    Scanner input = new Scanner(System.in);
    public Zhen()
    {
        type = "zhen";
        symbol= 'z';
    }//Zhen constructor 
    public int[] findNewPos(int direction)
    {
       int row=rowPos;
       int col=colPos;
        if(direction == 1)
        {
            row = row + 1;
        }
        else if(direction == 2)
        {
            row = row - 1;
        }
        else if (direction == 3)
        {
            col = col + 1;
        }
        else if (direction == 4)
        {
            col = col - 1;
        }
        else if (direction == 5)
        {
            col = col - 1;
            row = row + 1;
            
        }
        else if (direction == 6)
        {
            col = col - 1;
            row = row - 1;
            
        }
        else if (direction == 7)
        {
            col = col + 1;
            row = row - 1;
            
        }
        else if (direction == 8)
        {
            col = col + 1;
            row = row + 1;
            
        }
        int a[]=new int[2];
        return a;
    }

    public void moveToNewPos(int direction)
    {
        if(direction == 1)
        {
            rowPos = rowPos + 1;
        }
        else if(direction == 2)
        {
            rowPos = rowPos - 1;
        }
        else if (direction == 3)
        {
            colPos = colPos + 1;
        }
        else if (direction == 4)
        {
            colPos = colPos - 1;
        }
        else if (direction == 5)
        {
            colPos = colPos - 1;
            rowPos = rowPos + 1;
            
        }
        else if (direction == 6)
        {
            colPos = colPos - 1;
            rowPos = rowPos - 1;
            
        }
        else if (direction == 7)
        {
            colPos = colPos + 1;
            rowPos = rowPos - 1;
            
        }
        else if (direction == 8)
        {
            colPos = colPos + 1;
            rowPos = rowPos + 1;
            
        }
        
    }
}//Zhen class
