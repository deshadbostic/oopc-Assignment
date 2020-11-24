import java.util.*;

public class ZhenHunters 
{
   
    public static void main(String args[]) 
    {
         Scanner input= new Scanner(System.in); //Allows for the use of the keyboard
        System.out.println("Welcome to the game ZhenHunters");
        GameGrid info = new GameGrid(); //GameGrid Object
        Zhen Zinfo = new Zhen();
        info.setUpGrid(); //calls the setUpGrid method
         // System.out.println("Please enter a number to move: \n 1 to move north \n 2 to move south \n 3 to move east \n 4 to move west \n 5 to move north-west \n 6 to move south-west \n 7 to move south-east \n 8 to move north-east");
        //int answer = input.nextInt();
        Zinfo.findNewPos(0);
        
        System.out.println("Press Enter to continue"); // pauses the game until the user presses enter
        input.nextLine();
        
        System.out.println("This is the playing field for the game ZhenHunters");
        info.displayGrid(); //displays the displayGrid
    }//main
    
}//ZhenHunters class
