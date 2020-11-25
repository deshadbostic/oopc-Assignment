import java.util.*;

public class ZhenHunters 
{
   
    public static void main(String args[]) 
    {
        int[] newlocation;
         Scanner input= new Scanner(System.in); //Allows for the use of the keyboard
        System.out.println("Welcome to the game ZhenHunters");
        GameGrid game = new GameGrid(); //GameGrid Object
        game.setUpGrid(); //calls the setUpGrid method
         // System.out.println("Please enter a number to move: \n 1 to move north \n 2 to move south \n 3 to move east \n 4 to move west \n 5 to move north-west \n 6 to move south-west \n 7 to move south-east \n 8 to move north-east");
        //int answer = input.nextInt();
        
        
        System.out.println("Press Enter to continue"); // pauses the game until the user presses enter
        input.nextLine();
        
        System.out.println("This is the playing field for the game ZhenHunters");
        
        game.displayGrid(); //displays the displayGrid
        while(game.endgame())
        {
            
        
        System.out.println("please select a zhen to move by entering the row first press ENTER and then the column of its current location");
        //neds ti be fixed 
        int row = input.nextInt();
        int col = input.nextInt();
        while(!game.isZhenPosition(row,col)) //needs values
        {
            System.out.println("The location you entered was invalid a zhen isnt located on that square ");
            System.out.println("please select a zhen to move by entering the row first press ENTER and then the column of its current location");
             row = input.nextInt();
             col = input.nextInt();
            //invalid position
        }
        game.displayMovementOptions(1);
        int direction = input.nextInt();
        //get direction 
        newtype=game.getpiece(row,col);
        newlocation=newtype.findpos();
        while(!game.validateMove(newlocation[0],newlocation[1]))
        {
            //invalid move
        }
        game.movepiece(row, col);
        game.displayGrid();
        System.out.println("it is your turn to play hunter");
          game.displayMovementOptions(2);
          
        }
    }//main
    
}//ZhenHunters class
