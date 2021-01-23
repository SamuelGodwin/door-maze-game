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
	
		Scanner in = new Scanner(System.in);
		

		Room monsterRoom = new Room("The Monster Room");
		monsterRoom.setContainsMonster(true);
			
		Room room1 = new Room("Cave One");
			
		Room room2 = new Room("Cave Two");

		Room room3 = new Room("Cave Three");

		Room room4 = new Room("Cave Four");
			
		Room room5 = new Room("Cave Five");
			
		Room room6 = new Room("Cave Six");
		
		room1.setBlueDoorRoom(room2); 
		room1.setRedDoorRoom(monsterRoom);
		
		room2.setBlueDoorRoom(monsterRoom);
		room2.setRedDoorRoom(room3);
		
		room3.setBlueDoorRoom(room4);
		room3.setRedDoorRoom(monsterRoom);
		
		room4.setBlueDoorRoom(monsterRoom);
		room4.setRedDoorRoom(room5);
		
		room5.setBlueDoorRoom(room6);
		room5.setRedDoorRoom(monsterRoom);
		
		//	Sets the value of the 'isFinalRoom' field for 'room6' to true. There are no further rooms. 		
		room6.setIsFinalRoom(true);
		
		// 2 is the player's maximum number of lives.
		Player player = new Player(2, room1);
			
		System.out.println("+-------------------------------------------------------------------------------------------------------------------+");
		System.out.println("| DOOR MAZE GAME. CHOOSE EITHER THE RED OR BLUE DOOR IN EACH ROOM TO ATTEMPT TO ENTER THE NEXT ROOM. AVOID MONSTER! |");
		System.out.println("+-------------------------------------------------------------------------------------------------------------------+");

		System.out.println("\nEnter name:");
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
			if(nextRoom.equals("red")){
				/*	Player tries to enter door. Prints results of outcome from the 'move' method inside 'Player' class (false is failure, true is success) after.
				 *	The parameter passed to 'move' is the 'Room' object which is now inside 'blueDoorRoom' or 'redDoorRoom, from the room the player is currently in.
				 *	If the value of 'outcome' returned at the end of the 'move' method (in 'Player') is true, they made the correct choice.	*/
				if (player.move(player.getCurrentRoom().getRedDoorRoom()) == true){
					System.out.println("\nThis was the correct choice.");
				}
				else {
					System.out.println("\nThis was not the correct choice.");
				}
			}
			
			else if(nextRoom.equals("blue")){
				/*	Player tries to enter door. Prints results of outcome from the 'move' method inside 'Player' class (false is failure, true is success) after.
				 *	The parameter passed to 'move' is the 'Room' object which is now inside 'blueDoorRoom' or 'redDoorRoom, from the room the player is currently in.
				 *	If the value of 'outcome' returned at the end of the 'move' method (in 'Player') is true, they made the correct choice.	*/
				if (player.move(player.getCurrentRoom().getBlueDoorRoom()) == true){
				//player.move(blueDoorRoom);	
					System.out.println("\nThis was the correct choice.");
				}
				else {
					System.out.println("\nThis was not the correct choice.");
				}
			}
			
			else {
				System.out.println("Must enter either 'red' or 'blue' this means to either enter through the red door or blue door from the current room");
			}
			
		//	While it is not the end of the game (i.e. player has not reached final room yet and still has lives remaining)...
		} while (player.getCurrentRoom().getIsFinalRoom() == false && player.getLives() != 0);
		
		//	Ensures that when the player's lives reach 0, they lose the game. The above loop has already ended if lives have reached 0, or if the player has reached the final room.
		if(player.getLives() == 0){
			System.out.println("\n+------------------------------------------+");
			System.out.println("| You have lost all your lives - YOU LOSE. |");
			System.out.println("+------------------------------------------+");

		}
		else {
			System.out.println("\n+-----------------------------------------------+");
			System.out.println("| You find yourself in the final room! YOU WIN! |");
			System.out.println("+-----------------------------------------------+");

		}
				
		//	Compiling this code will result in a warning unless I call the close method on my Scanner instance.
		in.close();
	}
}