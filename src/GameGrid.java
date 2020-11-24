
import java.util.*;

public class GameGrid 
{

    Scanner input = new Scanner(System.in);
    private int numRows; //holds the number of rows
    private int numCols; //holds the number of colums
    private GamePiece[][] grid; //creates a grid of type GamePiece
    private Player player1; //player1 object
    private Player player2; //player2 object
    private int numzhen; //holds number of zhens
    private int[] hunter1Coord;//holds hunter1 coordinates
    private int[] hunter2Coord; //holds hunter2 coordinates
    private int numHunters; //holds number of hunters
    private Hunter Hsymbol1 = new Hunter(); //object for hunter1
    private Hunter Hsymbol2 = new Hunter(); //object for hunter2
    private Bramble setBram = new Bramble(); //object for brambles
    private Zhen setZhen = new Zhen();  //object for zhens
     
    public GameGrid() 
    {
        numRows = 8;
        numCols = 8;
        grid = new GamePiece[numRows][numCols];

    }//GameGrid constructor
       
    public boolean addGamePiece(GamePiece piece, int row, int col) 
    {

        boolean output = false;
        if (grid[row][col].getSymbol() == '?') 
        {

            if (piece.getType().equals("hunter")) 
            {
                grid[row][col] = new Hunter();
            }
            if (piece.getType().equals("zhen")) 
            {
                grid[row][col] = new Zhen();
            }
            if (piece.getType().equals("bramble")) 
            {
                grid[row][col] = new Bramble();
            }

            grid[row][col].setRowPos(row);
            grid[row][col].setColPos(col);
            output = true;
            return output;

        }//endif 
        else 
        {
            return output;
        }//endelseif

    }//addGamePiece

    public void setUpGrid() 
    {
        for(int num1 = 0; num1<numRows;num1++)
        {
            for(int num2 = 0;num2<numCols;num2++)
            {
                grid[num1][num2] = new GamePiece();
            }
        }//endfor
        //allows the grid to store GamePiece
        hunter1Coord = new int [2];
        hunter2Coord = new int [2];
        player1 = new Player();
        player2 = new Player();
        char symbol1;
        char symbol2;
        System.out.println("Enter name for player 1.This player will be the Zhens");
        String name1 = input.next(); //allows user to input zhen name
        System.out.println("Enter the name for player 2. This player will be the Hunter");
        String name2 = input.next(); //allows user to input hunter name
        System.out.println("The hunter's pieces on the board will be represented by Symbols, which are letters. Please choose two (2) Symbols, all but z/Z are allowed");
        System.out.print("Symbol 1: ");
        symbol1 = input.next().charAt(0);
        while (symbol1 == 'z' || symbol1 == 'Z')
        {
            System.out.println("Symbol 1 was invalid.Please enter a new symbol.");
            symbol1 = input.next().charAt(0);   
        }//error checking ensuring the correct symbol is entered 
        System.out.print("Symbol 2: ");
        symbol2 = input.next().charAt(0);
        while(symbol2 == 'z' || symbol2 =='Z')
        {
             System.out.println("Symbol 2 was invalid.Please enter a new symbol.");
             symbol2 = input.next().charAt(0);
        }//error checking ensuring the correct symbol is entered
        numHunters = 2;// inputs how many hunters are in the game

        System.out.println("The game ZhenHunters can be played with three options of zhens. The options are 16, 18 ,and 20. Please enter one ");
        numzhen = input.nextInt();//allows the user to choose how many zhens they will play with
        while (numzhen != 16 && numzhen != 18 && numzhen != 20) {
            System.out.println("Please enter 16, 18 or 20 to continue");
            numzhen = input.nextInt();
        }//error checking ensuring that the user only enters 16, 18 or 20 

        Hsymbol1.setHname(symbol1);//sets hunter1 symbol
        Hsymbol2.setHname(symbol2);//sets hunter2 sumbol

        player1.setPlayer(name1);//sets player1 name
        player2.setPlayer(name2);//sets player2 name
        
        for (int x = 0; x <= 1; x++) 
        {
            for (int y = 0; y <= 7; y++) 
            {
                if (y == 0 || y == 1 || y == 6 || y == 7) 
                {
                    addGamePiece(setBram, x, y);

                }//endif
            }//endfor
        }//endfor
        // set Brambles to the top left and right of the grid
        for (int x = 6; x <= 7; x++) 
        {
            for (int y = 0; y <= 7; y++) 
            {
                if (y == 0 || y == 1 || y == 6 || y == 7) 
                {
                    addGamePiece(setBram, x, y);

                }//endif
            }//endfor
        }//endfor
        // set Brambles to the bottom left and right of the grid
        
        if (numzhen == 16) 
        {
            for (int x = 0; x <= 1; x++) 
            {
                for (int y = 2; y <= 5; y++) 
                {
                    addGamePiece(setZhen, x, y);
                }//endfor
            }//endfor 
            //places zhens into the first two rows
            //into the 3rd to 6th position 
            
            for (int x = 2; x <= 2; x++) 
            {
                for (int y = 0; y <= 7; y++) 
                {
                    addGamePiece(setZhen, x, y);
                }//endfor
            }//endfor
            //places zhens into the entire 3rd row
        }//endif
        //places 16 zhens on the grid
        
        if (numzhen == 18) 
        {
            for (int x = 0; x <= 1; x++) 
            {
                for (int y = 2; y <= 5; y++) 
                {
                    addGamePiece(setZhen, x, y);
                }//endfor
            }//endfor
            //places zhens into the first two rows
            //into the 3rd to 6th position
            
            for (int x = 2; x <= 2; x++) 
            {
                for (int y = 0; y <= 7; y++) 
                {
                    addGamePiece(setZhen, x, y);
                }//endfor
            }//endfor
            //places zhens into the entire 3rd row
            
            for (int x = 3; x <= 3; x++) 
            {
                for (int y = 0; y <= 7; y++) 
                {
                    if (y == 0 || y == 7) 
                    {
                        addGamePiece(setZhen, x, y);
                    }//endif
                    //this places the zhens into the 1st and 7th row
                }//endfor
            }//endfor
            //places zhens into the 4th row

        }//endif
        //places 18 zhens on the gird 
        
        if (numzhen == 20) 
        {
            for (int x = 0; x <= 1; x++) 
            {
                for (int y = 2; y <= 5; y++) 
                {
                    addGamePiece(setZhen, x, y);
                }//endfor
            }//endfor
            //places zhens into the first two rows
            //into the 3rd and 6th position
            
            for (int x = 2; x <= 2; x++) 
            {
                for (int y = 0; y <= 7; y++) 
                {
                    addGamePiece(setZhen, x, y);
                }//endfor
            }//endfor
            //places zhens into the entire 3rd row
            
            for (int x = 3; x <= 4; x++) 
            {
                for (int y = 0; y <= 7; y++) 
                {
                    if (y == 0 || y == 7) 
                    {
                        addGamePiece(setZhen, x, y);
                    }//endif
                    //places zhens into the 1st and 7th row 
                }//endfor
            }//endfor
            //places zhens into the 4th and 5th row
        }//endsif
        //places 20 zhens on the grid
        
        for (int x = 4; x <= 4; x++) 
        {
            for (int y = 0; y <= 7; y++) 
            {
                if (y == 3) 
                {
                    addGamePiece(Hsymbol1, x, y);
                    hunter1Coord[0]=x;
                    hunter1Coord[1]=y;
                  
                }//endif 
                else if (y == 4) 
                {
                    addGamePiece(Hsymbol2, x, y);
                    hunter2Coord[0]=x;
                    hunter2Coord[1]=y;
                }//endelseif
            }//endfor
           
        }//endfor
        //places the hunter onto the grid
       
  
        
                
    }//setUpGrid

