
public class Player 
{
    
    private String name;  //Player //fields
    
    public Player()
    {
        name = null;
    }//Player constructor
    
    public Player(String P)
    {
        name = P;
    }//Player overloaded constructor
    public void setPlayer(String N)
    {
        name = N;
    }//setPlayer
    public String getPlayer ()
    {
        return name;
    }//getPlayer
}//Player class
