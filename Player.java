/**
 *
 *	Creates 'Player' class. This class contains a definition of its constructor method, 'Player' as well as methods 
 *	'move', 'setCurrentRoom', 'setName', 'getCurrentRoom', 'getLives' and 'getName'.
 *	This class also contains fields: 'name' of type 'String', 'lives' of type 'int', 'currentRoom' of type 'Room' and 'outcome' of type 'boolean'.
 *	'getCurrentRoom', 'getLives' and 'getName' are accessor methods for the 'currentRoom', 'lives' and 'name' fields respectively.
 *	'setCurrentRoom' and 'setName' are mutator methods for the 'currentRoom' and 'name' fields respectively.
 *	This class and its methods are public, so are accessible anywhere.
 *
 */
 public class Player{
	
	private String name = "";
	private int lives;
	private Room currentRoom;
	private boolean outcome;

	/**
	*	Defines 'Player' method. This is the constructor method for objects of the 'Player' class. 
	*	Uses two parameters of types 'int' and 'Room', respectively, so that upon creation of a 'Player' object, the values of 'lives' and 'currentRoom', passed from the driver 
	*	class, can be assigned to fields within this class.
	*	Use of 'this' keyword avoids naming conflicts between the passed parameters and fields of the class.
	*/
	public Player(int lives, Room currentRoom){
		this.lives = lives;
		this.currentRoom = currentRoom;
	}
	
	/**
	*	Defines 'move' method. This method uses a parameter 'nextRoom', of type 'Room', to either move an instance of 'Player' into a new room, or lose a life.
	*	The method returns a variable of 'boolean' type, 'outcome', which is a field in this class.
	*/
	public boolean move(Room nextRoom){
		if (nextRoom.getContainsMonster() == true){	
			System.out.println("\nA MONSTER COMES OUT OF THE DOOR AND ATTACKS YOU! You lose 1 life.");
			lives -= 1;
			//	'outcome' field is set to false to indicate that the user made an incorrect choice.
			outcome = false;
		}
		else {
			System.out.println("\nYou enter the door safely!");
			currentRoom = nextRoom;
			//	'outcome' field is set to true to indicate that the user made a correct choice.
			outcome = true;
		}
		
		return outcome;
	}

	/**
	*.
	*/
	public void setCurrentRoom(Room currentRoom){
		this.currentRoom = currentRoom;
	}
	
	/**
	*
	*/
	public void setName(String name){
		this.name = name;
	}
	
	/**
	* 
	*/
	public Room getCurrentRoom(){
		return currentRoom;
	}
	
	/**
	* 
	*/
	public int getLives(){
		return lives;
	}
	
	/**
	* 
	*/
	public String getName(){
		return name;
	}
}