    public void displayGrid() 
    {
        char blank;
        blank = ' ';
        for (int i = 0; i < grid.length; i++) 
        {
            System.out.println("  ... ... ... ... ... ... ... ...");//formatting
            for (int j = 0; j < grid[i].length; j++) 
            {
                 if(grid[i][j].getSymbol() == '?')
                 {
                     grid[i][j].setSymbol(blank);
                 }//endif
                 //places blanks into ?
                System.out.print(" | " + grid[i][j].getSymbol());
               

            }//endfor
            System.out.println(" | ");//formatting
        }//endfor
        //loops through and shows grid
        System.out.println("  ... ... ... ... ... ... ... ...");//formatting 

        System.out.println("Hunter " + Hsymbol1.getHname() + " energy: " + Hsymbol1.getEnerygLevel());
        System.out.println("Hunter " + Hsymbol2.getHname() + " energy: " + Hsymbol2.getEnerygLevel());
        System.out.println("Number of Zhens are: " + numzhen);
    }//displayGrid()
  public void displayMovementOptions(int player)
  {
      System.out.println("Please select what type of Move you would like to play \n");
      if(player == 1)
      {
            System.out.println("potential moces are west or right");
      }//hunter
      if(player == 2)
      {
          System.out.println("potential moces are west or right");
      }//zhen
     if(player!=1 && player!=2){
         System.out.println("Error not valid");
     }
  }//displayMovementOptions
  boolean validateMove(int row, int col)
  {
      // not included  findNewPos( 23);
           if(!(row>numRows || col >numRows))
           {
                if(grid[row][col].getSymbol() == '?')
      {
          return true;
      }else
      {
             //crowding exception       
      }
           }else{
               //edge exception
           }
     
      return false;
  }//validateMove
  boolean isZhenPosition(int rowPos, int colPos)
  {
       if(grid[rowPos][colPos].getSymbol() == 'z')
      {
          return true;
      }
    return false;  
  }//isZhenPosition
  boolean removePiece(int rowPos, int colPos)
  {
         if(grid[rowPos][colPos].getSymbol() == 'z')
      {
          //grid=new GamePiece[numRows][numCols];
             grid[rowPos][colPos] = new GamePiece();
          return true;
      }
      
    return false;  
  }//removePiece
}//GameGrid class
