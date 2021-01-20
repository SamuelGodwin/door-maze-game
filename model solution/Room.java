
public class Room {

	private String name;
	private Room blueDoorRoom;
	private Room redDoorRoom;
	private boolean containsMonster;
	private boolean isFinalRoom;
	
	public Room(String name) {
		
		this.name = name;
		
	}
	
	public String getName() {
		
		return name;
		
	}
	
	public void setBlueDoorRoom(Room blueDoorRoom) {
		
		this.blueDoorRoom = blueDoorRoom;
		
	}
	
	public void setRedDoorRoom(Room redDoorRoom) {
		
		this.redDoorRoom = redDoorRoom;
		
	}
	
	public void setContainsMonster() {
		
		this.containsMonster = true;
		
	}
	
	public boolean getContainsMonster() {
		
		return containsMonster;
		
	}
		
	public void setFinalRoom() {
		
		this.isFinalRoom = true;
		
	}
	
	public boolean getFinalRoom() {
		
		return isFinalRoom;
		
	}
	
	public Room getBlueDoorRoom() {
		
		return blueDoorRoom;
		
	}
	
	public Room getRedDoorRoom() {
		
		return redDoorRoom;
		
	}
	
	
}
