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
	
	// 	Private field of type 'String' which stores the name of a 'Player' object. Set as "" as it does not have a default value.
	private String name = "";
	//	Private field of type 'int' which stores number of lives left.
	private int lives;
	//	Private field of type 'Room'. Stores the current room a player is in.
	private Room currentRoom;
	//	Private field of type 'boolean' which stores whether or not a player made the correct decision when choosing a door.
	private boolean outcome;

	/**
	*	Defines 'Player' method. This is the constructor method for objects of the 'Player' class. 
	*	Uses two parameters of types 'int' and 'Room', respectively, so that upon creation of a 'Player' object, the values of 'lives' and 'currentRoom', passed from the driver 
	*	class, can be assigned to fields within this class.
	*	Use of 'this' keyword avoids naming conflicts between the passed parameters and fields of the class.
	*/
	public Player(int lives, Room currentRoom){
		//	Sets 'lives' field to value passed as parameter for lives
		this.lives = lives;
		//	Sets 'currentRoom' field to value passed as parameter for currentRoom
		this.currentRoom = currentRoom;
	}
	
	/**
	*	Defines 'move' method. This method uses a parameter 'nextRoom', of type 'Room', to either move an instance of 'Player' into a new room, or lose a life.
	*	The method returns a variable of 'boolean' type, 'outcome', which is a field in this class.
	*/
	public boolean move(Room nextRoom){
		//	If the room behind the door the user chooses contains a monster...
		if (nextRoom.getContainsMonster() == true){	
			//	Informs the user of the consequences of their choice.
			System.out.println("\nA MONSTER COMES OUT OF THE DOOR AND ATTACKS YOU! You lose 1 life.");
			//	Takes away 1 life.
			lives -= 1;
			//	'outcome' field is set to false to indicate that the user made an incorrect choice.
			outcome = false;
		}
		else {
			//	Informs the user of the consequences of their choice.
			System.out.println("\nYou enter the door safely!");
			//	Sets the room behind the door the user chose as the new current room.
			currentRoom = nextRoom;
			//	'outcome' field is set to true to indicate that the user made a correct choice.
			outcome = true;
		}
		
		//	Returns a result stating if the supplied room was the correct choice or not; a boolean where false means incorrect choice, true means correct choice
		return outcome;
	}

	/**
	*	'setCurrentRoom' method. This is a mutator method for the 'currentRoom' field in this class. It uses a parameter of type 'Room'.
	*	Use of 'this' keyword avoids naming conflicts.
	*/
	public void setCurrentRoom(Room currentRoom){
		//	Sets 'currentRoom' field to value passed as parameter for currentRoom
		this.currentRoom = currentRoom;
	}
	
	/**
	*	'setName' method. This is a mutator method for the 'name' field in this class. It uses a parameter of type 'String'.
	*	Use of 'this' keyword avoids naming conflicts.
	*/
	public void setName(String name){
		//	Sets 'name' field to value passed as parameter for name
		this.name = name;
	}
	
	/**
	*	'getCurrentRoom' method. This is the accessor method for the 'currentRoom' field of type 'Room' within this class. 
	*/
	public Room getCurrentRoom(){
		//	Returns currentRoom
		return currentRoom;
	}
	
	/**
	*	'getLives' method. This is the accessor method for the 'lives' field of type 'int' within this class. 
	*/
	public int getLives(){
		//	Returns lives
		return lives;
	}
	
	/**
	*	'getName' method. This is the accessor method for the 'name' field of type 'String' within this class. 
	*/
	public String getName(){
		//	Returns name
		return name;
	}
}