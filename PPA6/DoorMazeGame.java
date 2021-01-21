// Imports 'Scanner' class.
import java.util.Scanner;

/**
 *
 *	Creates 'DoorMazeGame' class. This is the driver class for my solution. It contains my 'main' method.
 *	This  class is the only class that is to be compiled and run directly, as the compiler will automatically compile my other referenced classes.
 *	This class and its method are public, so are accessible anywhere.	
 *
 */
public class DoorMazeGame {

 	/**
	*	Defines 'main' method. The main purpose of this method is to control objects my 'Room' class and my 'Player' class. 
	*	These objects are 'monsterRoom', 'room1', 'room2', 'room3', 'room4', 'room5', 'room6' and 'player'.
	*	I also create an object 'in', which is a copy of the 'Scanner' class from Java's Class Library, for user input.
	*	This method is 'void' since it does not return anything.	
	*/
	public static void main(String[] args){		
	
		// Constructs a scanner object.
		Scanner in = new Scanner(System.in);
		
		/*	Creates an object of 'Room' called 'monsterRoom'.
		 *	Passes the name "The Monster Room" as a parameter.	*/
		Room monsterRoom = new Room("The Monster Room");
		//	Sets value of 'containsMonster' field for 'monsterRoom' object to true.
		monsterRoom.setContainsMonster(true);
			
		/*	Creates an object of 'Room' called 'room1'.
		 *	Passes the name "Cave One" as a parameter.	*/
		Room room1 = new Room("Cave One");
			
		/*	Creates an object of 'Room' called 'room2'.
		 *	Passes the name "Cave Two" as a parameter.	*/
		Room room2 = new Room("Cave Two");

		/*	Creates an object of 'Room' called 'room3'.
		 *	Passes the name "Cave Three" as a parameter.	*/
		Room room3 = new Room("Cave Three");

		/*	Creates an object of 'Room' called 'room4'.
		 *	Passes the name "Cave Four" as a parameter.	*/
		Room room4 = new Room("Cave Four");
			
		/*	Creates an object of 'Room' called 'room5'.
		 *	Passes the name "Cave Five" as a parameter.	*/
		Room room5 = new Room("Cave Five");
			
		/*	Creates an object of 'Room' called 'room6'.
		 *	Passes the name "Cave Six" as a parameter.	*/
		Room room6 = new Room("Cave Six");
		
		//	These mutator methods can only be used after my room objects are created. These lines of code now pass those objects as parameters.
		//	Sets the value of the 'blueDoorRoom' field for 'room1' by passing an object to it ('room2') through the 'setBlueDoorRoom' method. 
		room1.setBlueDoorRoom(room2); 
		//	Sets the value of the 'redDoorRoom' field for 'room1' by passing an object to it ('monsterRoom') through the 'setRedDoorRoom' method. 		
		room1.setRedDoorRoom(monsterRoom);
		
		//	Sets the value of the 'blueDoorRoom' field for 'room2' by passing an object to it ('monsterRoom') through the 'setBlueDoorRoom' method. 
		room2.setBlueDoorRoom(monsterRoom);
		//	Sets the value of the 'redDoorRoom' field for 'room2' by passing an object to it ('room3') through the 'setRedDoorRoom' method. 		
		room2.setRedDoorRoom(room3);
		
		//	Sets the value of the 'blueDoorRoom' field for 'room3' by passing an object to it ('room4') through the 'setBlueDoorRoom' method. 
		room3.setBlueDoorRoom(room4);
		//	Sets the value of the 'redDoorRoom' field for 'room3' by passing an object to it ('monsterRoom') through the 'setRedDoorRoom' method. 		
		room3.setRedDoorRoom(monsterRoom);
		
		//	Sets the value of the 'blueDoorRoom' field for 'room4' by passing an object to it ('monsterRoom') through the 'setBlueDoorRoom' method. 
		room4.setBlueDoorRoom(monsterRoom);
		//	Sets the value of the 'redDoorRoom' field for 'room4' by passing an object to it ('room5') through the 'setRedDoorRoom' method. 		
		room4.setRedDoorRoom(room5);
		
		//	Sets the value of the 'blueDoorRoom' field for 'room5' by passing an object to it ('room6') through the 'setBlueDoorRoom' method. 
		room5.setBlueDoorRoom(room6);
		//	Sets the value of the 'redDoorRoom' field for 'room5' by passing an object to it ('monsterRoom') through the 'setRedDoorRoom' method. 		
		room5.setRedDoorRoom(monsterRoom);
		
		//	Sets the value of the 'isFinalRoom' field for 'room6' to true. There are no further rooms. 		
		room6.setIsFinalRoom(true);
		
		/*	Creates an object of 'Player' called 'player'.
		 *	Passes the value 2, of type 'int' and also one of the objects created above, 'room1', as parameters. 'room1' is the room the 'player' starts in.	
		 *	2 is the player's maximum number of lives.	*/
		Player player = new Player(2, room1);
			
		//	Prints introductory message to user (in a box) informing them of the game rules. 
		System.out.println("+-------------------------------------------------------------------------------------------------------------------+");
		System.out.println("| DOOR MAZE GAME. CHOOSE EITHER THE RED OR BLUE DOOR IN EACH ROOM TO ATTEMPT TO ENTER THE NEXT ROOM. AVOID MONSTER! |");
		System.out.println("+-------------------------------------------------------------------------------------------------------------------+");

		//	Prints message asking user to enter name for Scanner.
		System.out.println("\nEnter name:");
		//	Takes 'String' input from user, and sets it to the 'name' field in the 'player' object
		player.setName(in.nextLine());
		
		//	Start of 'do while' loop. I choose this loop as the contents of the loop always have to run at least once. This loop repeatedly asks the user to input their choice of door.
		do {
			//	Presents status of the game to the user. Prints player's name on screen, number of lives left, and details of the current room they are in.
			System.out.println("\n*+-----------------------------------------------------------------------------------------------------------+*");
			System.out.println("\tPLAYER NAME: " + player.getName() + "\t|\tLIVES REMAINING: " + player.getLives() + "\t|\tCURRENT ROOM: " + player.getCurrentRoom().getName() + "\t");
	 		System.out.println("*+-----------------------------------------------------------------------------------------------------------+*");

		
			//	Asks the user to input their choice of door, either "blue" or "red".
			System.out.println("\nPlease input your choice of door, either 'blue' or 'red':");
			//	Makes a variable that stores 'String' type input from the user, for comparison in the next couple of lines.
			String nextRoom = in.nextLine();
			//	If the input stored in the above variable is equal to "red", then the user chose the red door in the room. Therefore...
			if(nextRoom.equals("red")){
				/*	Player tries to enter door. Prints results of outcome from the 'move' method inside 'Player' class (false is failure, true is success) after.
				 *	The parameter passed to 'move' is the 'Room' object which is now inside 'blueDoorRoom' or 'redDoorRoom, from the room the player is currently in.
				 *	If the value of 'outcome' returned at the end of the 'move' method (in 'Player') is true, they made the correct choice.	*/
				if (player.move(player.getCurrentRoom().getRedDoorRoom()) == true){
					//	Informs the user they have made the correct choice.
					System.out.println("\nThis was the correct choice.");
				}
				else {
					//	Informs the user they have made the incorrect choice.
					System.out.println("\nThis was not the correct choice.");
				}
			}
			
			//	If the input stored in the above variable is equal to "blue", then the user chose the blue door in the room. Therefore...
			else if(nextRoom.equals("blue")){
				/*	Player tries to enter door. Prints results of outcome from the 'move' method inside 'Player' class (false is failure, true is success) after.
				 *	The parameter passed to 'move' is the 'Room' object which is now inside 'blueDoorRoom' or 'redDoorRoom, from the room the player is currently in.
				 *	If the value of 'outcome' returned at the end of the 'move' method (in 'Player') is true, they made the correct choice.	*/
				if (player.move(player.getCurrentRoom().getBlueDoorRoom()) == true){
				//player.move(blueDoorRoom);	
					//	Informs the user they have made the correct choice.
					System.out.println("\nThis was the correct choice.");
				}
				else {
					//	Informs the user they have made the incorrect choice.
					System.out.println("\nThis was not the correct choice.");
				}
			}
			
			else {
				// Any other input from the user should result in a message being output stating the acceptable commands they can enter, along with their meaning. 
				System.out.println("Must enter either 'red' or 'blue' this means to either enter through the red door or blue door from the current room");
			}
			
		//	While it is not the end of the game (i.e. player has not reached final room yet and still has lives remaining)...
		} while (player.getCurrentRoom().getIsFinalRoom() == false && player.getLives() != 0);
		
		//	Ensures that when the player's lives reach 0, they lose the game. The above loop has already ended if lives have reached 0, or if the player has reached the final room.
		if(player.getLives() == 0){
			//	Player loses.
			System.out.println("\n+------------------------------------------+");
			System.out.println("| You have lost all your lives - YOU LOSE. |");
			System.out.println("+------------------------------------------+");

		}
		else {
			//	Player wins.
			System.out.println("\n+-----------------------------------------------+");
			System.out.println("| You find yourself in the final room! YOU WIN! |");
			System.out.println("+-----------------------------------------------+");

		}
				
		//	Compiling this code will result in a warning unless I call the close method on my Scanner instance.
		in.close();
	}
}