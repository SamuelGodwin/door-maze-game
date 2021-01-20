
public class Player {

	private String name;
	private int lives;
	private Room currentRoom;
	
	public Player(int lives, Room currentRoom) {

		this.lives = lives;
		this.currentRoom = currentRoom;
		
	}
	
	public void setName(String name) {
		
		this.name = name;
		
	}
	
	public String getName() {
		
		return name;
		
	}
	
	public int getLives() {
		
		return lives;
		
	}
	
	public Room getCurrentRoom() {
		
		return currentRoom;
		
	}

	public boolean move(Room suppliedRoom) {
		
		if ( suppliedRoom.getContainsMonster() ) {
			
			lives--;
			return false;
			
		} else {
			
			currentRoom = suppliedRoom;
			return true;
			
		}
		
	}
	
}
