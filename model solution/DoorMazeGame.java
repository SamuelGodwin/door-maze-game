import java.util.Scanner;

public class DoorMazeGame {

	public static void main(String[] args) {
		
		Room monsterRoom = new Room("The Monster Room");
		monsterRoom.setContainsMonster();
		
		Room room1 = new Room("The First Room");
		
		Room room2 = new Room("The Second Room");
		
		Room room3 = new Room("The Third Room");
		
		Room room4 = new Room("The Fourth Room");
		
		Room room5 = new Room("The Fifth Room");
		
		Room room6 = new Room("The Sixth Room");
		room6.setFinalRoom();
		
		room1.setBlueDoorRoom(monsterRoom);
		room1.setRedDoorRoom(room2);
		
		room2.setBlueDoorRoom(room3);
		room2.setRedDoorRoom(monsterRoom);
		
		room3.setBlueDoorRoom(monsterRoom);
		room3.setRedDoorRoom(room4);
		
		room4.setBlueDoorRoom(monsterRoom);
		room4.setRedDoorRoom(room5);
		
		room5.setBlueDoorRoom(room6);
		room5.setRedDoorRoom(monsterRoom);
		
		Player player = new Player(2, room1);
		
		System.out.println("Welcome! You know what to do!");
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter your name:");
		player.setName(in.next());
		
		player.setName("Martin");
		
		while ( player.getLives() > 0 && player.getCurrentRoom().getFinalRoom() != true ) {
			
			System.out.println("Game status:");
			System.out.println("Your name: " + player.getName());
			System.out.println("Lives left: " + player.getLives());
			System.out.println("Current room: " + player.getCurrentRoom().getName());
			
			System.out.println("What is your choice of door? Enter blue or red");
			
			String doorChoice = in.next();
			
			if ( doorChoice.toLowerCase().equals("blue") ) {
				
				if ( player.move(player.getCurrentRoom().getBlueDoorRoom()) ) {
					
					System.out.println("Moved to: " + player.getCurrentRoom().getName());
					
				} else {
					
					System.out.println("Uh oh, found a monster, new lives: " + player.getLives());
					
				}
				
			} else if ( doorChoice.toLowerCase().equals("red") ) {
				
				if ( player.move(player.getCurrentRoom().getRedDoorRoom()) ) {
					
					System.out.println("Moved to: " + player.getCurrentRoom().getName());
					
				} else {
					
					System.out.println("Uh oh, found a monster, new lives: " + player.getLives());
					
				}
				
			} else {
				
				System.out.println("Sorry your input was not recognised.");
				
			}
			
		}
		
		if ( player.getCurrentRoom().getFinalRoom() == true) {
			
			System.out.println("Finished the game");
			
		} else {
			
			System.out.println("Lost the game :-(");
			
		}
		
		in.close();
		
	}
	
}
