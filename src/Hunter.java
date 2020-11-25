import java.util.*;
public class Hunter extends GamePiece implements ControlActions, EatingActions
{
    Scanner input = new Scanner(System.in);
    private int energylevel;//holds hunter energy
    private char hname; //holds hunter symbol
    private int timesNotEaten;
    final public int MAXENERGY = 6; //holds max hunter energy
    
    public Hunter()
    {
        type ="hunter";
        symbol='H';
        energylevel= 4;
    }//Hunter constructor
    public void setEnergyLevel(int Nrglvl)
    {
        energylevel = Nrglvl;
    }//setEnergyLevel
    public int getEnerygLevel ()
    {
        return energylevel;
    }//getEnerygLevel
    public void setHname(char hxh)
    {
        hname=hxh;
    }//setHname
    public char getHname()
    {
        return hname;
    }//getwHname
    public int [] findNewPos(int direction)
    {
        int [] newPos = new int [2];
        int row=rowPos;
       int col=colPos;
         if(direction == 1)
        {
            row = row - 1;
        }
        else if(direction == 2)
        {
            row = row + 1;
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
            row = row - 1;
            
        }
        else if (direction == 6)
        {
            col = col - 1;
            row = row + 1;
            
        }
        else if (direction == 7)
        {
            col = col + 1;
            row = row + 1;
            
        }
        else if (direction == 8)
        {
            col = col + 1;
            row = row - 1;
            
        }
        else if (direction == 9)
        {
           //special
            
        }
         else if (direction == 10)
        {
           //special
            
        }
         else if (direction == 11)
        {
          //special
            
        }
         else if (direction == 12)
        {
          //special
            
        }
         newPos[0]=row;
        newPos[1]=col;
        return newPos;
    }

    public void moveToNewPos(int direction)
    {
         if(direction == 1)
        {
            rowPos = rowPos - 1;
        }
        else if(direction == 2)
        {
            rowPos = rowPos + 1;
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
            rowPos = rowPos - 1;
            
        }
        else if (direction == 6)
        {
            colPos = colPos - 1;
            rowPos = rowPos + 1;
            
        }
        else if (direction == 7)
        {
            colPos = colPos + 1;
            rowPos = rowPos + 1;
            
        }
        else if (direction == 8)
        {
            colPos = colPos + 1;
            rowPos = rowPos - 1;
             
        }
    }
    public void setTimesNotEaten(int notEaten)
    {
        timesNotEaten = notEaten;
    }
    public int getTimesNotEaten()
    {
        return timesNotEaten;
    }
    public void eatNorth()
    {
    
    }
    public void eatSouth()
    {
    
    }
    public void eatEast()
    {
    
    }
    public void eatWest()
    {
    
    }
}
