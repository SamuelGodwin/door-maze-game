/**
 *
 *	Creates 'Room' class. This class contains a definition of its constructor method, 'Room' as well as methods 
 *	'setBlueDoorRoom', 'setRedDoorRoom', 'setContainsMonster', 'setIsFinalRoom', 'getIsFinalRoom', 'getBlueDoorRoom', 'getRedDoorRoom', 'getContainsMonster' and 'getName'.
 *	This class also contains fields: 'name' of type 'String', 'blueDoorRoom' of type 'Room', 'redDoorRoom' of type 'Room', 'containsMonster' of type 'boolean' and 'outcome' 
 *	of type 'boolean'.
 *	'getIsFinalRoom', 'getBlueDoorRoom', 'getRedDoorRoom', 'getContainsMonster' and 'getName' are accessor methods for the 'isFinalRoom', 'blueDoorRoom', 'redDoorRoom',
 *	'containsMonster' and 'name' fields respectively.
 *	'setBlueDoorRoom', 'setRedDoorRoom', 'setContainsMonster' and 'setIsFinalRoom' are mutator methods for the 'blueDoorRoom', 'redDoorRoom', 'containsMonster' and 'isFinalRoom' 
 *	fields respectively.
 *	This class and its methods are public, so are accessible anywhere.
 *
 */
 public class Room{

	// 	Private field of type 'String' which stores the name of a 'Room' object. Set as "" as it does not have a default value.
	private String name = "";
	//	Private field of type 'Room' which stores a 'Room' object.
	private Room blueDoorRoom;
	//	Private field of type 'Room' which stores a 'Room' object.
	private Room redDoorRoom;
	//	Private field of type 'boolean' which stores whether or not a room contains a monster. Default 'false' as only set to 'true' for monster room.
	private boolean containsMonster = false;	
	//	Private field of type 'boolean' which stores whether or not a room is the final room. Default 'false' as it will only need to be set to 'true' at the end.
	private boolean isFinalRoom = false;

	/**
	*	Defines 'Room' method. This is the constructor method for objects of the 'Room' class. 
	*	Uses one parameter of type 'String' so that upon creation of a 'Room' object, the value of 'name', passed from the driver  class, can be assigned to fields within this 
	*	class.
	*	Use of 'this' keyword avoids naming conflicts between the passed parameters and fields of the class.
	*/
	public Room(String name){
		//	Sets 'name' field to value passed as parameter for name
		this.name = name;
	}
	
	/**
	*	'setBlueDoorRoom' method. This is a mutator method for the 'blueDoorRoom' field in this class. It uses a parameter of type 'Room'.
	*	Use of 'this' keyword avoids naming conflicts.
	*/
	public void setBlueDoorRoom(Room blueDoorRoom){
		//	Sets 'blueDoorRoom' field to value passed as parameter for blueDoorRoom
		this.blueDoorRoom = blueDoorRoom;
	}	

	/**
	*	'setRedDoorRoom' method. This is a mutator method for the 'redDoorRoom' field in this class. It uses a parameter of type 'Room'.
	*	Use of 'this' keyword avoids naming conflicts.
	*/
	public void setRedDoorRoom(Room redDoorRoom){
		//	Sets 'redDoorRoom' field to value passed as parameter for redDoorRoom
		this.redDoorRoom = redDoorRoom;
	}
	
	/**
	*	'setContainsMonster' method. This is a mutator method for the 'containsMonster' field in this class. It uses a parameter of type 'boolean'.
	*	Use of 'this' keyword avoids naming conflicts.
	*/
	public void setContainsMonster(boolean containsMonster){
		//	Sets 'containsMonster' field to value passed as parameter for containsMonster
		this.containsMonster = containsMonster;
	}
	
	/**
	*	'setIsFinalRoom' method. This is a mutator method for the 'isFinalRoom' field in this class. It uses a parameter of type 'boolean'.
	*	Use of 'this' keyword avoids naming conflicts.
	*/
	public void setIsFinalRoom(boolean isFinalRoom){
		//	Sets 'isFinalRoom' field to value passed as parameter for isFinalRoom
		this.isFinalRoom = isFinalRoom;
	}
	
	/**
	*	'getIsFinalRoom' method. This is the accessor method for the 'isFinalRoom' field of type 'boolean' within this class. 
	*/
	public boolean getIsFinalRoom(){
		//	Returns isFinalRoom
		return isFinalRoom;
	}	
	
	/**
	*	'getBlueDoorRoom' method. This is the accessor method for the 'blueDoorRoom' field of type 'Room' within this class. 
	*/
	public Room getBlueDoorRoom(){
		//	Returns blueDoorRoom
		return blueDoorRoom;
	}	
	
	/**
	*	'getRedDoorRoom' method. This is the accessor method for the 'redDoorRoom' field of type 'Room' within this class. 
	*/
	public Room getRedDoorRoom(){
		//	Returns redDoorRoom
		return redDoorRoom;
	}
	
	/**
	*	'getContainsMonster' method. This is the accessor method for the 'containsMonster' field of type 'boolean' within this class. 
	*/
	public boolean getContainsMonster(){
		//	Returns containsMonster
		return containsMonster;
	}
	
	/**
	*	'getName' method. This is the accessor method for the 'name' field of type 'String' within this class. 
	*/
	public String getName(){
		//	Returns name
		return name;
	}
}
