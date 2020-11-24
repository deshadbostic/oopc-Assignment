
public class GamePiece 
{

    protected String type; //holds the type
    protected char symbol; //holds the symbol
    protected int rowPos; //holds the row position
    protected int colPos;  //holds the column position

    public GamePiece() 
    {
        type = "?";
        symbol = '?';
    }//GamePiece constructor 

    public void setType(String T) 
    {
        type = T;
    }//setType

    public String getType() 
    {
        return type;
    }//getType

    public void setSymbol(char S) 
    {
        symbol = S;
    }//setSymbol

    public char getSymbol() 
    {
        return symbol;
    }//getSymbol

    public void setRowPos(int rowP) 
    {
        rowPos = rowP;
    }//setRowPos

    public int getRowPos() 
    {
        return rowPos;
    }//getRowPos

    public void setColPos(int colP) 
    {
        colPos = colP;
    }//setColPos

    public int getColPos() 
    {
        return colPos;
    }//getColPos
}//GamePiece class
