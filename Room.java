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

	private String name = "";
	private Room blueDoorRoom;
	private Room redDoorRoom;
	private boolean containsMonster = false;	
	private boolean isFinalRoom = false;

	/**
	*	Defines 'Room' method. This is the constructor method for objects of the 'Room' class. 
	*	Use of 'this' keyword avoids naming conflicts between the passed parameters and fields of the class.
	*/
	public Room(String name){
		this.name = name;
	}
	
	public void setBlueDoorRoom(Room blueDoorRoom){
		this.blueDoorRoom = blueDoorRoom;
	}	

	public void setRedDoorRoom(Room redDoorRoom){
		this.redDoorRoom = redDoorRoom;
	}
	
	public void setContainsMonster(boolean containsMonster){
		this.containsMonster = containsMonster;
	}
	
	public void setIsFinalRoom(boolean isFinalRoom){
		this.isFinalRoom = isFinalRoom;
	}
	
	public boolean getIsFinalRoom(){
		return isFinalRoom;
	}	

	public Room getBlueDoorRoom(){
		return blueDoorRoom;
	}	
	
	public Room getRedDoorRoom(){
		return redDoorRoom;
	}
	
	public boolean getContainsMonster(){
		return containsMonster;
	}
	
	public String getName(){
		return name;
	}
}
