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
    }//getHname
    public int [] findNewPos(int direction)
    {
  int row;
        int col;
        int [] newPos = new int [2];
        direction = input.nextInt();
        if(direction == 1)
        {
            System.out.println("You chose to go north");
            row = rowPos - 1;
            newPos[0] = row;
            return newPos;
        }
        else if(direction == 2)
        {
            System.out.println("You chose to go south");
            row = rowPos + 1;
            newPos[0] = row;
            return newPos;
        }
        else if (direction == 3)
        {
            System.out.println("You chose to go east");
            col = colPos + 1;
            
            
        }
        else if (direction == 4)
        {
            System.out.println("You chose to go west");
            col = colPos - 1;
           
        }
        else if (direction == 5)
        {
            System.out.println("You chose to go north-west");
            row = rowPos - 1;
            col = colPos - 1;
            
        }
        else if (direction == 6)
        {
            System.out.println("You chose to go south-west");
            row = rowPos + 1;
            col = colPos - 1;
            
        }
        else if (direction == 7)
        {
            System.out.println("You chose to go sotuh-east");
            row = rowPos + 1;
            col = colPos + 1;
            
        }
        else if (direction == 8)
        {
            System.out.println("You chose to go north-east");
            row = rowPos - 1;
            col = colPos + 1;
            
        }
        return newPos;
    }

    public void moveToNewPos(int direction)
    {
        
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
