
public class Hunter extends GamePiece implements ControlActions
{
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
    public int findNewPos(int direction)
    {
        return 0;
    }
    public boolean checkNewPos(int row,int col)
    {
        return true;
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
}
